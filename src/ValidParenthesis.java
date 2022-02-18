import java.util.Stack;

public class ValidParenthesis {

    public static void main(String args[]){
        String s = "()[]{}";
        ValidParenthesis validParenthesis = new ValidParenthesis();
        System.out.println(validParenthesis.isValid(s));
    }

    public boolean isValid(String s) {
        Stack<Character> leftSymbols = new Stack<>();
        if (s.length()%2!=0){
            return false;
        }

        for(char c : s.toCharArray()){
            if (c == ')' || c == ']' || c == '}'){
                leftSymbols.push(c);
            } else if (c == ')' && !leftSymbols.isEmpty() && leftSymbols.peek() == '('){
                leftSymbols.pop();
            } else if (c == ']' && !leftSymbols.isEmpty() && leftSymbols.peek() == '['){
                leftSymbols.pop();
            } else if (c == '}' && !leftSymbols.isEmpty() && leftSymbols.peek() == '{'){
                leftSymbols.pop();
            } else {
                return false;
            }
        }

        return leftSymbols.isEmpty();

    }


}
