package linkedlist;

public class Node 
{

	
	
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
}
