package test;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
import org.opentest4j.TestAbortedException;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

import generator.SimpleDisplayNameGenerator;

@DisplayNameGeneration(SimpleDisplayNameGenerator.class)
//@DisplayName("Test untuk Calculator class")
public class CalculatorTest {
	
	private Calculator calculator = new Calculator();
	
	@BeforeAll
	public static void beforeAll() {
		System.out.println("Before All");
	}
	
	@AfterAll
	public static void AfterAll() {
		System.out.println("After All");
	}
	
	@BeforeEach
	public void steUp() {
		System.out.println("Before Each");
	}
	
	@AfterEach
	public void tearDown() {
		System.out.println("After Each");
	}
	
	@Test
	//@DisplayName("Test Skenario Sukses untuk Method add(integer, integer)")
	public void testAddSuccess() {
		
		int result = calculator.add(10, 10);
		
		assertEquals(20, result);
	}
	
	@Test
	public void testDivideSuccess() {
		int result = calculator.divide(100, 10);
		assertEquals(10, result);
	}
	
	@Test
	public void testDivideFailed() {
		assertThrows(IllegalArgumentException.class, () -> {
			calculator.divide(10, 0);
		});
	}
	
	@Test
	@Disabled
	public void testComingSoon() {
		
	}
	
	@Test
	public void testAborted() {
		String profile = System.getenv("PROFILE");
		if (!"DEV".equals(profile)) {
			throw new TestAbortedException("Test dibatalkan karena bukan DEV");
		}
	}
	
	@Test
	public void testAssumption() {
		assumeTrue("DEV".equals(System.getenv("PROFILE")));
	}
	
	
}
