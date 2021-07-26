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
	  public void addToEnd(int x){
	        Node node = new Node(x);
	        if (head == null){
	            this.head = node;
	        }else{
	            Node temp = head;
	            while (temp.next != null){
	                temp = temp.next;
	            }
	            temp.next = node;
	        }
	    }
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addToEnd(56);
		list.addToEnd(30);
		list.addToEnd(70);
		list.display();    
	}
	
}
