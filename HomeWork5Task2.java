public class HomeWork5Task2 {
    public static void main(String[] args) {
        int[] array = {3, 5, 0, 1, 1, 3, 5, 2, 2, 2, 4};
        int n = array.length;

        for (int i = 0, m = 0; i != n; i++, n = m) {
            for (int j = m = i + 1; j != n; j++) {
                if (array[j] != array[i]) {
                    if (m != j)
                        array[m] = array[j];
                    m++;
                }
            }
        }

        if (n != array.length) {
            int[] newArray = new int[n];
            for (int i = 0; i < n; i++)
                newArray[i] = array[i];
            array = newArray;
        }

        for (int newArray : array)
            System.out.print(newArray + " ");
    }
}
