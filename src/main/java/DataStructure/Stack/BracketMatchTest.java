package DataStructure.Stack;

import java.util.Stack;

public class BracketMatchTest {
    public static void main(String[] args) {
        String str = "(�Ϻ�(����)())";
        System.out.println(str + "�������Ƿ�ƥ��:" + isMatch(str));
    }

    /**
     * �ж��ַ����е������Ƿ�ƥ��
     * @param str ������ɵ��ַ���
     * @return  ���ƥ�䷵��true�������ƥ�䷵��false
     * */
    public static boolean isMatch(String str) {
        //1.����ջ�������ڴ洢����
        Stack<Character> stack = new Stack<>();
        //2.�������ұ����ַ���
        for (int i = 0; i < str.length(); i++) {
            char curChar = str.charAt(i);
            //�жϵ�ǰ�ַ�����������ţ���ջ
            if (curChar == '(') {
                stack.push(curChar);
            } else if (curChar == ')') {
                //�����жϵ�ǰ�ַ��Ƿ�������
                Character pop = stack.pop();
                if (pop == null){
                    return false;
                }
            }
        }
        //�ж�ջ�л���û��ʣ������ţ��з���false��û�з���true
        return stack.isEmpty();
    }
}
