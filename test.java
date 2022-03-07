import java.util.HashMap;

public class test {
    public static int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for(int i = 0; i < s.length(); i++) {
            String c = String.valueOf(s.charAt(i));
            if(map.containsKey(c)){
                start = map.get(c) + 1;
            }else{
                map.put(c, i);
                end = i;
            }
        }
        return end - start;
    }

    public static void main(String[] args){
        String s = "hello world";
        int a =lengthOfLongestSubstring(s);
        System.out.println(a);
    }
}