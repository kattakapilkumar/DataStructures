package linkedlist;

public class LinkedListExample1 
{
	Node head;   //object reference
	/*public void push(int new_data)
	{
		Node new_node_obj = new Node(new_data);
		
		
		
		new_node_obj.next = head;  //pointing to HEAD...
		
		
		head = new_node_obj;  // making the inserted new data node which is inserted in the front as HEAD
		
	}*/
	
	
	
	//static Node justobj;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		LinkedListExample1  obj=new LinkedListExample1();
						
		obj.head = new Node(1);           //creating first node
		Node secondobj = new Node(2);     // creating second NODE
		Node thirdobj = new Node(3);	 //creating third NODE
		
		
		
		obj.head.next = secondobj;
		secondobj.next = thirdobj;	
		
		//justobj.push(6);
		
		//obj.printList();
		
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
