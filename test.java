import java.util.*;

public class test {
    public static void main(String[] args) {
//        int[] a = {1,1,1,2,1};
//        1,3,1,5,4
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

    int maxValue;
    HashMap<Integer, Integer> map = new HashMap<>();
    public int[] findFrequentTreeSum(TreeNode root) {
        dfs(root);
        ArrayList<Integer> list = new ArrayList<>();
        map.forEach((key,value)->{
            if (value == maxValue) list.add(key);
        });
        int[] results = new int[list.size()];
        for (int i = 0; i < results.length; i++) results[i] = list.get(i);
        return results;
    }

    public int dfs(TreeNode node) {
        if (node == null) return 0;
        int sum = node.val + dfs(node.left) + dfs(node.right);
        int newValue = map.getOrDefault(sum,0) + 1;
        map.put(sum, newValue);
        maxValue = Math.max(newValue, maxValue);
        return sum;
    }
}

