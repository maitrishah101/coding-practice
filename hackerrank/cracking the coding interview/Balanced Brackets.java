public class Solution {

    static String isBalanced(String s) {
        // Complete this function
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < s.length(); i ++){
            char c = s.charAt(i);
            if(c == '[' || c == '(' || c == '{'){
                stack.push(c);
            }
            else if(c == ']'){
                if(stack.isEmpty() || stack.pop() != '['){
                    return "NO";
                }
            }
            else if(c == ')'){
                if(stack.isEmpty() || stack.pop() != '('){
                    return "NO";
                }
            }
            else if(c == '}'){
                if(stack.isEmpty() || stack.pop() != '{'){
                    return "NO";
                }
            }
        }
        if(stack.isEmpty()){
            return "YES";
        }
        return "NO";
    }
}
