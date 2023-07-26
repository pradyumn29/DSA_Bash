import java.util.Stack;

public class SinglyLL {

    private Node Head;

	public SinglyLL(){
		Head=null;
	}
    
    //insert At First
    
    public boolean insertAtFirst(int data) {
    	Node newn=new Node(data);//creating new node containing data and reference null
    	 if(Head==null) {
    		 Head=newn; //assigning new nodes reference variable to head
    		 return true;
    	 }
    	     //  Node  last=Head;
    	 newn.setNext(Head);
    	 Head=newn;
    	 return true;
		 
    	
	}
    
    public boolean insertAtLast(int data) {
    	Node newn=new Node(data);
    	
    	 if(Head==null) {
    		 Head=newn;
    	 }
    	 
    	 Node last=Head;
    	 while(last.getNext()!=null) {
    		 last=last.getNext();
    	 }
    	 
    	 last.setNext(newn);
    	
    	return true;
    }
   
    
    //insert at pos
    public boolean insertAtPos(int data,int pos) {
		Node newn=new Node(data);
		
    	if(Head==null) {
    		Head=newn;
    	}
    	
    	Node last=Head;
    
    	for(int i=0;i<pos-2;i++) {
    		
    		   last=last.getNext();
    		   
    	}
    	newn.setNext(last.getNext());
    	last.setNext(newn);
    	
    	return true;
    	
    }
    
    //Display
    
    public void Display() {
      Node display=Head;
    	if(display==null) {
    		System.out.println("no nodes available");
    	}

		while(display!=null){
	
			if(Head.getNext()!=null) {
			System.out.print(display.getData()+"--> ");
			display=display.getNext();
			}
			
		}
		System.out.print("null");
		System.out.println();
    	        
    }
    
    
    //insert at first
    public boolean deleteAtFirst() {
    	
    	if(Head==null) {
    		return true;
    	}
    	
    	Node last=Head;
    	
    	last=last.getNext();
    	Head=last;
    	
    	return true;
    }
    
    //delete at last pos
    public boolean deleteAtLast() {
    	
    	if(Head==null) {
    		return true;
    	}
    	
    	Node last=Head;
    	
    	while(last.getNext().getNext()!=null) {
    	      last=last.getNext(); 
    	}
    	
    	last.setNext(null);
    	
    	return true;
    }
    
    //delete  the  node at particular psoition
    public boolean DeleteAtpos(int pos) {
    	
    	if(Head==null) {
    		System.out.println("list is empty");

    		return true;
    	}
    	
    	Node last=Head;
    	
    	for(int i=0;i<pos-2;i++) {
    		last=last.getNext();
    	}
    	
    	last.setNext(last.getNext().getNext());
    	
    	return true;
    }
    
    
    public int Count() {
    	
    	int count=0;
    	
    	Node last=Head;
    	
    	do {
    		count++;
    		last=last.getNext();
    		
    	}while(last!=null);
    	
    	return count;
    }
	
    //----------------------------------------------------------------reverse display-------------------------------
    
    public void reverseDisplay(Node head) {
    	if(head==null) {
    	return;
    	}
    		reverseDisplay(head.getNext());
    		System.out.print(head.getData()+" ");
    	
    	
    }
 //------------------------------------------------------Display Rev using Stack--------------------------------------   
    public void DisplayStackRev() {
    	Stack<Node> stack=new Stack<>();
    	
    	Node temp=Head;
    	while(temp!=null) {
    		stack.push(temp);
    		temp=temp.getNext();
    	}
    	
    	while(!stack.isEmpty()) {
    		System.out.print(stack.pop().getData()+" ");
    	
    	}
    	System.out.println();
    	
    }

	public Node getHead() {
		return Head;
	}

	public void setHead(Node head) {
		Head = head;
	}
    
	 //-------------------------------------------------------Reverse LinkedList-----------------------------------------------
//  public void RevserveList(Node n1,Node n2,Node n3) {
//  	
//  }
  
  public void ReverseList(Node n1,Node n2) {
  	
  	if(n2==null) {
  		Head.setNext(null);
  		Head=n1;
  		return;
  	}
  	
  	ReverseList(n2,n2.getNext());
  	n2.setNext(n1);
  }
	
}
