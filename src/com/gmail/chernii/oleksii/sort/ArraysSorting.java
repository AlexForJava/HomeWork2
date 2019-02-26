package com.gmail.chernii.oleksii.sort;

import java.util.Arrays;

/**
 * Created by Space on 22.02.2019.
 */
public class ArraysSorting {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }

        int[] quickArray = quickSort(arr);
        int[] mergeArray = mergeSort(arr);
        int[] bubbleArray = bubbleSort(arr);
        int[] insertionArray = insertionSort(arr);
        int[] selectionArray = selectionSort(arr);

        System.out.println(Arrays.toString(arr) + "  ===> original");
        System.out.println(Arrays.toString(quickArray) + "  ===> quick");
        System.out.println(Arrays.toString(mergeArray) + "  ===> merge");
        System.out.println(Arrays.toString(bubbleArray) + "  ===> bubble");
        System.out.println(Arrays.toString(insertionArray) + "  ===> insertion");
        System.out.println(Arrays.toString(selectionArray) + "  ===> selection");
    }


    public static int[] quickSort(int[] array) {
        int[] arr = Arrays.copyOf(array, array.length);
        quick(arr, 0, arr.length - 1);
        return arr;
    }

    public static int[] mergeSort(int[] array) {
        int[] arr = Arrays.copyOf(array, array.length);
        merge(arr, 0, arr.length - 1);
        return arr;
    }

    public static int[] bubbleSort(int[] array) {
        int[] arr = Arrays.copyOf(array, array.length);
        bubble(arr);
        return arr;
    }

    public static int[] insertionSort(int[] array) {
        int[] arr = Arrays.copyOf(array, array.length);
        insertion(arr);
        return arr;
    }

    public static int[] selectionSort(int[] array) {
        int[] arr = Arrays.copyOf(array, array.length);
        selection(arr);
        return arr;
    }

    private static void quick(int[] array, int low, int high) {
        if (array.length == 0) {
            return;
        }
        if (low >= high) {
            return;
        }
        int middle = low + (high - low) / 2;
        int opora = array[middle];
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }
            while (array[j] > opora) {
                j--;
            }
            if (i <= j) {
                swap(array, i, j);
                i++;
                j--;
            }
        }
        if (low < j) {
            quick(array, low, j);
        }
        if (high > i) {
            quick(array, i, high);
        }
    }

    private static void merge(int[] array, int low, int high) {
        if (high <= low) {
            return;
        }
        int mid = low + (high - low) / 2;
        merge(array, low, mid);
        merge(array, mid + 1, high);
        int[] buf = Arrays.copyOf(array, array.length);
        for (int k = low; k <= high; k++) {
            buf[k] = array[k];
        }
        //int i = low
        //int j = mid + 1;
        mid++;
        for (int k = low; k <= high; k++) {
            if (low > mid) {
                array[k] = buf[mid++];
            } else if (mid > high) {
                array[k] = buf[low++];
            } else if (buf[mid] < buf[low]) {
                array[k] = buf[mid++];
            } else {
                array[k] = buf[low++];
            }
        }
    }

    private static void bubble(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[i] < array[j]) {
                    swap(array, i, j);
                }
            }
        }
    }

    private static void insertion(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                int temp = array[i + 1];
                //array[i + 1] = array[i];
                swap(array, i + 1, i);
                int j = i;
                while (j > 0 && temp < array[j - 1]) {
                    array[j] = array[j - 1];
                    j--;
                }
                array[j] = temp;
            }
        }
    }

    private static void selection(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int least = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[least]) {
                    least = j;
                }
            }
            swap(array, least, i);
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
