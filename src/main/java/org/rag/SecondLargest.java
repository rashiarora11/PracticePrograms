package org.rag;

import java.util.Arrays;
import java.util.Collections;

public class SecondLargest {

    static void secondLargest(Integer arr[])
    {
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Second Largest Element is :" + arr[1]);
    }

    public static void main(String[] args)
    {
        Integer arr[] = { 12, 35, 1, 10, 34, 1 };

        secondLargest(arr);
    }
}