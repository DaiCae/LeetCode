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

    private final Map<Integer, Integer> blackToWhite = new HashMap<>();
    private final Random random = new Random();
    private int whiteLength = 0;

    public Solution(int n, int[] blacklist) {
        int blackLength = blacklist.length;
        whiteLength = n - blackLength;
        //记录后半部分中的黑名单 表示在后半部分这个位置是黑名单，不能做映射
        int[] black = new int[blackLength];
        for (int value : blacklist) {
            if (value >= whiteLength) {
                black[value - whiteLength] = 1;
            }
        }
        int pos = 0;
        for (int value : blacklist) {
            //前半部分中的黑名单，要对其做映射
            if (value < whiteLength) {
                //找到后半部分的白名单位置
                while (black[pos] == 1) {
                    pos++;
                }
                //映射到黑名单中的白名单位置
                blackToWhite.put(value, pos + whiteLength);
                pos++;
            }
        }
    }

    public int pick() {
        //随机数
        int i = random.nextInt(whiteLength);
        return blackToWhite.getOrDefault(i, i);
    }
}