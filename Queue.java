package com.SingleLinkedLIst;

public class Queue {
	public Node head;
	public Node tail;

	class Node {
		int data;
		Node next;

		Node(int value) {
			data = value;
			next = null;
		}
	}

	public void add(int values) {
		Node newNode = new Node(values);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = tail;
			tail = newNode;
		}
	}

	public void display() {
		Node current = tail;
		if (tail == null) {
			System.out.println("List is empty");
		}
		while (current != null) {
			System.out.print(current.data + "-->");
			current = current.next;
		}
	}

	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.add(70);
		queue.add(30);
		queue.add(56);
		queue.display();

	}

}
