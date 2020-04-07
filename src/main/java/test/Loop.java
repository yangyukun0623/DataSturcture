package test;

import java.util.Stack;

public class Loop {
    private static Stack<Character> StrToStack(String str) {
        Stack<Character> op = new Stack<>();
        Stack<Character> res = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') continue;
            if (Character.isDigit(ch)) {
                res.push(ch);
                continue;
            }
            if (ch == '(') op.push(ch);
            if (ch == ')') {
                while (op.peek() != '('){
                    res.push(op.pop());
                }
                //op.pop();
            }
            if (ch == '+' || ch == '-') {
                while (!op.empty()) {
                    if (op.pop() == '(')
                        break;
                    res.push(op.pop());
                }
            }


        }
        return res;
    }

    public static void main(String[] args) {
        Stack<Character> stack = StrToStack("9+(3-1)*3+10/2");
        Stack<Character> op = new Stack<>();

        System.out.println("\n" + toString(stack));
    }

    private static String toString(Stack<Character> stack) {
        StringBuilder res = new StringBuilder();
        res.append(" [");
        while (!stack.empty()) {
            res.append(stack.pop() + ", ");
        }
        res.append("] ");
        return res.toString();
    }
}
