package learn.practice.questions.dp;

import java.util.Scanner;

public class SellingWines {
	/**
	 * Problem statement 
	 * https://leetcode.com/discuss/interview-question/1282577/selling-wine-dp-easy-c
	 */
	
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Get n: ");
		int n = sc.nextInt();
		System.out.println("Get arr: ");
		int[] arr = new int[n];
		for(int i = 0; i < n;i ++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Calling Recursive method: ");
		// recursive call 
		System.out.println("Result: " + recursionFun(arr, 0, n-1, 1));
		
		System.out.println("Calling DP method : ");
		
	}
	
	// Recursive implementation 
	private int recursionFun(int[] arr, int left, int right, int year) {
		if(left > right) return 0;
		if(left == right) return arr[left]*year;
		
		int l =  (arr[left]  * year) + recursionFun(arr, left+1, right, year+1);
		int r = (arr[right] * year) + recursionFun(arr, left, right -1, year+1);
		return Math.max(l,  r);
	}
	
	
}
