package com.myapp.programs.fibonacci;

public class FibonacciExamples {
	// Driver Code
	public static void main(String args[]) {
		// Given Number N
		int N = 10;

		// Print the first N numbers
		for (int i = 0; i < N; i++) {
			//System.out.print(fib(i) + " ");
		}
	}

	// Function to print the fibonacci series
//	public static int[] fib(int n) {
//		int[] fibArr = new int[n];
//		if (n <= 1) {
//			fibArr[0] = n;
//			return fibArr;
//		}
//		for (int i = 0; i < n; i++) {
//			 fibArr[n]=fib(n - 1) + fib(n - 2);
//		}
//		return fibArr;
//	}

	// Function to find the fibonacci Series
	public static int fibArr(int n) {
		// Declare an array to store Fibonacci numbers.1 extra to handle case, n = 0
		int f[] = new int[n + 2];
		int i;
		// 0th and 1st number of the series are 0 and 1
		f[0] = 0;
		f[1] = 1;
		for (i = 2; i <= n; i++) {
			// Add the previous 2 numbers in the series and store it
			f[i] = f[i - 1] + f[i - 2];
		}
		// Nth Fibonacci Number
		return f[n];
	}

}