public class tester {

      public static void main(String[] args) {

        DoublyLL dl=new DoublyLL();
        dl.insertAtLast(10);
        dl.insertAtLast(20);
        dl.insertAtLast(30);
        dl.display();
        dl.NodeCounter();
        
        dl.insertAtPos(40, 3);
        dl.display();
        dl.NodeCounter();
        
        dl.insertAtFirst(5);
        dl.display();
        dl.NodeCounter();
        
        dl.deleteAtLast();
        dl.display();
        dl.NodeCounter();
        
        dl.deleteAtPos(3);
        dl.display();
        dl.NodeCounter();
        
        dl.deleteAtFirst();
        dl.display();
        dl.NodeCounter();
    }
    
}
