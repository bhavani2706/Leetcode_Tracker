// Last updated: 09/07/2026, 09:48:32
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public String tree2str(TreeNode root) {
        if(root==null){
            return "";
        }
        StringBuilder s=new StringBuilder();
        newStr(root,s);
        return s.toString();
    }
        public void newStr(TreeNode root,StringBuilder s){
          if(root==null)
          return ;
          s.append(root.val) ;   
          if(root.left!=null || root.right!=null){
            s.append('(');
            newStr(root.left,s);
            s.append(')');
          }
          if(root.right!=null){
            s.append('(');
            newStr(root.right,s);
            s.append(')');
          }
        }  
    }
