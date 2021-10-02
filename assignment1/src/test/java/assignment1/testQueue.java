package assignment1;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;


public class testQueue {
	private Queue queue;
	Queue.Node temp;
	
	
	//Initialization
	@Before
	public void init() {
		queue = new Queue();
		temp = queue.head;
	}
	@Test
	public void testEnque() {
		for(int i=0; i<100; i++) {
			queue.enqueue(i);
		}
		assertEquals(100,queue.size);
	}
	@Test
	public void testDequeue() {
		for(int i=0; i<100; i++) {
			queue.enqueue(i);
		}
		for(int i=0; i<100; i++) {
			assertEquals(i,queue.dequeue());
		}
	}
	@Test
	public void testDequeueonEmpty() {
		queue.dequeue();
		assertEquals(0,queue.size);
	}
	
	@Test
	public void testEnqueue100() {
		for(int i=0; i<100; i++) {
			queue.enqueue(i);
		}
	}
	@Test
	public void testEnqueue1000() {
		for(int i=0; i<1000; i++) {
			queue.enqueue(i);
		}
	}
	
	@Test
	public void testDequeue1000() {
		for(int i=0; i<1000; i++) {
			queue.enqueue(i);
		}
		for(int i=0; i<1000; i++) {
			assertEquals(i,queue.dequeue());
		}
		assertEquals(0,queue.size);
	}
	
	@Test 
	public void testDisplay() {
		queue.display();
		for(int i=0; i<1000; i++) {
			queue.enqueue(i);
		}
		queue.display();
	}
}
