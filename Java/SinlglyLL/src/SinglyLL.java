
public class SinglyLL {

    private Node Head;
    
    //insert At First
    
    public void insertAtFirst(int data) {
    	Node newn=new Node(data);//creating new node containing data and reference null
    	 if(Head==null) {
    		 Head=newn; //assigning new nodes reference variable to head
    	 }
    	 
    	 Node last=Head;
    	 Head=Head.getNext();
    	 
    	 last.setNext(newn);
    	 newn.setNext(Head);
    	 
    }
    
    //Display
    
    public void Display() {
    	
    	if(Head==null) {
    		System.out.println("no nodes available");
    	}
    	        
    }
	
	
	
}
