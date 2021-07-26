package com.SingleLinkedLIst;

public class LinkedList {

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

	  public void display() {    
	        //Node current will point to head    
	        Node current = head;    
	            
	        if(head == null) {    
	            System.out.println("List is empty");    
	            return;    
	        }    
	           
	        while(current != null) {    
	            //Prints each node by incrementing pointer    
	            System.out.print(current.data + "-->");    
	            current = current.next;    
	        }    
	        System.out.println();    
	    }    
	  public void addnode(int data) {    
	        //Create a new node    
	        Node newNode = new Node(data); 
	        if(head == null) {    
	            //If list is empty, both head and tail will point to new node    
	            head = newNode;    
	            tail = newNode;    
	        }    
	        else { 
	              newNode.next=head;    
	            //newNode will become new tail of the list    
	            head = newNode;    
	        }    
	    }   
	  public void pop() {

	       
	        if(head == null) {
	            System.out.println("List is empty");
	            return;
	        }
	        else {
	            if(head != tail ) {
	                Node current = head;
	                while(current.next != tail) { 
	                    current = current.next;
	                }
	                tail = current;
	                tail.next = null;
	            }
	            else {
	                head = tail = null;
	            }
	        }
	    }
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		System.out.println("Before deleting..");
		list.addnode(70);
		list.addnode(56);
		list.addnode(30);
		list.display(); 
		list.pop();
		System.out.println("After deleting..");
        list.display();
	}
	
}
