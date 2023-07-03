
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		SinglyLL list=new SinglyLL();
		
		list.insertAtFirst(11);
		list.insertAtFirst(21);
		list.insertAtFirst(51);
		list.insertAtFirst(61);
		
		list.Display();
		System.out.println("no of nodes:"+list.Count());
		
		list.insertAtLast(110);
		list.insertAtLast(105);
		list.insertAtLast(121);
		list.Display();
		System.out.println("no of nodes:"+list.Count());
		
		list.insertAtPos(1000, 3);
		list.Display();
		System.out.println("no of nodes:"+list.Count());
		
		list.deleteAtFirst();
		list.Display();
		System.out.println("no of nodes:"+list.Count());
		
		list.deleteAtLast();
		list.Display();
		System.out.println("no of nodes:"+list.Count());
		
		list.DeleteAtpos(3);
		list.Display();
		System.out.println("no of nodes:"+list.Count());
		
		
	}

}
