package linkedlist;

public class LinkedList_Operations2 {
		Node head;
		public static void main(String[] args) 
		{
			LinkedList_Operations2 objope2 = new LinkedList_Operations2();

			objope2.head = new Node(1);           //creating first node
			Node secondobj = new Node(2);        // creating second NODE
			Node thirdobj = new Node(3);	    //creating third NODE
			objope2.head.next = secondobj;
			secondobj.next = thirdobj;	
			
			
			
			
			Node_Insertion_FRONT objfront =new Node_Insertion_FRONT();
			
			
			Node obj123 = objfront.push(9);
			
			//obj123.next=head;

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
