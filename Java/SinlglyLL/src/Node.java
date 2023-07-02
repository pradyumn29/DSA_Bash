
public class Node {
	
	private int data;
	private Node next;
	
	//data parameterised constructor for creating new node containg data and reference null;
	
	public Node(int data) {
		this.next=null;
		this.data = data;
	}

    //default constructor for creating new object to create new reference by calling node class
	public Node() {
		super();
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

		

}
