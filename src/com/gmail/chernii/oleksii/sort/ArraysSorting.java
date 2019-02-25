package com.gmail.chernii.oleksii.sort;

import java.util.Arrays;

/**
 * Created by Space on 22.02.2019.
 */
public class ArraysSorting {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++)
            arr[i] = (int) (Math.random() * 10);

        System.out.println(Arrays.toString(arr));

        int[]qArr = quickSort(arr);
        int[]mArr = mergeSort(arr);
        int[]bArr = bubbleSort(arr);
        int[]iArr = insertionSort(arr);
        int[]sArr = selectionSort(arr);

        System.out.println(Arrays.toString(arr) + "   ===> original");
        System.out.println(Arrays.toString(qArr));
        System.out.println(Arrays.toString(mArr));
        System.out.println(Arrays.toString(bArr) + "  ===> bubble");
        System.out.println(Arrays.toString(iArr) + "  ===> insertion");
        System.out.println(Arrays.toString(sArr) + "  ===> selection");
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
        if (array.length == 0)
            return;
        if (low >= high)
            return;
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
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            quick(array, low, j);
        if (high > i)
            quick(array, i, high);
    }

    private static void merge(int[] array, int low, int high) {
        if (high <= low)
            return;
        int mid = low + (high - low) / 2;
        merge(array, low, mid);
        merge(array, mid + 1, high);
        int[] buf = Arrays.copyOf(array, array.length);
        for (int k = low; k <= high; k++)
            buf[k] = array[k];
        int i = low, j = mid + 1;
        for (int k = low; k <= high; k++) {
            if (i > mid) {
                array[k] = buf[j];
                j++;
            } else if (j > high) {
                array[k] = buf[i];
                i++;
            } else if (buf[j] < buf[i]) {
                array[k] = buf[j];
                j++;
            } else {
                array[k] = buf[i];
                i++;
            }
        }
    }

    private static void bubble(int[] array) {
        int temp;
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    private static void insertion(int[] array) {
        int temp, j;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                temp = array[i + 1];
                array[i + 1] = array[i];
                j = i;
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
            for (int j = i + 1; j < array.length; j++)
                if (array[j] < array[least]) {
                    least = j;
                }
            int temp = array[least];
            array[least] = array[i];
            array[i] = temp;
        }
    }
}
