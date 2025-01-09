package test;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.*;
import resolver.RandomParameterResolver;

@Extensions({
	@ExtendWith(RandomParameterResolver.class)
})
public class AbstractCalculatorTest {
	protected Calculator calculator = new Calculator();
	
	@BeforeEach
	void setUp() {
		System.out.println("Before each");
	}
}
