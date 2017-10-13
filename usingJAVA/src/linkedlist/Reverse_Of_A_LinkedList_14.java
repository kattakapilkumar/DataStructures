package linkedlist;

public class Reverse_Of_A_LinkedList_14 {
	static Node head;
	static class Node
	{
		int data;
		Node next;	
		Node(int d)
		{
			data  = d;
			next  = null;
		}
	}

	
	Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
	
	
	 void printList(Node node) {
	        while (node != null) {
	            System.out.print(node.data + " ");
	            node = node.next;
	        }
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
