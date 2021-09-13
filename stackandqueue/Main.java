package com.stackandqueue;

public class Main {
	public static void main(String[] args) {
		StackQueue stack = new StackQueue();
		stack.push(56);
		stack.push(30);
		stack.push(70);
		
		stack.print();
		
	    stack.pop();
	    stack.print();
	    
	    int peek = stack.peek();
	    System.out.println("top element : "+peek);
	}
}
