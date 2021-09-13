package com.stackandqueue;

public class Stack {


	private Node head;
	
	private class Node {
		int data;
		Node next;
		
		Node(int data) {
			this.data = data;
			next = null;
		}
	}
	/**
	 * to push the data into the stack
	 */
	
	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
	/**
	 * to print the stack or queue
	 */
	public void print() {
		Node temp = head;
		
		System.out.println("Stack : ");
		
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	/** to pop the top element out of the stack
	 */
	public int pop() {
		if(head == null) {
			System.out.println("Stack is empty");
			return 0;
		}
		Node temp = head;
		head = temp.next;
		return temp.data;
	}
	
	/** to peek the top element of the stack
	 */
	public int peek() {
		if(head == null) {
			System.out.println("Stack is empty");
			return 0;
		}
		Node temp = head;
		return temp.data;
	}
}
