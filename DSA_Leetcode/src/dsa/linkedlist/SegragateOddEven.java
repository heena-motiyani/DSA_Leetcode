package dsa.linkedlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SegragateOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Node head = new Node();
		while(true) {
			String input = sc.nextLine();
			if(input.equals("done"))
				break;
			LinkedListOperations.insertAtTail(head, Integer.parseInt(input));
		}
		Node res = segregateOddEven(head.next);
		while(res != null) {
			System.out.print(res.data+" ");
			res = res.next;
		}

	}
//	Brute Force TC - O(2N) SC - O(N)
//	public static Node segregateOddEven(Node head) {
//		List<Integer> list = new ArrayList<>();
//		Node temp = head;
//		while(temp != null && temp.next != null) {
//			list.add(temp.data);
//			temp = temp.next.next;
//		}
//		if(temp != null) list.add(temp.data);
//		temp = head.next;
//		while(temp != null && temp.next != null) {
//			list.add(temp.data);
//			temp = temp.next.next;
//		}
//		if(temp != null) list.add(temp.data);
//		temp = head;
//		int i = 0;
//		while(temp != null) {
//			temp.data = list.get(i++);
//			temp = temp.next;
//		}
//		return head;
//	}
//	Optimal Approach
//	TC - O(N) SC - O(1)
	public static Node segregateOddEven(Node head) {
		Node temp1 = head, temp2 = head.next;
		Node evenHead = temp2;
		while(temp2 != null && temp2.next != null) {
			temp1.next = temp2.next;
			temp1 = temp1.next;
			temp2.next = temp1.next;
			temp2 = temp2.next;
		}
		temp1.next = evenHead;
		return head;
	}
}
