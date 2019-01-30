package microservice.book.socialmultiplication.service;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ MultiplicationServiceImplTest.class, MultiplicationServiceTest.class,
		RandomGeneratorServiceImplTest.class, RandomGeneratorServiceTest.class })
public class AllTests {

}
