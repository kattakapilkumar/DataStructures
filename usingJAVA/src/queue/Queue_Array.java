package queue;

public class Queue_Array 
{

	int capacity;
	int front,rear,size;
	int array[];
	
	public Queue_Array(int capacity)
	{
		this.capacity = capacity;		
		front = 0;
		this.size =0;
		rear = capacity -1;
		array  = new int[this.capacity];
	}
	
	
	boolean isFull(Queue_Array queue)
	{
		return (queue.size == 0);
	}
	
	boolean isEmpty(Queue_Array queue)
	{
		return (queue.size == 0);
	}
	
	
}
