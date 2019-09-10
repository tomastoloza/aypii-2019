package hackerrank;

import java.util.Arrays;

public class Searchs {


    public static void main(String[] args) {
        int[] arr = {5, 9, 4, 6, 5, 3};
        System.out.println(Arrays.toString(arr));
//        quickSort(arr, 0, arr.length - 1);
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
        int[] bin = {2, 5, 7, 9, 10, 43};
//        System.out.println(binarySearch(bin, 0, bin.length, 7));
    }

    private static int binarySearch(int[] bin, int start, int end, int i) {
        int middle = (start + end) / 2;
        if (bin[middle] == i) {
            return middle;
        } else if (bin[middle] > i) {
            return binarySearch(bin, start, middle, i);
        } else if (bin[middle] < i) {
            return binarySearch(bin, middle + 1, end, i);
        }
        return -1;
    }

    private static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    private static void quickSort(int[] array, int start, int end) {
        if (end <= start) {
            return;
        }
        int ultimoIntercalado = start;
        for (int i = start + 1; i <= end; i++) {
            if (array[i] < array[start]) {
                swap(array, ++ultimoIntercalado, i);
            }
        }
        swap(array, start, ultimoIntercalado);
        quickSort(array, start, ultimoIntercalado - 1);
        quickSort(array, ultimoIntercalado + 1, end);
    }

    private static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }


}
