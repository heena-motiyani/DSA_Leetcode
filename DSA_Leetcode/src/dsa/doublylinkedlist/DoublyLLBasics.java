package dsa.doublylinkedlist;

import java.util.Scanner;

class Node {
	int data;
	Node next;
	Node prev;
	
	Node(int data){
		this.data = data;
		this.next = null;
		this.prev = null;
	}
}

public class DoublyLLBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		Node head = constructDLL(arr);
		Node res = head;
		while(res != null) {
			System.out.println(res.data);
			res = res.next;
		}

	}
	
	public static Node constructDLL(int[] arr) {
		Node head = new Node(arr[0]);
		Node temp = head;
		for(int i=1; i<arr.length; i++) {
			Node node = new Node(arr[i]);
			temp.next = node;
			node.prev = temp;
			temp = node;
		}
		return head;
	}
	public static Node deleteFromHead(Node head) {
		if(head==null || head.next==null) return null;
		head = head.next;
		return head;
	}
	public static Node deletefromTail(Node head) {
		if(head == null || head.next==null) return null;
		Node temp = head;
		while(temp.next.next != null) {
			temp = temp.next;
		}
		temp.next.prev = null;
		temp.next = null;
		return head;
	}

}
