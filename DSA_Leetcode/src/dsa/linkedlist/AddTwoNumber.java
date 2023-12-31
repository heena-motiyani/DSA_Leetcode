package dsa.linkedlist;

import java.util.Scanner;

public class AddTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Node head1 = new Node();
		while(true) {
			String input = sc.nextLine();
			if(input.equals("done"))
				break;
			LinkedListOperations.insertAtTail(head1, Integer.parseInt(input));
		}
		Node head2 = new Node();
		while(true) {
			String input = sc.nextLine();
			if(input.equals("done"))
				break;
			LinkedListOperations.insertAtTail(head2, Integer.parseInt(input));
		}
		Node res = addTwoNumber(head1, head2);
		while(res != null) {
			System.out.print(res.data+" ");
			res = res.next;
		}

	}
	public static Node addTwoNumber(Node l1, Node l2) {
		Node curr = new Node();
		Node dummyHead = curr;
		int carry = 0;
		Node temp1 = l1, temp2 = l2;
        while(temp1!= null || temp2 != null || carry != 0){
            int x = (temp1 != null)?temp1.data:0;
            int y = (temp2 != null)?temp2.data:0;
            int sum = x+y+carry;
            carry = sum/10;
            curr.next = new Node(sum%10);
            curr = curr.next;
            if(temp1 != null)
            temp1 = temp1.next;
            if(temp2 != null)
            temp2 = temp2.next;
        }
        return dummyHead.next;
		
	}

}
