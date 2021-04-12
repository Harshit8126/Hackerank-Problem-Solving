/*
By : Harshit Verma 
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        float poscount = 0;
        float negcount = 0;
        float zerocount = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>0)
            {
                poscount++;
            }
            else if(arr[i]<0)
            {
                negcount++;
            }
            else if(arr[i]==0)
            {
                zerocount++;
            }
        }
        System.out.printf("%1.6f ", poscount/arr.length);
        System.out.println();
        System.out.printf("%1.6f ", negcount/arr.length);
        System.out.println();
        System.out.printf("%1.6f ", zerocount/arr.length);
        System.out.println();


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}

