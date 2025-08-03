package Trees;

import java.util.ArrayList;
import java.util.List;

public class InOrderTraversal
{
    public List<Integer> InOrderTraverse(TreeNode root)
    {
        ArrayList<Integer> res = new ArrayList<>();
        InOrder(root,res);
        return res;
    }

    public void InOrder(TreeNode root,List<Integer> res)
    {

        if(root==null) return;
        InOrder(root.left,res);
        res.add(root.val);
        InOrder(root.right,res);
    }

    public static void main(String[] args)
    {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(5);
        root.right.right = new TreeNode(2);

        InOrderTraversal inOrderTraversal = new InOrderTraversal();
        List<Integer> inOrderTraverse = inOrderTraversal.InOrderTraverse(root);
        System.out.println("inorder list" +inOrderTraverse);
    }
}
