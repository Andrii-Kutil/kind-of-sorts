package kutil;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 3, 9, 6, 7, 2, 8, 4, 5};
        new BubbleSort().bubbleSort(arr1);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = new int[]{657, 234, 67889, 0, 23, 1};
        new MergeSort().sort(arr2, 0, arr2.length - 1);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = new int[]{56, 34, 87, 9, 232, 54, 9};
        new InsertionSort().sort(arr3);
        System.out.println(Arrays.toString(arr3));

        int[] arr4 = new int[]{5456, 789, 34234, 870, 45, 34};
        new QuikSort().sort(arr4, 0, arr4.length - 1);
        System.out.println(Arrays.toString(arr4));

        int[] arr5 = new int[]{0, 87, 45, 45, 56, 234, 8, 0};
        new SelectionSort().sort(arr5);
        System.out.println(Arrays.toString(arr5));
    }
}