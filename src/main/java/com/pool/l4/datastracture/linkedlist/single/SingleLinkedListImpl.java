package com.pool.l4.datastracture.linkedlist.single;

public class SingleLinkedListImpl {
	private Node head;

	public boolean isEmpty() {
		return (head == null);
	}

	public void insertFirst(String newData) {
		Node newNode = new Node();
		newNode.data = newData;
		newNode.next = head;
		head = newNode;
	}

	public void printLinkedList() {
		Node currentNode = head;
		while (currentNode != null) {
			currentNode.displayNodeData();
			currentNode = currentNode.next;
		}
	}

	public void insertLast(String newData) {
		Node currentNode = head;
		while (currentNode.next != null) {
			currentNode = currentNode.next;
		}
		Node newNode = new Node();
		newNode.data = newData;
		currentNode.next = newNode;
	}

	public Node deleteFirst() {
		Node temp = head;
		head = head.next;
		return temp;
	}

	public void deleteLast() {
		Node temp = head;
		Node newNode = null;
		while (temp.next != null) {
			// head.displayNodeData();
			if(newNode==null) {
				
			}else {
				newNode.next=temp.next;
			}
		}
	}

	public static void main(String[] args) {
		SingleLinkedListImpl impl = new SingleLinkedListImpl();
		impl.insertFirst("Shiva");
		impl.insertFirst("DASARI");
		impl.insertLast("Who");
		impl.deleteLast();
		impl.printLinkedList();
	}
}
