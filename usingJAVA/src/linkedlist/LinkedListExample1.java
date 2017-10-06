package linkedlist;

public class LinkedListExample1 
{
	Node head;   //object reference
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		LinkedListExample1  obj=new LinkedListExample1();
		
		
		obj.head = new Node(1);
		Node secondobj = new Node(2);
		Node thirdobj = new Node(3);		
		obj.head.next = secondobj;
		secondobj.next = thirdobj;
	}
}
