package com.code.old.linkedlist;

import java.util.Optional;

/*
Middle of the Linked List
Given a non-empty, singly linked list with head node head, return a middle node of linked list.

If there are two middle nodes, return the second middle node.



Example 1:

Input: [1,2,3,4,5]
Output: Node 3 from this list (Serialization: [3,4,5])
The returned node has value 3.  (The judge's serialization of this node is [3,4,5]).
Note that we returned a ListNode object ans, such that:
ans.val = 3, ans.next.val = 4, ans.next.next.val = 5, and ans.next.next.next = NULL.
Example 2:

Input: [1,2,3,4,5,6]
Output: Node 4 from this list (Serialization: [4,5,6])
Since the list has two middle nodes with values 3 and 4, we return the second one.


Note:

The number of nodes in the given list will be between 1 and 100.
 */
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }


public class MiddleOfLinkedList {

    public ListNode middleNode(ListNode head) {

        ListNode temp = head,list = head;

        int count = 0;
        int mid = 0;

        while(temp != null){
            count++;
            temp = temp.next;
        }

        mid = count/2;

        while(mid > 0){
            list = list.next;
            mid--;
        }

        return new ListNode(list.val);

    }

    public ListNode middleNodeSlowFast(ListNode head){

        ListNode slow = head,fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }



    public static void main(String[] args) {

        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(6);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;

        ListNode ans1 = new MiddleOfLinkedList().middleNode(l1);
        ListNode ans2 = new MiddleOfLinkedList().middleNodeSlowFast(l1);


        System.out.println(ans2.val);


    }
}
