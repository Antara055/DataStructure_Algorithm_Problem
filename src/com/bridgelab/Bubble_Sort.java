package com.bridgelab;

public class Bubble_Sort {
    public void displayArray(String arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public void bubbleSort(String arr[], int n){
        for (int i=0; i<n; i++){
            for (int j=0; j<n-i-1; j++){
                if (arr[j].compareTo(arr[j+1]) > 0){
                    String temp;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Bubble_Sort BSort = new Bubble_Sort();
        String arr[] = {"antara", "mouli", "ananya", "anuska", "munki"};
        System.out.println("Before insertionSort the array elements : ");
        BSort.displayArray(arr, arr.length);
        BSort.bubbleSort(arr, arr.length);
        System.out.println("After insertionSort the array elements : ");
        BSort.displayArray(arr, arr.length);
    }
}
