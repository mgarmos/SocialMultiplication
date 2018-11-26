package microservice.book.socialmultiplication.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import microservice.book.socialmultiplication.domain.Multiplication;
import microservice.book.socialmultiplication.domain.MultiplicationResultAttempt;
import microservice.book.socialmultiplication.domain.User;

public class MultiplicationServiceImplTest {
	
	private MultiplicationServiceImpl multiplicationServiceImpl;
	
	@Mock
	private RandomGeneratorService randomGeneratorService;
	

	@Before
	public void setUp() throws Exception {
		
		//Inicializo para que recoja las anotaciones
		MockitoAnnotations.initMocks(this);
		this.multiplicationServiceImpl = new MultiplicationServiceImpl(randomGeneratorService);
	}

	@After
	public void tearDown() throws Exception {
	}

	/*
	 * Compruebo que si se generan el 30 y el 50, el resultado es 3000
	 */
	@Test
	public void testCreateRandomMultiplication() {
		// Given: El Mock devuelve primero 50 y después 30
		given(randomGeneratorService.generateRandomFactor()).willReturn(50, 30);
		
		// When
		Multiplication multiplication = multiplicationServiceImpl.createRandomMultiplication();

		// Then
		assertThat(multiplication.getFactorA()).isEqualTo(50);
		assertThat(multiplication.getFactorB()).isEqualTo(30);
		assertThat(multiplication.getResult()).isEqualTo(1500);

	}
	
	/*
	 * Si la multiplicacion es 50 x 60 el resultado será 3000 y el método devolverá true
	 */
	@Test
	public void checkCorrectAttemptTest() {
		//Given Dada una multiplicacion de 50 * 60 
		Multiplication multiplication = new Multiplication(50, 60);
		User user = new User("Pepe");
		MultiplicationResultAttempt attempt = new MultiplicationResultAttempt(user, multiplication, 3000);
		
		
		// when
		boolean attemptResult = multiplicationServiceImpl.checkAttempt(attempt);
		
		// assert
		assertThat(attemptResult).isTrue();
	}
	
	@Test
	public void checkWrongtAttemptTest() {
		//Given Dada una multiplicacion de 50 * 60 
		Multiplication multiplication = new Multiplication(50, 60);
		User user = new User("Pepe");
		MultiplicationResultAttempt attempt = new MultiplicationResultAttempt(user, multiplication, 3010);
		
		
		// when
		boolean attemptResult = multiplicationServiceImpl.checkAttempt(attempt);
		
		// assert
		assertThat(attemptResult).isFalse();
	}

}
