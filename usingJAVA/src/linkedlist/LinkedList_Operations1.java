package linkedlist;

public class LinkedList_Operations1 
{

	Node head;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		LinkedList_Operations1 objope1 = new LinkedList_Operations1();
		
		
		objope1.head = new Node(1);           //creating first node
		Node secondobj = new Node(2);     // creating second NODE
		Node thirdobj = new Node(3);	 //creating third NODE
		
		
		
		
		
		
		
		
		
		objope1.head.next = secondobj;
		secondobj.next = thirdobj;	

	}
	public void printList()
    {
        Node n = head;
        while (n != null)
        {
            System.out.print(n.data+" ");
            n = n.next;
        }
    }

}
