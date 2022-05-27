package com.pool.l4.datastracture.linkedlist.single;

public class LinkedListL1 {
	public MyNode head;
	public MyNode tail;
	public int length = 0;

	public LinkedListL1(String value) {
		MyNode head = new MyNode(value);
		this.head = head;
		this.tail = head;
		this.length += 1;

	}

	public void add(String newelement) {
		MyNode currentHead = this.head;

		MyNode newNode = new MyNode(newelement);
		this.tail.next=newNode;
		this.head=this.tail;
		this.tail = this.tail;
	}

	public static void main(String[] args) {

		LinkedListL1 l1 = new LinkedListL1("50");
		System.out.println("Head:" + l1.head);
		System.out.println("Tail:" + l1.tail);
		l1.add("40");
		System.out.println("Head:" + l1.head);
		System.out.println("Tail:" + l1.tail);
		l1.add("30");
		System.out.println("Head:" + l1.head);
		System.out.println("Tail:" + l1.tail);
		/*
		 * LinkedListL1 l2 = new LinkedListL1("40"); System.out.println("Head:" +
		 * l2.head); System.out.println("Tail:" + l2.tail);
		 */
	}

	public static class MyNode {
		public String value;
		public MyNode next;

		public MyNode() {
		}

		public MyNode(String value) {
			this.value = value;
			this.next = null;
		}

		@Override
		public String toString() {
			return "MyNode [value=" + value + ", next=" + next + "]";
		}

	}
}
