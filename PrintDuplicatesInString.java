import java.util.Arrays;

public class PrintDuplicatesInString {
    public static void main(String[] args) {
        String s = "test string";
        printDuplicates(s);
    }

    private static void printDuplicates(String s) {

        char[] c = s.toCharArray();
        Arrays.sort(c);
        String str = new String(c);

        for(int i=0; i<s.length(); i++){
            int count = 1;

            while(i < str.length() - 1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }

            if(count > 1) System.out.println(str.charAt(i) + " count" + count);
        }
    }
}
