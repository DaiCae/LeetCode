import java.util.*;


class Solution {

}

public class test {
    public static void main(String[] args) {
//        int[] a = {1,1,1,2,1};
//        1,3,1,5,4
        int[] a = {1,3,1,5,4};
        int k = 0;
        System.out.println(findPairs(a,k));
    }


    public static int findPairs(int[] nums, int k) {
        Set<Integer> visited = new HashSet<>();
        Set<Integer> res = new HashSet<>();
        for (int num : nums) {
            visited.add(num);
        }
        for (int num : nums) {
            if (visited.contains(num - k)){
                res.add(num - k);
            }
            if (visited.contains(num + k)){
                res.add(num);
            }
        }
        return res.size();
    }
//    public static int findPairs(int[] nums, int k) {
//        int l = nums.length;
//        int n =0;
//        HashSet<Integer> h0 = new HashSet<>(); //(i,i+k)
//        HashSet<Integer> h1 = new HashSet<>(); //(i,i-k)
//        for(int i = 0; i < l-1; i++){
//            boolean f0 = false,f1 = false;
//            for(int j=i+1; j<l; j++){
//                int diff = nums[i] - nums[j];
//                if(diff == k){
//                    f0 = true;
//                    if(!h0.contains(nums[i])) n++;
//                    h0.add(nums[i]);
//                    if((nums[i]-nums[j])==k&&(nums[j]-nums[i])==-k){
//                        h0.add(nums[j]);
//                        h1.add(nums[j]);
//                        h0.add(k);
//                        h1.add(-k);
//                    }
//                }else if ((diff + k)==0){
//                    f1 = true;
//                    if(!h1.contains(nums[i])) n++;
//                    h1.add(nums[i]);
//                    if((nums[i]-nums[j])==-k&&(nums[j]-nums[i])==k){
//                        h0.add(nums[j]);
//                        h1.add(nums[j]);
//                        h0.add(k);
//                        h1.add(-k);
//                    }
//                }
//                if(f0 && f1) break;
//            }
//        }
//        return n;
//    }
}

