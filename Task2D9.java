import java.util.Arrays;

public class Task2D9 {

    public static void main(String[] args) {
        int[][] m = {{0, 5, 0}, 
                     {7, 0, 9}};
        System.out.println(Arrays.toString(toArray(m))); 
        try {
            toArray(null);
        } catch (NullPointerException lol) {
            System.out.println("Помилка: " + lol.getMessage());
        }
    }

    static int[] toArray(int[][] matrix) {
        if (matrix == null) {
            throw new NullPointerException("matrix is null");
        }
        int count = 0;
        for (int[] row : matrix) {
            for (int x : row) {
                if (x != 0) count++;
            }
        }
        int[] result = new int[count * 3];
        int k = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != 0) {
                    result[k++] = i+1;
                    result[k++] = j+1;
                    result[k++] = matrix[i][j];
                }
            }
        }
        return result;
    }
}
