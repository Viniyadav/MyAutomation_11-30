package pkg1;

import java.util.Scanner;

public class prime 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Please Enter a Number:");
		int n=s.nextInt();
		if(isPrime(n))
		{
			System.out.println(n+" is a Prime Number");
		}
		else
		{
			System.out.println(n+ " is not prime number");
		}
		
		
	}

	private static boolean isPrime(int n) 
	{
	for (int i=2; i<=n/2; i++)
	{
		if (n%i==0)
		{
			return false;
		}
	}
return true;
}
}