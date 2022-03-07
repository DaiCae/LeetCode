import java.util.Arrays;
// import java.util.HashMap;

public class test {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int o1=0, o2=0;
        int k = (m + n)/2;
        
        while(k!=1){
            int tmp = k/2;
            if(nums1[o1 + tmp -1]<=nums2[o2 + tmp -1]){
                o1 +=tmp;
            }else{
                o2 +=tmp;
            }
            k = k-k/2;
        }
        // o1 +=1;
        // o2 +=1;
        o1 +=0;
        o2 +=0;
        if((m+n)%2==0){
            return (double)(nums1[o1] + nums2[o2])/2;
        }else{
            return (double)Math.min(nums1[o1],nums2[o2]);
        }
    }

    public static void main(String[] args){
        int[] nums1 = {1 ,3, 4, 9};
        int[] nums2 = {1, 2, 3, 3, 5, 6, 7, 8};

        double a =findMedianSortedArrays(nums1, nums2);
        System.out.println(a);
    }
}