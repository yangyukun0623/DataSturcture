package DataStructure.Stack;

import java.util.Stack;

public class BracketMatchTest {
    public static void main(String[] args) {
        String str = "(上海(长安)())";
        System.out.println(str + "中括号是否匹配:" + isMatch(str));
    }

    /**
     * 判断字符串中的括号是否匹配
     * @param str 括号组成的字符串
     * @return  如果匹配返回true，如果不匹配返回false
     * */
    public static boolean isMatch(String str) {
        //1.创建栈对象，用于存储括号
        Stack<Character> stack = new Stack<>();
        //2.从左往右遍历字符串
        for (int i = 0; i < str.length(); i++) {
            char curChar = str.charAt(i);
            //判断当前字符如果是左括号，入栈
            if (curChar == '(') {
                stack.push(curChar);
            } else if (curChar == ')') {
                //继续判断当前字符是否有括号
                Character pop = stack.pop();
                if (pop == null){
                    return false;
                }
            }
        }
        //判断栈中还有没有剩余的括号，有返回false，没有返回true
        return stack.isEmpty();
    }
}
