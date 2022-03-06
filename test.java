public class test {
    public static void main(String[] args){
        // System.out.println("Hello World!");
        String s = "Hello";
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.print(c);
            System.out.println(i);
        }
    }
}