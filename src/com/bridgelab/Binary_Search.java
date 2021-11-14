package com.bridgelab;

import java.util.Scanner;
import java.util.Arrays;

public class Binary_Search {
    public static void main(String[] args) {
        Scanner taking_input = new Scanner(System.in);
        System.out.println("Enter the number of words you want to enter : ");
        int range = taking_input.nextInt();
        String[] s = new String[range];
        System.out.println("Enter the word : ");
        for (int i = 0; i < s.length; i++) {
            String word = taking_input.next();
            s[i] = word;
        }
        System.out.println("Before sorting the array is");
        for (String str : s) {
            System.out.print(str + ",\t");
        }
        Arrays.sort(s);
        System.out.println("Ater sort:" + Arrays.toString(s));

        int left = 0;

        int right = s.length - 1;
        System.out.println("Enter the word you want to search:");
        String x = taking_input.next();
        while (left <= right) {
            int mid = (left + right) / 2;
            if (x.compareTo(s[mid]) == 0) {
                System.out.println("Index of your word is : " + mid);
                break;
            } else if (x.compareTo(s[mid]) > 0) {
                System.out.println("Index of your word  is : " + (mid + 1));
                break;
            } else {
                System.out.println("Index of your word is : " + (mid - 1));
                break;
            }
        }
    }
}
