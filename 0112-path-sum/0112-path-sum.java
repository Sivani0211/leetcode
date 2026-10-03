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
 /** 
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        Queue<TreeNode>queue=new LinkedList<>();
        Queue<Integer>sum=new LinkedList<>();
        if(root==null){return false;}
        queue.add(root);
        sum.add(root.val);
        while(!queue.isEmpty()){
            TreeNode node=queue.poll();
            int currentsum=sum.poll();
            if(node.left==null && node.right==null){
                if(targetSum==currentsum){
                    return true;
                }
            }
            if(node.left !=null){
                queue.add(node.left);
                sum.add(currentsum+ node.right.val);
            }
        }
        return false;
    }
}
*/

class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<Integer> sum = new LinkedList<>();
        if (root == null) {
            return false;
        }
        queue.add(root);
        sum.add(root.val);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            int currentSum = sum.poll();
            if (node.left == null && node.right == null) {
                if (currentSum == targetSum) {
                    return true;
                }
            }
            if (node.left != null) {
                queue.add(node.left);
                sum.add(currentSum + node.left.val);
            }
            if (node.right != null) {
                queue.add(node.right);
                sum.add(currentSum + node.right.val);
            }
        }
        return false;
    }
}

