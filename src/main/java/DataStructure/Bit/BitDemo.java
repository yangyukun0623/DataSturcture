package DataStructure.Bit;

public class BitDemo {
    public static void main(String[] args) {
        System.out.println(add(3, 4));
    }

    private static int add(int a, int b) {
        int result;
        int sum = a ^ b;
        int carry = (a & b) << 1;
        if (carry == 0) {
            result = sum;
        } else {
            result = add(sum, carry);
        }

        return result;
    }
}
