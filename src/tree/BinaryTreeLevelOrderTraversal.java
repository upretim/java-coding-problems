package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
    public static void main(String[] args) {

    }
    /** Definition for a binary tree node.*/
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

    /*problem statement Binary Tree Level Order Traversal
    * https://leetcode.com/problems/binary-tree-level-order-traversal/*/
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> masterList = new ArrayList<>();
        if(root==null) return masterList;
        Queue<List<TreeNode>> queue = new LinkedList<>();
        List<TreeNode> nodeList = new ArrayList<>();
        nodeList.add(root);
        queue.add(nodeList);
        while(!queue.isEmpty()){
            List<TreeNode> node = queue.remove();
            if(node.isEmpty()) break;
            List<TreeNode> nextNode =  new ArrayList<>();
            List<Integer> levelList = new ArrayList<>();
            for(TreeNode n: node){
                levelList.add(n.val);
                if(n.left!=null) nextNode.add(n.left);
                if(n.right!=null) nextNode.add(n.right);
            }
            masterList.add(levelList);
            queue.add(nextNode);
        }

        return masterList;
    }
}
