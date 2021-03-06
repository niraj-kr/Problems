package com.trigger.dsa.problemsolving;

import java.util.Scanner;

class IsPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int count = 0;

			for (int div = 2; div * div <= n; div++) { // Every no is divisible 1 and itself so no need for checking for
														// those two
				// to shorten the loop we have used div*div : prime factorization repeats after
				// half of its prime factorization
				// div<=root(n) i.e, div*div<=n
				if (n % div == 0) {
					count++;
					break; // only one divisor is necessary to prove it is not prime
				}
			}
			if (count == 0) {
				System.out.println("prime");
			} else {
				System.out.println("not prime");
			}
		}
	}

}
