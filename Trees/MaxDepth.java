package Trees;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MaxDepth
{
    // using bfs

    public int Max(TreeNode root)
    {
        if(root==null) return 0;

        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        int level=0;

        while(!que.isEmpty())
        {

            int size= que.size();

            while(size>0)
            {

                TreeNode node = que.poll();

                if(node.left!=null)
                {
                    que.offer(node.left);
                }

                if(node.right!=null)
                {
                    que.offer(node.right);
                }

            }
            if(!que.isEmpty())
            {
                level++;
            }
        }

        return (level+1);
    }

    public static void main(String[] args)
    {

    }
}
