import java.util.Stack;

public class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1); // Base index
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();

                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    maxLength = Math.max(maxLength, i - stack.peek());
                }
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.longestValidParentheses("(()"));      // 2
        System.out.println(sol.longestValidParentheses(")()())"));   // 4
        System.out.println(sol.longestValidParentheses(""));         // 0
    }
}
