package microservice.book.socialmultiplication.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RandomGeneratorServiceImplTest {
	

	private RandomGeneratorServiceImpl randomGeneratorServiceImpl;
	
	
	@Before
	public void setUp() throws Exception {
		this.randomGeneratorServiceImpl = new RandomGeneratorServiceImpl();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void generateRandomFactorIsBetweenExpectedLimits() {
		// Al generar una lista de numeros aleatorios
		List<Integer> numerosAleatorios = IntStream.range(0, 1000)
				.map(i -> randomGeneratorServiceImpl.generateRandomFactor()).boxed().collect(Collectors.toList());

		// Todos los valores devueltos estan entre 11 y 99
		assertThat(numerosAleatorios)
				.containsOnlyElementsOf(IntStream.range(11, 100).boxed().collect(Collectors.toList()));

	}

}
