package com.stackandqueue;

public class Main {
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(56);
		stack.push(30);
		stack.push(70);
		
		stack.print();
		
	    stack.pop();
	    stack.print();
	    
	    int peek = stack.peek();
	    System.out.println("top element : "+peek);
	    
	    Queue q = new Queue();
	    q.enqueue(56);
	    q.enqueue(30);
	    q.enqueue(70);
	    q.print();
	    System.out.println();
	    
	 
	}
}
