import java.util.*;

class Solution {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    List<Integer> res = new LinkedList<>();
    public List<Integer> largestValues(TreeNode root) {
        if(root==null) return new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        traverse(queue);
        return res;
    }

    public void traverse(Queue<TreeNode> queue){
        int sz = queue.size();
        if(sz >0){
            int max = Integer.MIN_VALUE;
            for(int i=0;i<sz;i++){
                TreeNode root = queue.poll();
                max = Math.max(max,root.val);
                if(root.left!=null) queue.offer(root.left);
                if(root.right!=null) queue.offer(root.right);
            }
            res.add(max);
            traverse(queue);
        }
    }

}