import java.util.Arrays;

public class HomeWork5Task3 {
    public static void main(String[] args) {
        int[] array1 = {2, 4, 5, 10, 21};
        int[] array2 = {3, 7, 8, 12, 20};
        int[] newArray = new int[array1.length + array2.length];
        System.out.print("New array: ");
        for (int indexFirstArray = 0; indexFirstArray < array1.length; indexFirstArray++) {
            newArray[indexFirstArray] = array1[indexFirstArray];
        }
        for (int indexFirstArray = newArray.length - array1.length; indexFirstArray < newArray.length; indexFirstArray++) {
            newArray[indexFirstArray] = array2[indexFirstArray - array1.length];
        }
        for (int indexFirstArray = 0; indexFirstArray < newArray.length; indexFirstArray++)
            System.out.print(newArray[indexFirstArray] + " ");
        Arrays.sort(newArray);
        System.out.print("\nSorted array: ");
        for (int indexNewArray = 0; indexNewArray < newArray.length; indexNewArray++) {
            System.out.print(newArray[indexNewArray] + " ");
        }
    }
}
