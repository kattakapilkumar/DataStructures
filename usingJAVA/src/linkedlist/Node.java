package linkedlist;

public class Node 
{

	
	Node head;
	int data;   //datatype
	Node next;  //here next is a OBJECT REFERENCE	
	//here is the constructor
	Node(int d)
	{
		//here first line = 
		//we can use  Node(int d)  and this.data=data;
		data = d;
		
		next=null;
	}
	
	
	
	public void push(int new_data)
	{
		Node new_node_obj = new Node(new_data);
		
		
		
		new_node_obj.next = head;  //pointing to HEAD...
		
		
		head = new_node_obj;  // making the inserted new data node which is inserted in the front as HEAD
		
	}
	
}
