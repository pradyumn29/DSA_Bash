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
        
        System.out.println("\n---stack Reverse---");
        dl.DisplayStackRev();
        
        dl.deleteAtLast();
        dl.display();
        dl.NodeCounter();
        
        dl.deleteAtPos(3);
        dl.display();
        dl.NodeCounter();
        
        dl.deleteAtFirst();
        dl.display();
        dl.NodeCounter();
        
        System.out.println("----recursion---");
        dl.reverseDisplay(dl.getHead());
        System.out.println("\n---stack Reverse---");
        dl.DisplayStackRev();
        
        dl.insertAtLast(10);
        dl.insertAtLast(20);
        dl.insertAtLast(30);
        dl.display();
        
        System.out.println("reversing the list");
        dl.ReverseList(dl.getHead(), dl.getHead().getNext());
        dl.display();
    }
    
}
