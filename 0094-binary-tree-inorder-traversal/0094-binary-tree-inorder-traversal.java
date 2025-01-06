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
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> s = new Stack<>();
        ArrayList<Integer> l = new ArrayList<>();
        while(true){
            while(root!=null)
            {
                s.push(root);
                root = root.left;
            }
            if(s.empty()) break;
            root = s.pop();
            l.add(root.val);
            root = root.right;
        }
        return l;
    }
}