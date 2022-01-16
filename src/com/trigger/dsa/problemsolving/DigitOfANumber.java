package com.trigger.dsa.problemsolving;

import java.util.Scanner;

public class DigitOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int nod = 0;//no of digits
		int temp = n;
		
		//for getting no of digits
		while(temp!=0) {
			temp=temp/10;
			nod++;
		}
		
		int div = (int)Math.pow(10, nod-1);
		//for getting the digits
		while(div!=0) {
			int q = n/div;
			System.out.print(q);
			n = n%div;
			div = div/10;
		}
		
	}

}
