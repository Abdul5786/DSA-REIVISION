package Trees;

import java.util.ArrayList;
import java.util.List;

public class PostOrder
{
    public List<Integer> postOrderTraversal(TreeNode root)
    {
      List<Integer> res =  new ArrayList<>();
      postOrder(root,res);
      return res;
    }

    public void postOrder(TreeNode root,List<Integer> res)
    {
       if(root==null) return;
       postOrder(root.left,res);
       postOrder(root.right,res);
       res.add(root.val);
    }

    public static void main(String[] args)
    {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right= new TreeNode(3);
        root.left.left=new TreeNode(5);
        root.right.left=new TreeNode(6);


        PostOrder postOrder = new PostOrder();
        List<Integer> postOrderTraversalList = postOrder.postOrderTraversal(root);

        System.out.println("postOrder traversal" +postOrderTraversalList);

    }
}
