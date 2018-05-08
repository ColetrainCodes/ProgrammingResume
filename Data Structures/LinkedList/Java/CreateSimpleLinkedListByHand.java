//This file shows the basic construction of a linked list by hand
//It creates a list and populates it with 3 nodes

public class CreateSimpleLinkedListByHand
{
	Node head;

	//This is the structure for the nodes that make up the linked list
	//The data is what is stored in the node, and next is where it points to
	static class Node
	{
		int data;
		Node next;

		//This is the constructor that sets up the node when it is called on
		Node(int d)
		{
			data = d;
			next = null;
		}
	}

	public static void main(String[] args)
	{
		//Creates an empty list
		CreateSimpleLinkedListByHand list1 = new CreateSimpleLinkedListByHand();

		//Create 3 nodes that will make up the list, starting with the head
		list1.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);

		//Link the nodes together
		list1.head.next = second;
		second.next = third;
	}
}