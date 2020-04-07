package DataStructure.Stack;

import java.util.Stack;

public class GetValue {
    public static Double getValue(String str) {
        Stack<Number> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                stack.push(ch - '0');
            } else {
                switch (ch) {
                    case '+':
                        stack.push(operate(stack.pop(), '+', stack.pop()));
                        break;
                    case '-':
                        stack.push(operate(stack.pop(), '-', stack.pop()));
                        break;
                    case '*':
                        stack.push(operate(stack.pop(), '*', stack.pop()));
                        break;
                    case '/':
                        stack.push(stack.push(operate(stack.pop(), '-', stack.pop())));
                        break;
                        default:
                            break;
                }
            }

        }
        return stack.peek().doubleValue();
    }
    private static Number operate(Number op1, char op, Number op2) {
        switch (op) {
            case '+':
                return op1.doubleValue() + op2.doubleValue();
            case '-':
                return op1.doubleValue() - op2.doubleValue();
            case '*':
                return op1.doubleValue() * op2.doubleValue();
            case '/':
                return op1.doubleValue() / op2.doubleValue();
                default:
                    throw new ArithmeticException();

        }
    }

    public static void main(String[] args) {
        System.out.println(getValue("6523+8*+3+*"));
    }
}
