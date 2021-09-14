package com.bz.Day6;

public class PrimeNum1 {
	public static void main(String[] args) {
		int num=11,temp=0;
		for(int i=2;i<num-1;i++)
		{
			if(num%i==0)
			{
				temp=temp +1;
				
			}
		}
		if(temp>0)
		{
			System.out.println("not a prime");
		}
		else
		{
			System.out.println("is a prime");
		}
	}

}
