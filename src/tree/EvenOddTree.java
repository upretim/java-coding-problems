package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class EvenOddTree {

    public static void main(String[] args) {

    }
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    /**
     * Problem https://leetcode.com/problems/even-odd-tree/
     * @param root
     * @return boolean
     */

    public boolean isEvenOddTree(TreeNode root) {
        Queue<ArrayList<TreeNode>> queue = new LinkedList<>();
        ArrayList<TreeNode> rootLevel = new ArrayList<>();
        int level =0;
        rootLevel.add(root);
        queue.add(rootLevel);
        while(!queue.isEmpty()){
            ArrayList<TreeNode> nodes = queue.remove();
            if(nodes.isEmpty()) return true;
            ArrayList<TreeNode> nodesToAdd = new ArrayList<>();
            for(TreeNode node: nodes){
                if(level%2==0 && node.val%2==0) return false;
                if(level%2==1 && node.val%2==1) return false;
                if(node.left!=null) nodesToAdd.add(node.left);
                if(node.right!=null) nodesToAdd.add(node.right);
            }
            queue.add(nodesToAdd);
           level++;
        }
     return true;
    }
}
