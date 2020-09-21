package Bit;

public class BitDemo {
    public static void main(String[] args) {
        short a = 3;
        int b = 3;
        System.out.println(a << 12);
        System.out.println(b << 12);

        for (int i = 0; i <= 100; i++){
            System.out.println(i + "\t\t" + ~i);
        }
    }
    public static int multiply1(int a, int b) {
        return a * b;
    }
}
