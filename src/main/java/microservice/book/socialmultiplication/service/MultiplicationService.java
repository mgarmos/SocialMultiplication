package microservice.book.socialmultiplication.service;

import microservice.book.socialmultiplication.domain.Multiplication;

public interface MultiplicationService {

	
	/**
	 * Creates a Multiplication object with two randomly-generated factors between 11 and 99.
	 * @return
	 */
	Multiplication createRandomMultiplication();

}
