package dsa.linkedlist;

import java.util.Scanner;

class Node {
	int data;
	Node next;
	Node(int data){
		this.data = data;
		this.next = null;
		}
	public Node() {
		this.data = 0;
		this.next = null;
	}
}
public class ConvertArrayToLinkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		Node head = convertToLL(arr);
		Node res = head;
		while(res!=null) {
			System.out.println(res.data);
			res = res.next;
		}
		System.out.println("Length of Linked List: "+findLengthLL(head));
		int ele = sc.nextInt();
		System.out.println("Search element "+ ele + " in Linked List");
		int present = searchInLL(head, ele);
		if(present == 1) {
			System.out.println("element is present");
		} else {
			System.out.println("element is not present");
		}
	}
	public static Node convertToLL(int[] arr) {
		Node head = new Node(arr[0]);
		Node node = head;
		for(int i=1; i<arr.length; i++) {
			Node temp = new Node(arr[i]);
			node.next = temp;
			node = temp;
		}
		return head;
	}
	public static int findLengthLL(Node head) {
		Node temp = head;
		int len = 0;
		while(temp != null) {
			temp = temp.next;
			len++;
		}
		return len;
	}
	public static int searchInLL(Node head, int k) {
		Node temp = head;
		while(temp != null) {
			if(temp.data == k)
				return 1;
			temp = temp.next;
		}
		return 0;
	}

}
