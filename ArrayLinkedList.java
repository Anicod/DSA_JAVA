package javaplaylist;

public class ArrayLinkedList {
	class LinkedList
	{
	// Representation of a node
	static class Node
	{
	    int data;
	    Node next;
	};
	static Node root;
	// Function to insert node
	static Node insert(Node root, int item)
	{
	    Node temp = new Node();
	    temp.data = item;
	    temp.next = root;
	    root = temp;
	    return root;
	}
	static void display(Node root)
	{
	    while (root != null)
	    {
	        System.out.print(root.data + " ");
	        root = root.next;
	    }
	}
	static Node arrayToList(int arr[], int n)
	{
	    root = null;
	    for (int i = n - 1; i >= 0 ; i--)
	        root = insert(root, arr[i]);
	    return root;
	}
	// Driver code
	public static void main(String[] args)
	{
	    int arr[] = { 1, 2, 3, 4, 5 };
	    int n = arr.length;
	    Node root = arrayToList(arr, n);
	    display(root);
	}
	}
}
