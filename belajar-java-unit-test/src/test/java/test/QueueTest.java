package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;

import java.util.LinkedList;
import java.util.Queue;
import org.junit.jupiter.api.*;

@DisplayName("A Queue")
public class QueueTest {
	
	private Queue<String> queue;
	
	@Nested
	@DisplayName("when new")
	public class WhenNew {
		
		@BeforeEach
		void setUp() {
			queue = new LinkedList<>();
		}
		
		@Test
		@DisplayName("when offer, size must be 1")
		void offerNewData() {
			queue.offer("Afif");
			Assertions.assertEquals(1, queue.size());
		}
		
		@Test
		@DisplayName("when offer 2 data, size must be 2")
		void offerMoreData() {
			queue.offer("Afif");
			queue.offer("Faizun");
			Assertions.assertEquals(2, queue.size());
		}
	}
}
