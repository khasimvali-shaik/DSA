/**
 * RemoveConsecutiveElements
 */
public class RemoveConsecutiveElements {

    public static void main(String[] args) {
        String s = "aabaa";
        System.out.println(removeConsecutiveCharacter(s));
    }

    public static String removeConsecutiveCharacter(String S){

        StringBuilder sb = new StringBuilder(S);
        char c = '_';
        
        for(int i=1; i<S.length(); i++){
            
            if(S.charAt(i-1) == S.charAt(i)){
                sb.setCharAt(i, c);
            }
        }
        
        return sb.toString().replace("_", "");
    }
}