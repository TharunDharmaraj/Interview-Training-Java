// Link: https://practice.geeksforgeeks.org/problems/add-1-to-a-number-represented-as-linked-list/1
package ALLDS.LinkedList;


class Solution
{
    public static Node reverse(Node head){
        Node prev = null;
        Node nextt = null;
        Node curr = head;
        while(curr != null){
            nextt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextt;
        }
        return prev;
    }
    
    public static Node adddOne(Node head){
        Node ans = head;
        Node temp = null;
        int carry = 1, sum;
        while(head != null){
            int data = head.data;
            sum = data + carry;
            if(sum >= 10){
                carry = 1;
            }else{
                carry = 0;
            }
            head.data = sum % 10;
            temp = head;
            head = head.next;
        }
        if(carry != 0){
            Node extra = new Node(carry);
            temp.next = extra;
        }
        return ans;
    }
    
    public static Node addOne(Node head) 
    { 
        Node node = reverse(head);
        Node add1Node = adddOne(node);
        Node added = reverse(add1Node);
        return added;
    }
}
