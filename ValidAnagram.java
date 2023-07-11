import java.util.Arrays;

/**
 * ValidAnagram
 */
public class ValidAnagram {

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }

    private static boolean isAnagram(String s, String t) {
        var ss = s.toCharArray();
        var ts = t.toCharArray();
        Arrays.sort(ss);
        Arrays.sort(ts);
        return new String(ss).toLowerCase().equals(new String(ts).toLowerCase());
    }
}