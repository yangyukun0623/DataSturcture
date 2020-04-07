package DataStructure.Stack;

import java.util.Stack;

public class Operation {
    private Stack<Character> s;
    private String input;

    public Operation(String input) {
        s = new Stack<>();
        this.input = input;
    }

    public void Change() {
        int len = input.length();
        int flag = 0;
        for(int i = 0; i < len; i++) {
            Character ch = input.charAt(i);
            if (ch.equals('+') || ch.equals('-')) {
                while (!s.empty() && (s.peek() == '*' || s.peek() == '/')) {
                    flag = 1;
                    if (i != 0) System.out.print(' ');  //第一位不输出空格
                    System.out.print(s.pop());
                }
                if (!s.empty() && (s.peek() == '*' || s.peek() == '/')) {
                    flag = 1;
                    if (i != 0) System.out.print(' ');
                    System.out.print(s.pop());
                }
                s.push(ch);
            } else if (ch == '*' || ch == '/') {
                flag = 1;
                if (!s.empty() && (s.peek() == '*' || s.peek() == '/')) {
                    if (i != 0) System.out.print(' ');
                    System.out.print(s.pop());
                }
                s.push(ch);
            } else if (ch == '(') {
                s.push(ch);
            } else if (ch == ')') {
                while (!s.empty() && s.peek() != '(') {
                    if (i != 0) System.out.print(' ');
                    System.out.print(s.pop());
                }
                s.pop();
            } else if (Character.isDigit(ch)) {
                if (flag == 1 && input.charAt(i - 1) != '.' && !Character.isDigit(input.charAt(i - 1)))
                    System.out.print(' ');  //连续数字或小数点不输出空格
                flag = 1;
                System.out.print(ch);
            }
        }
        while (!s.empty()) {    //将栈内元素全部输出
            System.out.print(' ');
            System.out.print(s.pop());
        }
    }


    public static void main(String[] args) {
        new Operation("3 * ( 4 + 2 )").Change();
    }
}
