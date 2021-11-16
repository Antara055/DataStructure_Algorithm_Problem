package com.bridgelab;

public class Merge_Sort {
    public void displayArray(String arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void splitAndMerge(String arr[], int low, int high){
        if (low<high){
            int mid = (low+high) / 2;
            splitAndMerge(arr, low, mid);
            splitAndMerge(arr, mid+1, high);
            mergeSort(arr, low, mid, high);
        }
    }

    void mergeSort(String arr[], int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;

        String L[] = new String[n1];
        String R[] = new String[n2];


        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i].compareTo(R[j])>=0) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }


        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    void sort(String arr[], int l, int r) {
        if (l < r) {

            int m = l + (r - l) / 2;

            sort(arr, l, m);
            sort(arr, m + 1, r);

            mergeSort(arr, l, m, r);
        }
    }

    public static void main(String[] args) {
        Merge_Sort merge_sort = new Merge_Sort();
        String arr[] = {"antara", "mouli", "ananya", "anuska", "munki"};
        int length= arr.length;
        System.out.println("Before mergeSort the array elements : ");
        merge_sort.displayArray(arr, length);
        merge_sort.sort( arr, 0,length-1);
        System.out.println("After mergeSort the array elements : ");
        merge_sort.displayArray(arr, length);

    }
}
