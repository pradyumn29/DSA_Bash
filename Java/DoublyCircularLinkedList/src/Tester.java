
public class Tester {

	public static void main(String[] args) {
		DoublyCircularLL dc=new DoublyCircularLL();
		
		dc.insertAtLast(10);
     	dc.insertAtLast(20);
		dc.insertAtLast(30);
		dc.insertAtLast(40);
		dc.Display();
		
		dc.insertAtFirst(5);
		dc.Display();
		
		dc.insertAtPos(55, 3);
		dc.Display();

	}

}
