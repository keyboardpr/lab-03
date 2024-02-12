import java.util.ArrayList;
import java.util.Arrays;

public class Sorter {
    public static void main(String[] args) {

        System.out.println("Hello");
        int[] unsortedArray = {64, 25, 12, 22, 11};

        System.out.println("Unsorted Array:");
        for (int value : unsortedArray) {
            System.out.print(value + " ");
        }

        selectionSort(unsortedArray);

        System.out.println("\nSorted Array:");
        for (int value : unsortedArray) {
            System.out.print(value + " ");
        }

    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
    public static void sort(int[] arr) {
        insertionSort(arr);
    }
}
