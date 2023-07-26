public class DoublyLL {
    private Node head;

    public DoublyLL(){
        head=null;
    }

    public boolean insertAtLast(int data){
        //crreate new node
        Node newn=new Node(data);
        
        //check for empty linked list
        if(head==null){
            head=newn;
            return true;
        }

        //creating node for traversing 
        Node last =head;
        while(last.getNext()!=null){
            last=last.getNext(); //reaching the last node
        }
        last.setNext(newn);
        newn.setPrev(last);

        return true;
    }

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

    public boolean insertAtPos(int data,int pos){
        //creatting new node
        Node newn=new Node(data);

         //check for empty linked list
        if(head==null){
            head=newn;
            return true;
        }
        
        Node last=head;
        
        for(int i=0;i<pos-2;i++) {
        	last=last.getNext();
        }
        newn.setNext(last.getNext());
        last.setNext(newn);
        
        return true;

    }
    
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
    
    public void deleteAtPos(int pos) {
    	if(head==null) {
    		System.out.println("list in not available");
    	}
    	
    	Node last=head;
    	for(int i=0;i<pos-2;i++) {
    		last=last.getNext();
    	}
    	
    	last.setNext(last.getNext().getNext());
    	
    }
    
    public void deleteAtFirst() {
    	if(head==null) {
    		System.out.println("list in not available");
    	}
    	
    	head=head.getNext();
    }
    
    public void NodeCounter() {
    	int count=0;
    	if(head==null) {
    		System.out.println("list in not available");
    	}
    	
    	Node last=head;
    	
    	while(last!=null) {
    		last=last.getNext();
    		count++;
    	}
    	System.out.println("total no. of nodes are: "+count);
    	System.out.println();
    	
    }
}
