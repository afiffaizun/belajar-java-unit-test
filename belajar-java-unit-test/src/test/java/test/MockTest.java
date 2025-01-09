package test;

import org.junit.jupiter.api.*;
import org.mockito.Mockito;

import java.util.List;
public class MockTest {
	
	@Test
	void testMock() {
		List<String> list = Mockito.mock(List.class);
		
		Mockito.when(list.get(0)).thenReturn("Afif");
		System.out.println(list.get(0));
		System.out.println(list.get(100));
	}
}
