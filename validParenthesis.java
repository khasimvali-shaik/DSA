import java.util.Stack;

public class validParenthesis {
    public static void main(String[] args) {
        String s = "({[]})";
        System.out.println(validateParenthesis(s));
    }

    // find the lenght of the valid parameters in the given string
    private static int validateParenthesis(String s) {

        Stack<Character> stack = new Stack<>();

        for(Character c : s.toCharArray()){
            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);
            }
            else if(c == ')' && !stack.isEmpty() && stack.peek() == '('){
                stack.pop();
            }
            else if(c == ']' && !stack.isEmpty() && stack.peek() == '['){
                stack.pop();
            }
            else if(c == '}' && !stack.isEmpty() && stack.peek() == '{'){
                stack.pop();
            }
        }
        return s.length() - stack.size();
    }
}
