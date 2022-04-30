public class ReverseString {
    public static String reverse(String str) {
        String result = "";
        String letter = "";
        for(int i = 0; i < str.length(); i++) {
            letter = str.substring(i,i+1);
            result = letter + result; 
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(reverse(args[0]));
    }
}
