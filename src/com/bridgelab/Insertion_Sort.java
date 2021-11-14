package com.bridgelab;

public class Insertion_Sort {
    public void displayArray(String arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void insertionSort(String arr[], int n) {
        for (int i = 1; i < n; i++) {
            String temp = arr[i];
            for (int j = i; j > 0; j--) {
                if (arr[j - 1].compareTo(temp) > 0) {
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Insertion_Sort InSort = new Insertion_Sort();
        String arr[] = {"antara", "mouli", "ananya", "anuska", "munki"};
        System.out.println("Before insertionSort the array elements : ");
        InSort.displayArray(arr, arr.length);
        InSort.insertionSort(arr, arr.length);
        System.out.println("After insertionSort the array elements : ");
        InSort.displayArray(arr, arr.length);
    }
}
