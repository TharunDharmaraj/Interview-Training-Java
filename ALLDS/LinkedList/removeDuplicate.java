// Link: https://practice.geeksforgeeks.org/problems/remove-duplicate-element-from-sorted-linked-list/1
package ALLDS.LinkedList;

public class removeDuplicate {
    Node removeDuplicates(Node head)
    {
        if(head == null || head.next == null){
            return head;
        }
	    Node curr = head;
	    while(curr != null &&curr.next != null){
            if(curr.data == curr.next.data){
                curr.next = curr.next.next;
            }else{
                curr = curr.next;
            }
	    }
        return head;
    }
}

