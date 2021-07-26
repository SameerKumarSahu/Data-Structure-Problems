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
	            tail.next = newNode;    
	            //newNode will become new tail of the list    
	            tail = newNode;    
	        }    
	    }   
	  public void insert(int position,int value){
	        Node newNode = new Node(value);
	        Node temp = head;
	        for (int i=1; i < position-1; i++) {
	            temp = temp.next;
	        }
	        newNode.next = temp.next;
	        temp.next=newNode;

	        System.out.println(value +" Added sucessfully between 56 and 70");
	    }
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.addnode(56);
		list.addnode(70);
		list.insert(1,30);
		list.display();    
	}
	
}
