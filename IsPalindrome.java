package com.example.demo;

import java.io.*;
import java.util.*;

public class IsPalindrome {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        /* Enter your code here. Print output to STDOUT. */
        int j = A.length();
        boolean isPal = false;
        int i;

        if (j==1) {isPal = true;}

        for(i=0; i<(j/2); i++)
        {
            if (A.charAt(i) != A.charAt(j-1))
            {
                isPal = false;
                break;
            }
            // if (A.charAt(i)==A.charAt(j-1))
            //  {
            j--;
            isPal = true;
            //  }

        }
        if (isPal) {System.out.print("Yes");}
        if(!isPal) {System.out.print("No");}
    }
}