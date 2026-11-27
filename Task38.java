public class Task38 {

    public static void main(String[] args) {
        System.out.println(thirdPlusMaxPositive(new int[]{5, -2, 4, 10, -7})); 
        System.out.println(thirdPlusMaxPositive(new int[]{-1, -2, 3}));        
        try {
            thirdPlusMaxPositive(new int[]{1, 2});
        } catch (IllegalArgumentException lol) {
            System.out.println("Помилка: " + lol.getMessage());
        }
        try {
            thirdPlusMaxPositive(new int[]{-1, -2, -3});
        } catch (IllegalArgumentException lol) {
            System.out.println("Помилка: " + lol.getMessage());
        }
        try {
            thirdPlusMaxPositive(null);
        } catch (NullPointerException lol) {
            System.out.println("Помилка: " + lol.getMessage());
        }
    }

    static int thirdPlusMaxPositive(int[] array) {
        if (array == null) {
            throw new NullPointerException("array is null");
        }
        if (array.length < 3) {
            throw new IllegalArgumentException("потрібно хоча б 3 елементи");
        }
        int maxPositive = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxPositive) {
                maxPositive = array[i];
            }
        }
        if (maxPositive == 0) {
            throw new IllegalArgumentException("немає додатних елементів");
        }
        return array[2] + maxPositive;
    }
}
