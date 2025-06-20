package LinkedList;

public class InsertNodeMiddle
{
    public  static ListNode insertInMiddle(ListNode head,int value)
    {
        if(head==null){
            return new ListNode(value);
        }

        ListNode slow=head;
        ListNode fast=head;

        // finding the middle

       while(fast!=null && fast.next!=null)
       {
           slow=slow.next;
           fast=fast.next.next;
       }

        ListNode newNode = new ListNode(value);
        newNode.next=slow.next;
        slow.next=newNode;
        return head;
    }

    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // List: 1 -> 2 -> 4
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(4);

        // Insert 3 in middle: 1 -> 2 -> 3 -> 4
        head = insertInMiddle(head, 3);

        printList(head);  // Output: 1 2 3 4
    }
}
