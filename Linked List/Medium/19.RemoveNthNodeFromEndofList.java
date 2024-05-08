class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if(head == null) return head ;

        ListNode curr=head;
        int i=1;
        while(curr.next != null)
        {
            i++;
            curr=curr.next;
        }

        curr=head;
        int k=0;

        if(i-n-1 == -1) return head.next;

        while(k < i-n-1)
        {
            k++;
            curr=curr.next;
        }
        curr.next=curr.next.next;

    return head;

    }
}

/*

Memory Optimised Code

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        if (fast == null) {
            head = head.next;
            return head;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}

*/
