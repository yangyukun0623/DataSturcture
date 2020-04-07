package test;

import java.util.Scanner;

public class Demo01 {
    public static String reverse(String str) {
        if (str.charAt(0) == '-') {
            StringBuilder sb = new StringBuilder(str.substring(1));
            sb = sb.reverse();
            str = "-" + sb.toString();
        } else {
            StringBuilder sb = new StringBuilder(str);
            str = sb.reverse().toString();
        }
        return str;
    }

    public static String quyu(Long num) {
        if (num  == 0) {
            return String.valueOf(num);
        } else {
            if (num % 10 == 0) {
                num = num / 10;
                quyu(num);
            }
            return String.valueOf(num);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long num = sc.nextLong();

        System.out.println(reverse(quyu(num)));
    }
}
