package com.bridgelab;

public class Prime_No {
    public static void main(String[] args) {
        int temp,i,j;
        for ( i=1;i<1000;i++){
            temp=0;
            for (j=2;j<i/2;j++) {
                if (i % j==0) {
                    temp++;
                    break;
                }
            }
            if (temp==0)
            System.out.println(i+"prime no");
        }
    }
}
