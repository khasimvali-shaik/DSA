public class validPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.err.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        String s1 = s.replaceAll("[^a-zA-Z0-9]", "");
        var sb = new StringBuilder(s1);
        sb.reverse();
        return s1.toLowerCase().equalsIgnoreCase(sb.toString().toLowerCase());
    }
}
