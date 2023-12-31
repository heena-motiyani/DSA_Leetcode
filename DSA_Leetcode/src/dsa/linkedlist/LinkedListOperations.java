package dsa.linkedlist;

public class LinkedListOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
//	TC - O(1) SC - O(1)
	public static Node deleteFromHead(Node head) {
		if(head == null)
			return head;
		head = head.next;
		return head;
	}
//	TC - O(N) SC - O(1)
	public static Node deleteFromTail(Node head) {
		if(head == null || head.next ==  null) return head;
		Node temp = head;
		while(temp.next.next!=null) {
			temp = temp.next;
		}
		temp.next = null;
		return head;
	}
	public static Node deleteFromSpecificPosition(Node head, int k) {
		if(head == null) return head;
		if(k == 1) {
			head = head.next;
			return head;
		}
		Node temp = head, prev = null;
		int cnt = 0;
		while(temp != null) {
			cnt++;
			if(cnt == k) {
				prev.next = prev.next.next;
				temp = null;
			}
			prev = temp;
			temp = temp.next;
		}
		return head;
	}
	public static Node insertAtHead(Node head, int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
		return head;
	}
	public static Node insertAtTail(Node head, int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = new Node(data);
			return head;
		}
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
		newNode.next = null;
		return head;
	}
	public static Node insertAtPosition(Node head, int data, int pos) {
		if(head == null) return head;
		Node newNode = new Node(data);
		if(pos == 1) {
			newNode.next = head;
			head = newNode;
			return head;
		}
		Node temp = head;
		int cnt = 0;
		while(temp != null) {
			cnt++;
			if(cnt == pos-1) {
				newNode.next = temp.next;
				temp.next = newNode;
			}
		}
		return head;
	}
	public static Node insertBeforeValue(Node head, int x, int val) {
		if(head == null) return head;
		if(head.data == val) {
			Node newNode = new Node(x);
			newNode.next = head;
			head = newNode;
			return head;
		}
		Node temp = head, prev = null;
		while(temp != null) {
			if(temp.data == val) {
				Node newNode = new Node(x);
				newNode.next = prev.next;
				prev.next = newNode;
				break;
			}
			prev = temp;
			temp = temp.next;
		}
		return head;
	}

}
