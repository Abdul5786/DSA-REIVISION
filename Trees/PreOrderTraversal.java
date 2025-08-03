package Trees;


import java.util.ArrayList;
import java.util.List;

public class PreOrderTraversal
{


    public List<Integer> inOrderTraversal(TreeNode root)
   {
       ArrayList<Integer> res = new ArrayList<>();
       inOrder(root,res);
       return res;
   }

   public void inOrder(TreeNode root,List<Integer> res)
   {
           if(root==null) return;
           res.add(root.val);
           inOrder(root.left,res);
           inOrder(root.right,res);
   }

    public static void main(String[] args)
    {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right= new TreeNode(3);
        root.left.left=new TreeNode(5);
        root.right.left=new TreeNode(6);


        PreOrderTraversal preOrderTraversal = new PreOrderTraversal();
        List<Integer> inOrderTraversalList = preOrderTraversal.inOrderTraversal(root);

        System.out.println("preorderTraversal" +inOrderTraversalList);


    }
}
