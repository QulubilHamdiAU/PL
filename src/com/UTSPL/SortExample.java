package com.UTSPL;

import java.util.Arrays;

public class SortExample {
    public static void main(String[] args) {
        int[] arr = {13, 7, 6, 45, 21, 9, 2, 100};
        Arrays.sort(arr, 1, 5);
        System.out.print("Modifier arr[] : %s"+ Arrays.toString(arr));
    }
}
