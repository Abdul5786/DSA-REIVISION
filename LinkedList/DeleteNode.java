package LinkedList;
class ListNode{

    int val;

   ListNode next;

    ListNode(int x)
    {
        val=x;
    }

}

public class DeleteNode
{

    public static void  deleteNode(ListNode listNode)
    {
        if(listNode==null || listNode.next==null) return;

        listNode.val=listNode.next.val;
        listNode.next=listNode.next.next;
    }

    public static void main(String[] args)
    {
        // creating a linkedList

        ListNode head  = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next= new ListNode(4);

        // delete node -> 3

        ListNode doDelete =head.next.next;

      deleteNode(doDelete);

      ListNode temp=head;
      while(temp!=null)
      {
          System.out.println(temp.val);
          temp=temp.next;
      }
    }
}