package microservice.book.socialmultiplication.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import microservice.book.socialmultiplication.domain.Multiplication;


//@RunWith(SpringRunner.class)
//@SpringBootTest
public class RandomGeneratorServiceTest {
	
//	@MockBean
//	private RandomGeneratorService randomGeneratorService;
//	
//	@Autowired
//	private MultiplicationService multiplicationService;
//	
//	@Test
//	public void createRandomMultiplicationTest() {
//		
//		//Given: El Mock devuelve primero 50 y después 30
//		given(randomGeneratorService.generateRandomFactor()).willReturn(50,30);
//		
//		//When
//		Multiplication multiplication = multiplicationService.createRandomMultiplication();
//
//		//Then
//		assertThat(multiplication.getFactorA()).isEqualTo(50);
//		assertThat(multiplication.getFactorB()).isEqualTo(30);
//		assertThat(multiplication.getResult()).isEqualTo(1500);
//	}

}
