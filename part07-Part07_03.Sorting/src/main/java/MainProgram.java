
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};

        System.out.println("Smallest: "
                + MainProgram.smallest(array));
        System.out.println("Index of the smallest number: "
                + MainProgram.indexOfSmallest(array));

        System.out.println(MainProgram.indexOfSmallestFrom(array, 2));
        System.out.println();

        System.out.println(Arrays.toString(array));
        MainProgram.swap(array, 1, 0);
        System.out.println(Arrays.toString(array));
        System.out.println();

        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));

            int index = MainProgram.indexOfSmallestFrom(array, i);
            MainProgram.swap(array, i, index);

            System.out.println(Arrays.toString(array));
        }
    }

    public static int smallest(int[] array) {

        int smallest = array[0];

        for (int number : array) {
            if (smallest > number) {
                smallest = number;
            }
        }

        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallest = array[0];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
                index = i;
            }
        }

        return index;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int smallest = array[startIndex];
        int index = startIndex;

        for (int i = startIndex; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
                index = i;
            }
        }

        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int helper = array[index1];
        array[index1] = array[index2];
        array[index2] = helper;
    }
}
