
public class DoublyCircularLL {
	
	private Node head;

	public DoublyCircularLL() {
	
		head = null;
	}
	
	//----------------------------------------------------------Insert At First-----------------------------------------
	public void insertAtFirst(int data) {
		Node newn=new Node(data);
		
		//check for null condition
		if(head==null) {
			head=newn;
			newn.setNext(head);
			newn.setPrev(newn);
		}
		else {
			Node last=head;
			
			while(last.getNext()!=head) {
				last=last.getNext();
			}
			last.setNext(newn);
			newn.setNext(head);
			head=newn;   	
	    }	
	}
	
	//--------------------------------------------------------Insert At Last-----------------------------------------------------
	public boolean insertAtLast(int data) {
           Node newn=new Node(data);
		
		//check for null condition
		if(head==null) {
			head=newn;
			newn.setNext(head);
			newn.setPrev(newn);
			
			return true;
		}
		
			Node last=head;
			
			while(last.getNext()!=head) {
				last=last.getNext();
			}
			last.setNext(newn);
			newn.setNext(head);
			//newn.setPrev(last);
		
	
		return true;
		
	}
	//---------------------------------------------------------Insert At Pos-------------------------------------------------
	
	public void insertAtPos(int data,int pos) {
		
		Node newn=new Node(data);
		
		if(head==null) {
			head=newn;
			return;
		}
		
		Node last=head;
		
		for(int i=0;i<pos-2;i++) {
			last=last.getNext();
		}
		newn.setNext(last.getNext());
		last.setNext(newn);
		newn.setPrev(last);
		
	}
	
	//---------------------------------------------------------Display-----------------------------------------------------
	public void Display() {
		Node temp=head;
		
		do {
			System.out.print(" <=> "+temp.getData());
			temp=temp.getNext();
			
		}while(temp!=head) ;
			
		
		
		System.out.println();
	}
	//-----------------------------------------------------------Counter-----------------------------------------------------
	public void NodeCounter() {
    	int count=0;
    	if(head==null) {
    		System.out.println("list in not available");
    	}
    	else {
	    	Node last=head;
	    	
	    	do {
	    		last=last.getNext();
	    		count++;
	    	}while(last!=head);
		    	System.out.println("total no. of nodes are: "+count);
		    
    	}
    }
}
