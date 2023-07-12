/**
 * StringToMobileNumber
 */
public class StringToMobileNumber {

    public static void main(String[] args) {
        String s = "HELLO WORLD";

        System.out.println(findNumber(s));
    }

    private static String findNumber(String s) {
        s = s.toUpperCase();
        String res = "";
        int pos = -1;
        String[] data = {
            "2", "22", "222", "3", "33", "333", "4", "44", "444", "5", "55", "555", "6", "66", "666",
            "7", "77", "777", "7777", "8", "88", "888", "9", "99", "999", "9999"
        };

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == ' '){
                res += "0";
            }
            else{
                pos = s.charAt(i) - 'A';
                res += data[pos];
            }
        }
        return res;
    }
}