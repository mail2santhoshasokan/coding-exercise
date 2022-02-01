public class Program {
    public static boolean isPalindrome(String str) {
        char[] chars = new char[str.length()];
        String revr = "";
        for (int i=str.length()-1;i>=0;i--){
           revr = revr.concat(String.valueOf(str.charAt(i)));
        }

        return revr.equals(str);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("abcdcba"));

    }
}
