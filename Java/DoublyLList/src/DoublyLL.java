import java.util.Stack;

public class DoublyLL {
    private Node head;

    
   
	public Node getHead() {
		return head;
	}
	public void setHead(Node head) {
		this.head = head;
	}
	public DoublyLL(){
        head=null;
    }
//--------------------------------------------------------------Insert AT Last----------------------------------------------
    public void insertAtLast(int data){
        //crreate new node
        Node newn=new Node(data);
        
        //check for empty linked list
        if(head==null){
            head=newn;
          //  return true;
        }else {
        //creating node for traversing 
        Node last =head;
        while(last.getNext()!=null){
            last=last.getNext(); //reaching the last node
        }
        last.setNext(newn);
        newn.setPrev(last);
        }
        //return true;
    }
//----------------------------------------------------------------Display-----------------------------------------
    public void display(){
        Node trev=head;

        System.out.print("null --> ");
        while(trev!=null){
            System.out.print(trev.getData()+" --> ");
            trev=trev.getNext();
        }
        System.out.print("null");
        System.out.println();
    }
//--------------------------------------------------------------------Insert At Pos-----------------------------------------------
    public void insertAtPos(int data,int pos){
        //creatting new node
        Node newn=new Node(data);

         //check for empty linked list
        if(head==null){
            head=newn;
            //return true;
        }
        else {
        Node last=head;
        
        for(int i=0;i<pos-2;i++) {
        	last=last.getNext();
        }
        newn.setNext(last.getNext());
        last.setNext(newn);
        newn.setPrev(last);
        
        }//return true;

    }
 //------------------------------------------------------Insert At First-------------------------------------------------------   
    public void insertAtFirst(int data) {
    	Node newn=new Node(data);
    	
    	if(head==null) {
    		head=newn;
    		//return true;
    	}
    	
    	Node last=head;
    	
    	newn.setNext(last);
        head=newn;
    	//return true;
    }
//------------------------------------------------------Delete At Last-------------------------------------------------------- 
    public void deleteAtLast() {
    	if(head==null) {
    		System.out.println("list in not available");
    	}
    	
    	Node last=head;
    	 while(last.getNext().getNext()!=null) {
    		 last=last.getNext();
    	 }
    	
    	 last.setNext(null);
    }
 //--------------------------------------------------------Delete At Pos------------------------------------------------------   
    public void deleteAtPos(int pos) {
    	if(head==null) {
    		System.out.println("list in not available");
    	}
    	
    	Node last=head;
    	for(int i=0;i<pos-2;i++) {
    		last=last.getNext();
    	}
    	Node next=last.getNext().getNext();
    	last.setNext(next);
    	next.setPrev(last);
    }
 //-------------------------------------------------------------Delete At First-------------------------------------------------   
    public void deleteAtFirst() {
    	if(head==null) {
    		System.out.println("list in not available");
    	}
    	
    	head=head.getNext();
    }
//----------------------------------------------------------------Counter-------------------------------------------------
    public void NodeCounter() {
    	int count=0;
    	if(head==null) {
    		System.out.println("list in not available");
    	}
    	else {
    	Node last=head;
    	
    	while(last!=null) {
    		last=last.getNext();
    		count++;
    	}
    	System.out.println("total no. of nodes are: "+count);
    	System.out.println();
    	}
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
    	
    	Node temp=head;
    	while(temp!=null) {
    		stack.push(temp);
    		temp=temp.getNext();
    	}
    	
    	while(!stack.isEmpty()) {
    		System.out.print(stack.pop().getData()+" ");
    	
    	}
    	System.out.println();
    	
    }
    
 //-------------------------------------------------------Reverse LinkedList-----------------------------------------------
//    public void RevserveList(Node n1,Node n2,Node n3) {
//    	
//    }
    
    public void ReverseList(Node n1,Node n2) {
    	
    	if(n2==null) {
    		head.setNext(null);
    		head=n1;
    		return;
    	}
    	
    	ReverseList(n2,n2.getNext());
    	n2.setNext(n1);
    }
}
