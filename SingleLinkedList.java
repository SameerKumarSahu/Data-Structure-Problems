package com.SingleLinkedLIst;

public class SingleLinkedList {

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public Node head = null;
	public Node tail = null;

	  public void addnode(int data) {    
	        //Create a new node    
	        Node newNode = new Node(data); 
	        if(head == null) {    
	            //If list is empty, both head and tail will point to new node    
	            head = newNode;    
	            tail = newNode;    
	        }    
	        else { 
	            tail.next = newNode;    
	            //newNode will become new tail of the list    
	            tail = newNode;    
	        }    
	    }    
	        
	  public void display() {    
	        //Node current will point to head    
	        Node current = head;    
	            
	        if(head == null) {    
	            System.out.println("List is empty");    
	            return;    
	        }    
	        System.out.println("Nodes of singly linked list: ");    
	        while(current != null) {    
	            //Prints each node by incrementing pointer    
	            System.out.print(current.data + " ");    
	            current = current.next;    
	        }    
	        System.out.println();    
	    }    
	public static void main(String[] args) {
		SingleLinkedList list = new SingleLinkedList();
		list.addnode(56);
		list.addnode(30);
		list.addnode(70);
		list.display();    
	}
	
}
