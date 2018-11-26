package microservice.book.socialmultiplication.service;

import microservice.book.socialmultiplication.domain.Multiplication;
import microservice.book.socialmultiplication.domain.MultiplicationResultAttempt;

public interface MultiplicationService {

	
	/**
	 * Creates a Multiplication object with two randomly-generated factors between 11 and 99.
	 * @return
	 */
	Multiplication createRandomMultiplication();
	
	/**
	 * 
	 * @param resultAttempt
	 * @return Devuelve true si el resultado de la multiplicación es correcto
	 */
	boolean checkAttempt(final MultiplicationResultAttempt resultAttempt);

}
