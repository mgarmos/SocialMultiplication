package microservice.book.socialmultiplication.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RandomGeneratorServiceTest {

	@Autowired
	private RandomGeneratorService randomGeneratorService;

	/*
	 * Prueba que todos los valores generados están entre 11 y 99
	 */
	@Test
	public void generateRandomFactorIsBetweenExpectedLimits() {

		// Al generar una lista de numeros aleatorios
		List<Integer> numerosAleatorios = IntStream.range(0, 1000)
				.map(i -> randomGeneratorService.generateRandomFactor()).boxed().collect(Collectors.toList());

		// Todos los valores devueltos estan entre 11 y 99
		assertThat(numerosAleatorios)
				.containsOnlyElementsOf(IntStream.range(11, 100).boxed().collect(Collectors.toList()));

	}

}
