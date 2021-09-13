package com.stackandqueue;

public class StackQueue {


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
}
