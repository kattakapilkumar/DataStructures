package linkedlist;

public class Node_Insertion_FRONT  
{
	Node head;
	public void push(int new_data)
	{
		Node new_node_obj = new Node(new_data);
		
		
		
		new_node_obj.next = head;  //pointing to HEAD...
		
		
		head = new_node_obj;  // making the inserted new data node which is inserted in the front as HEAD
		
	}
	
	
}
