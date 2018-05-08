//This file shows the basic construction of a linked list by hand
//It also does a bunch of other stuff:
	//Adds an element to the front...

import java.util.NoSuchElementException;

//This is the structure for the nodes that make up the linked list
//The data is what is stored in the node, and next is where it points to
class Node<T>
{
	//This ensures that the data is all of the same type, T
	public T data;
	public Node<T> next;

	//This is the constructor that sets up the node
	public Node(T value)
	{
		this.data = value;
		this.next = null;
	}
}

class LinkedList<T>
{
	private Node<T> head;
	private int listSize = 0;

	//This is the constructor that sets up the empty linked list
	public LinkedList() 
	{
		head = null;
	}

	//This function adds an element to the start of the Linked List
	//This is accomplished in 3 steps: 
	//Step1: Create the node and pass in the data
	//Step2: Make next of the new node eqaul to head
	//Step 3: Move the head to point to the new node
	public void addElementToStart(T value)
	{
		Node<T> newNode = new Node<T>(value);
		newNode.next = head;
		head = newNode;
		listSize++;
	}

	//This function adds an element to the end of the Linked List
	//This is accomplished in 5 steps:
	//Step 1: Create the node and pass in the data
	//Step 2: Check to see if the list is empty, set the new node to head if it is
	//Step 3: Set the next of the new node to null as it will be the last element of the list
	//Step 4: Create a temporary node (representing current last) and use it to traverse the length of the list
	//Step 5: Once the end is reached, change the next of the temporary node to the new node
	public void addElementToEnd(T value)
	{
		Node<T> newNode = new Node<T>(value);

		if(head == null)
		{
			head = newNode;
			listSize = 1;
			return;
		}

		newNode.next = null;

		Node<T> last = head;

		while(last.next != null)
		{
			last = last.next;
		}

		last.next = newNode;
		listSize++;
	}

	//This function adds an element at a given index of the Linked List
	//This is accomplished in _ steps:
	//Step 1: Create the node and pass in the data
	//Step 2: Make sure the index exists
	//Step 3: Create a temporary node to traverse the list
	//Step 4: If the desired index is 0, add the node to the start of the list
	//Step 5: Traverse the list until reached the desired index
	//Step 6: Set the new node next to the temporary next value
	//Step 7: Set the temprary next to the new node
	public void addElementAtIndex(T value, int index)
	{

		Node<T> newNode = new Node<T>(value);

		if(index < 0 || index > listSize)
		{
			throw new IndexOutOfBoundsException("Invalid Index");
		}

		Node<T> temp = head;

		if(index == 0)
		{
			addElementToStart(value);
		}
		else
		{
			for(int i = 1; i<index; i++)
			{
				temp = temp.next;
			}

			newNode.next = temp.next;
			temp.next = newNode;
			listSize++;
		}
	}

	public T removeFirstElement()
	{
		if(listSize == 0)
		{
			throw new NoSuchElementException();
		}

		T elementToRemove = head.data;
		head = head.next;
		listSize--;

	}

	public void printList()
	{
		Node<T> tnode = head;
		while(tnode != null)
		{
			System.out.print(tnode.data+" ");
			tnode = tnode.next;
		}
	}

	//This is our main method where we will test the functions we created above
	public static void main(String[] args)
	{
		LinkedList<Integer> list = new LinkedList<Integer>();

		list.addElementToStart(2);
		list.addElementToStart(3);
		list.addElementToEnd(10);
		list.addElementAtIndex(5,3);

		list.printList();

	}
}