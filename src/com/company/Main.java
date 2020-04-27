package com.company;

public class Main {

    public static void main(String[] args) {
         int arr[] = {4, 5, 6, 3, 2, 9};
         int n = arr.length - 1;
         System.out.println(recursivitate2(arr,n));
    }
    static int recursivitate2(int[] arr, int n){
        if(n < 0){
            return 0;
        }else {
            if (n % 2 == 0)
                return recursivitate2(arr, n - 1) - arr[n];
            else
                return recursivitate2(arr, n - 1) + arr[n];
        }
    }
}
