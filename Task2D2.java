import java.util.Arrays;

public class Task2D2 {

    public static void main(String[] args) {
        int[][] m = {{1, 2}, 
                     {3, 4}, 
                     {5, 6}};
        lolSwap(m);
        System.out.println(Arrays.deepToString(m)); 
        try {
            lolSwap(new int[0][]);
        } catch (IllegalArgumentException lol) {
            System.out.println("Помилка: " + lol.getMessage());
        }
        try {
            lolSwap(null);
        } catch (NullPointerException lol) {
            System.out.println("Помилка: " + lol.getMessage());
        }
    }

    static void lolSwap(int[][] matrix) {
        if (matrix == null) {
            throw new NullPointerException("matrix is null");
        }
        if (matrix.length == 0) {
            throw new IllegalArgumentException("матриця порожня");
        }
        int[] tmp = matrix[0];
        matrix[0] = matrix[matrix.length - 1];
        matrix[matrix.length - 1] = tmp;
    }
}
