import java.util.Random;

public class HomeWork5Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        int max = 0;
        int min = 0;
        int maxEven = 0;
        int maxOdd = 0;
        System.out.print("Random array: ");

        for (int index = 0; index < array.length; index++) {
            array[index] = random.nextInt(10);
            System.out.print(array[index] + " ");
        }

        for (int index = 0; index < array.length; index++) {
            if (array[index] > max)
                max = array[index];
            if (array[index] < min)
                min = array[index];
        }
        System.out.print("\nMaximum number = " + max);
        System.out.print("\nMinimum number = " + min);

        for (int index = 0; index < array.length; index++) {
            if (array[index] % 2 == 0 && array[index] > maxEven)
                maxEven = array[index];
            if (array[index] % 2 == 1 && array[index] > maxOdd)
                maxOdd = array[index];
        }
        System.out.print("\nMaximum even number = " + maxEven);
        System.out.print("\nMaximum odd number = " + maxOdd);
    }
}
