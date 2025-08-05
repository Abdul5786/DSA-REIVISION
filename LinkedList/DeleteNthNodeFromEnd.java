package LinkedList;



 class listNode{

    int val;

    listNode next;
    listNode(){}
    listNode(int val)
    {
        this.val=val;
    }
    listNode(int val,listNode next)
    {
        this.val=val;
        this.next=next;
    }
}

public class DeleteNthNodeFromEnd
{
    public listNode deleteNodeFromEnd(int n,listNode head)
    {
        listNode fast = head;
        listNode slow=head;

        for(int i=1;i<=n;i++)
        {
            fast= fast.next;
        }

        if(fast==null)
        {
            return head;
        }

        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }

        slow =slow.next.next;

        return head;

    }
}
