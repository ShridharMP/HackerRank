package SockMarket;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
	 public static void main(String[] args) {
		 System.out.println("Enter the Size no of socks Present");
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int c[] = new int[n];
	        System.out.println("Enter the Socks color code");
	        for (int c_i = 0; c_i < n; c_i++) {
	            c[c_i] = in.nextInt();
	        }
	        Arrays.sort(c);
	        int total = 0;
	        for (int i = 0; i < n - 1; i++) {
	            if (i < n && c[i] == c[i + 1]) {
	                total++;
	                i = i + 1;
	            }
	        }
	        System.out.println(total);
	 
	    }
}

