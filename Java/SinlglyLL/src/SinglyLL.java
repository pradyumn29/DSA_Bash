
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
	
	
	
}
