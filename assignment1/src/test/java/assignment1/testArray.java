package assignment1;

import static org.junit.Assert.*;

import org.junit.*;

public class testArray {
	Array array;
	
	//Initialize the array
	@Before
	public void init() {
		array = new Array();
		int size=array.size;
	}
	
	
	@Test
	public void testInput100Elements() {
		
		for(int i=0; i<100; i++)
		{
			array.insert(i, i);
		}
		
	
	}
	
	//This test case fails due to array index out of bound
	@Test
	public void testInput101Elements() {
		try {
			for(int i=0; i<101; i++)
			{
				array.insert(i, i);
			}
			for(int i=0; i<101; i++)
			{
				assertEquals(array.array[i],i);
			}
		}catch (Exception e) {
			fail("Test Case failed, Out of bound");
		}
		
	}
	
	@Test
	public void testBubbleSort() {
		int x=0;
		for(int i=99; i>=0; i--)
		{
			array.insert(i,x);
			x++;
		}
		array.bubbleSort();
		for(int i=0; i<100; i++)
		{
		
			assertEquals(i, array.array[i]);
		}
	}
	@Test 
	public void testInsert()
	{
		try {
			array.insert(54,101);
			assertEquals(1, array.size);
		}catch(Exception e) {
			fail("Array index out of bound, test case failed");
		}
		
	}
	@Test
	public void testBinarySearch()
	{
		array.insert(44, 12);
		array.binarySearch(44, 1, 55);
	}
	
	@Test
	public void testDelete()
	{
		for(int i=0; i<10; i++)
		{
			array.insert(i, i);
		}
		array.delete(5);
		
		assertEquals(9,array.size);
		
	}
//	@Test 
//	public void testGetValues() {
//		for(int i=0; i<10; i++) {
//			array.insert(i, i);
//		}
//		array.getValues();
//		assertEquals(1,1);
//	}
	@Test
	public void testDisplay() {
		for(int i=0; i<10; i++) {
			array.insert(i, i);
		}
		array.display();
		assertEquals(10,array.size);
	}
	
	@Test 
	public void testLinearSearch() {
		for(int i=0; i<10; i++) {
			array.insert(i, i);
		}
		assertTrue(array.linearSearch(5));
		assertFalse(array.linearSearch(99));
	}
	
}
