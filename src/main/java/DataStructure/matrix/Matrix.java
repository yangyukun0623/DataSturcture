package DataStructure.matrix;

public class Matrix {
    public static void main(String[] args) {
        int[][] m = new int[12][12];
        int[] n = new int[144];
        int k = 0;
        for (int j =0; j < 12; j++) {
            for (int i = 0; i <= j; i++) {
                m[i][j] = k++;
            }
        }
        print(m);
    }

    public static void print(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.printf("%2d ",m[i][j]);
            }
            System.out.println();
        }
    }
}
