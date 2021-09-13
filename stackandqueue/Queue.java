package com.stackandqueue;

public class Queue {
private Node head;
	
	private class Node {
		int data;
		Node next;
		
		Node(int data) {
			this.data = data;
			next = null;
		}
	}
	
	/**to append the elements to the queue
	 */
	public boolean enqueue(int data) {
		boolean isAdded  = false;
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			isAdded  =true;
		}else {
			Node temp = head;
			
			while(temp.next != null) {
				temp = temp.next;
			}
			
			temp.next  = newNode;
			isAdded = true;
		}
		return isAdded;
	}
	
	/**to print the element of the queue
	 */
	public void print() {
		Node temp = head;
		
		System.out.println("Queue : ");
		
		while(temp != null) {
			System.out.print(temp.data + "   ");
			temp = temp.next;
		}
	}
	/**to remove the elements
	 */
	public int dequeue() {
		if(head == null) {
			System.out.println("Queue is empty");
			return 0;
		}
		Node temp = head;
		head = temp.next;
		return temp.data;
	}
	
}
