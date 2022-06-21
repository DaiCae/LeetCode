import java.util.LinkedList;
import java.util.List;

class Solution {


    public static void main(String[] args) {
        int[] nums= {1,2,3};
        System.out.println(permute(nums));
    }

    // 记录所有全排列
    static List<List<Integer>> res = new LinkedList<>();
    static LinkedList<Integer> track = new LinkedList<>();

    /* 主函数，输入一组不重复的数字，返回它们的全排列 */
    static List<List<Integer>> permute(int[] nums) {
        backtrack(nums);
        return res;
    }

    // 回溯算法框架
    static void backtrack(int[] nums) {
        if (track.size() == nums.length) {
            // 穷举完一个全排列
            res.add(new LinkedList(track));
            return;
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (track.contains(nums[i]))
                continue;
            // 前序遍历位置做选择
            track.add(nums[i]);
            backtrack(nums);
            // 后序遍历位置取消选择
            track.removeLast();
        }
    }
}