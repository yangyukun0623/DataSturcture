package DataStructure.Stack;

import java.util.Stack;

public class ChangeDemo01 {
    public static String Change(String str) {
        Stack<Character> stack = new Stack<>();
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') continue;
            if (Character.isDigit(ch)) {
                out.append(ch + " ");
                continue;
            }

        }
        while (!stack.empty()) out.append(stack.pop() + " ");
        return out.toString();
    }



    private static int getPrec(char op) {
        int prec = 0;
        switch (op) {
            case '+':
            case '-':
                prec = 1;
                return prec;
            case '*':
            case '/':
                prec = 2;
                return prec;
                default:
                    return prec;
        }
    }

    public static void main(String[] args) {
        String str = "3 * ( 4 + 2 )";
        System.out.println(Change(str));
    }
}
