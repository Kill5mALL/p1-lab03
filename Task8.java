public class Task8 {

    public static void main(String[] args) {
        System.out.println(sumDivisibleBy3(new int[]{1, 3, 6, 7, 9, -3})); 
        System.out.println(sumDivisibleBy3(new int[]{1, 2, 4}));           
        try {
            sumDivisibleBy3(null);
        } catch (NullPointerException lol) {
            System.out.println("Помилка: " + lol.getMessage());
        }
    }

    static int sumDivisibleBy3(int[] array) {
        if (array == null) {
            throw new NullPointerException("array is null");
        }
        int sum = 0;
        for (int x : array) {
            if (x % 3 == 0) {
                sum += x;
            }
        }
        return sum;
    }
}
