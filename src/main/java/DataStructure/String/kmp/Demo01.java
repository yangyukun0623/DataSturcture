package DataStructure.String.kmp;
/**
 * �ַ���ƥ���㷨��KMP�㷨
 *
 *
 *
 * */
public class Demo01 {
    private static int[] getNext(String str) {
        int[] next = new int[str.length()];
        char[] ch = str.toCharArray();
        int j = -1;
        next[0] = -1;   //��ʼ��j = next[0] = -1
        for (int i = 1; i < str.length(); i++) {
            while (j != -1 && ch[i] != ch[j + 1]) {
                j = next[j];    //������j = next[j];
            }   //ֱ���ص�-1������ch[i] == ch[j+1]
            if (ch[i] == ch[j + 1]) {
                j++;
            }
            next[i] = j;
        }
        return next;
    }

    public static boolean violentMatch(String s, String p) {
        int sLen = s.length();
        int pLen = p.length();
        int[] next = getNext(p);
        int  j = -1;
        for (int i = 0; i < sLen; i++) {
            while (j != -1 && s.charAt(i) != p.charAt(j + 1)) {
                j = next[j];
            }
            if (s.charAt(i) == p.charAt(j + 1))
                j++;
            if (j == pLen - 1)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(violentMatch("abaabaabacacaabaabcc", "abaabc"));
        String s = "aabaabaabaac";
        int[] next = getNext(s);
        for (int i = 0; i < next.length; i++) {
            System.out.print(next[i] + " ");
        }
    }
}
