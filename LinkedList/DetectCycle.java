package LinkedList;

public class DetectCycle
{
    public static  boolean detectCycle(ListNode head)
    {
        if(head==null && head.next==null) return false;

        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast)
            {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        // Create a linked list: 1 -> 2 -> 3 -> 4 -> 2 (cycle)
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        // Creating a cycle: node 4 points back to node 2
        head.next.next.next.next = head.next;

        boolean hasCycle = detectCycle(head);

        System.out.println("Cycle detected: " + hasCycle); // Output: true
    }
}
