import java.util.HashMap;

// import java.util.Arrays;
// import java.util.HashMap;

public class test {
    public static int[] platesBetweenCandles(String s, int[][] queries) {
        int n = s.length();
        int[] preSum = new int[n];
        for (int i = 0, sum = 0; i < n; i++) {
            if (s.charAt(i) == '*') sum++;
            preSum[i] = sum;
        }
        int[] left = new int[n];
        for (int i = 0, l = -1; i < n; i++) {
            if (s.charAt(i) == '|') l = i;
            left[i] = l;
        }
        int[] right = new int[n];
        for (int i = n - 1, r = -1; i >= 0; i--) {
            if (s.charAt(i) == '|') r = i;
            right[i] = r;
        }
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int x = right[queries[i][0]], y = left[queries[i][1]];
            ans[i] = (x == -1 || y == -1 || x >= y) ? 0 : preSum[y] - preSum[x];
        }
        return ans;
    }

    public static void main(String[] args){
        // String s= "**|**|***|";
        // int[][] a ={{2,5},{5,9}};
        String s ="***|**|*****|**||**|*";
        int[][] a ={{1,17},{4,5},{14,17},{5,11},{15,16}};
        platesBetweenCandles(s, a);
        System.out.println(a);
    }
}