/*

@author : Harshit Verma

*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the staircase function below.
    static void staircase(int n) 
    {
        int i,j;
        for(i=1;i<=n;i++)//l1
        {
        for(j=i;j<n;j++)//l3
        {
            System.out.print(" ");
        }
        for(j=1;j<=i;j++)
        {
            System.out.print("#");
        }
        System.out.print("\n");
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
