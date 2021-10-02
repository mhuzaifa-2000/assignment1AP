package assignment1;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;


public class testStack {

	private Stack stack;
	private Stack.Node temp;
	
	@Before
	public void init() {
		stack = new Stack();
		temp = stack.head;
	}
	@Test
	public void testGetSize() {
		for(int i=0; i<10; i++) {
			stack.push(i);
		}
		assertEquals(10,stack.getSize());
	}
	
	@Test 
	public void testPush() {
		for(int i=0; i<100; i++) {
			stack.push(i);
		}
		
		assertEquals(100,stack.getSize());
	}
	
	@Test 
	public void testDisplay() {
		stack.display();
		for(int i=0; i<100; i++) {
			stack.push(i);
		}
		stack.display();
	}
	
	@Test 
	public void testStackPop() {
		stack.pop();
		for(int i=0; i<100; i++) {
			stack.push(i);
		}
		for(int i=0; i<10; i++) {
			stack.pop();
		}
		assertEquals(90,stack.size);
	}
	
	@Test 
	public void testGetStackTop() {
		assertEquals(-1, stack.top());
		for(int i=0; i<100; i++) {
			stack.push(i);
		}
		assertEquals(99,stack.top());
	}
}
