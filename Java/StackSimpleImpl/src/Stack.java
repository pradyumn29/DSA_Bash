
public class Stack {
	private int[] StackArray;
	private int top;
	private int capacity;
	
	public Stack(int capacity) {
		StackArray=new int[capacity];
		this.top=-1;
		this.capacity=capacity;
		
	}
	
	public boolean isEmpty() {
		return top==-1;
	}
	
	public boolean isFull() {
		return top==capacity-1;
	}
	
	public void push(int data) {
		if(isFull()) {
			System.out.println("list fulll");
		}
		StackArray[++top]=data;
	}

	public int pop() {
		if(isEmpty()) {
			System.out.println("is empty");
		}
		return StackArray[top--];
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("is Empty");
		}
		return StackArray[top];
	}
}
