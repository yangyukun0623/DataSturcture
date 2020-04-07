package DataStructure.Stack;

import org.junit.jupiter.api.Test;

public class TestArrayStack {
    @Test
    public void testArray(){
        ArrayStack stack = new ArrayStack(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push("abc");
        System.out.println(stack.peek());
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.peek());

    }

    @Test
    public void testStringReversal(){
        ArrayStack stack = new ArrayStack();
        String str = "How are you?";
        char[] chars = str.toCharArray();
        for(char c : chars){
            stack.push(c);
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }

        System.out.println(sb.toString());
    }

    @Test
    public void testMatch(){
        ArrayStack stack = new ArrayStack();
        String str = "<abc[123>abc]";
        char[] chars = str.toCharArray();
        for (char c : chars){
            switch (c){
                case '{':
                case '[':
                case '<':
                    stack.push(c);
                    break;
                case '}':
                case ']':
                case '>':
                    if (!stack.isEmpty()){
                        char ch = stack.pop().toString().toCharArray()[0];
                        if (c == '}' && ch != '{'
                        || c == ']' && ch != '['
                        || c == ')' && ch != '('){
                            System.out.println("Error: " + ch + "-" + c);
                        }
                    }
                    break;
                default:
                    break;
            }
        }
    }
}
