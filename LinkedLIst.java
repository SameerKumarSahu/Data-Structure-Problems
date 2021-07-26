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
	        System.out.println("Nodes of singly linked list: ");    
	        while(current != null) {    
	            //Prints each node by incrementing pointer    
	            System.out.print(current.data + "-->");    
	            current = current.next;    
	        }    
	        System.out.println();    
	    }    
	  public void addToBegin(int x){
	        if (head == null){
	            head = new Node(x);
	        }else{
	            Node temp = new Node(x);
	            temp.next = head;
	            head = temp;
	        }
	     }
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addToBegin(70);
		list.addToBegin(30);
		list.addToBegin(56);
		list.display();    
	}
	
}
