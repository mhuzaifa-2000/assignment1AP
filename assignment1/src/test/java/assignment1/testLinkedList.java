package assignment1;

import org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


import org.junit.Test;

import com.sun.tools.javac.util.Assert;

public class testLinkedList {
	private LinkedList list;
	
	@Before
	public void init() {
		list = new LinkedList();
		
	}
	
	@Test
	public void testPushOne() {
		list.pushFront(21);
		assertEquals(list.size, 1);
	}
	@Test
	public void testPushMany() {
		
		
		for(int i=0; i<=200; i++)
		{
			list.pushBack(i);
		}
		LinkedList.Node temp = list.head;
		for(int i=0; i<=200; i++)
		{
			assertEquals(temp.key, i);
			temp=temp.next;
		}
		assertEquals(list.size, 201);
	}
	@Test
	public void testPopMany() {
		for(int i=0; i<=200; i++)
		{
			list.pushBack(i);
		}
		for(int i=0; i<=200; i++)
		{
			list.popBack();
		}
		assertEquals(list.size, 0);
	}
	@Test
	public void testPopSome() {
		for(int i=0; i<200; i++)
		{
			list.pushBack(i);
		}
		for(int i=0; i<50; i++)
		{
			list.popBack();
		}
		assertEquals(list.size,150);
		LinkedList.Node temp = list.head;
		for(int i=0; i<list.size; i++)
		{
			assertEquals(temp.key, i);
			temp=temp.next;
		}
	}
	@Test
	public void testPushFront() {
		for(int i=0; i<200; i++)
		{
			list.pushFront(i);
		}
		LinkedList.Node temp = list.head;
		for(int i=199; i>=0; i--) {
			assertEquals(i,temp.key);
			temp=temp.next;
		}
	}
	
	@Test
	public void pushFrontandBack() {
		for(int i=1; i<=200; i++)
		{
			list.pushBack(i);
		}
		for(int i=201; i<=400; i++)
		{
			list.pushFront(i);
		}
		LinkedList.Node temp = list.head;
		
		for(int i=400; i>=201; i--)
		{
			
			assertEquals(i,temp.key);
			temp=temp.next;
		}
		for(int i=1; i<=200; i++)
		{
			
			assertEquals(i,temp.key);
			temp=temp.next;
		}
	}
	
	@Test
	public void testPoponEmptyList() {
		list.pop(24);
		list.popBack();
		list.popFront();
		for(int i=0; i<100; i++)
		{
			list.pop(i);
		}

	}
	@Test
	public void testDisplay() {
		for(int i=1; i<=200; i++)
		{
			list.pushBack(i);
		}
		list.display();
	}
	
	
	@Test 
	public void testMultiplePop() {
		for(int i=1; i<=200; i++)
		{
			list.pushBack(i);
		}
		for(int i=1; i<=200; i++)
		{
			list.popFront();
		}
	}
	@Test 
	public void testPop() {
		for(int i=1; i<=200; i++)
		{
			list.pushBack(i);
		}
		for(int i=1; i<=200; i++)
		{
			list.pop(0);
		}
		assertEquals(0,list.size);
	}
	@Test
	public void testPopInMiddle() {
		list.pushBack(0);
		list.pushBack(0);
		list.pushBack(0);
		list.pushBack(0);
		list.pop(3);
		assertEquals(3,list.size);
	}
	@Test
	public void displayEmpty() {
		list.display();
	}
}
