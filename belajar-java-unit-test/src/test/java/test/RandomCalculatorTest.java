package test;
import org.junit.jupiter.api.*;
import java.util.Random;
import java.util.List;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.MethodSource;
public class RandomCalculatorTest extends AbstractCalculatorTest{
	
	
	@Test
	void testRandom(TestInfo info, Random random) {
		Integer a = random.nextInt();
		Integer b = random.nextInt();
		
		Integer result = calculator.add(a, b);
		Integer expected = a + b;
		
		Assertions.assertEquals(expected, result);
	}
	
	@DisplayName("Test random calculator")
	@RepeatedTest(value = 10, name = "{displayName}")
		

	void testRandomRepeatInfo(TestInfo info, Random random, RepetitionInfo repetitionInfo) {
		System.out.println(info.getDisplayName() + " ke " + repetitionInfo.getCurrentRepetition() + " dari " + repetitionInfo.getTotalRepetitions());
		Integer a = random.nextInt();
		Integer b = random.nextInt();
		
		Integer result = calculator.add(a, b);
		Integer expected = a + b;
		
		Assertions.assertEquals(expected, result);
	}
	
	@DisplayName("Test calculator")
	@ParameterizedTest(name = "{displayName} dengan parameter {0}")
	@ValueSource(ints = {1, 2, 3, 15, 31})
	void testWithParameter(int value) {
		Integer expected = value + value;
		Integer result = calculator.add(value, value);
		
		Assertions.assertEquals(expected, result);
	}
	
	public static List<Integer> parameterSource() {
		return List.of(1, 2, 4, 5, 7, 9, 10);
	}
	
	@DisplayName("Test calculator")
	@ParameterizedTest(name = "{displayName} dengan parameter {0}")
	@MethodSource({"parameterSource"})
	@ValueSource(ints = {1, 2, 3, 15, 31})
	void testWithMethodSource(Integer value) {
		Integer expected = value + value;
		Integer result = calculator.add(value, value);
		
		Assertions.assertEquals(expected, result);
	}

}
