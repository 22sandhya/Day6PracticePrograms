package com.bz.Day6;

public class ReverseNum {
	public static void main(String[] args) {
		int rem, rev = 0, num = 4586;

		while (num != 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;

		}
		System.out.println("the reverse number is "+rev);

	}

}
