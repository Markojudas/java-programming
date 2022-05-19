package com.company;

public class Main {


    public static int getDecimalValue(ListNode head){
        int decimalVal = head.val;
        while(head.next != null){
            decimalVal = decimalVal * 2 + head.next.val; //this is equivalent to shifting left (*2) == << 1
            head = head.next;
        }

        return decimalVal;
    }

    public static void main(String[] args) {
	// write your code here

        ListNode node2 = new ListNode(1, null);
        ListNode node1 = new ListNode(0, node2);
        ListNode head = new ListNode(1, node1);

        System.out.println(getDecimalValue(head));
    }
}
