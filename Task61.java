import java.util.Arrays;

public class Task61 {

    public static void main(String[] args) {
        int[] a = {1, -2, 3, 0, -5};
        int[] b = {4, -3, -1, 7, -2};
        System.out.println(Arrays.toString(makeC(a, b))); 
        try {
            makeC(new int[]{1, 2}, new int[]{1});
        } catch (IllegalArgumentException lol) {
            System.out.println("Помилка: " + lol.getMessage());
        }
        try {
            makeC(null, new int[]{1});
        } catch (NullPointerException lol) {
            System.out.println("Помилка: " + lol.getMessage());
        }
    }

    static int[] makeC(int[] a, int[] b) {
        if (a == null || b == null) {
            throw new NullPointerException("array is null");
        }
        if (a.length != b.length) {
            throw new IllegalArgumentException("масиви різної довжини");
        }
        int[] c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0 && b[i] > 0) {
                c[i] = a[i] + b[i];
            } else if (a[i] < 0 && b[i] < 0) {
                c[i] = a[i] * b[i];
            }
        }
        return c;
    }
}
