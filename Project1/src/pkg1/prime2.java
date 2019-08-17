package pkg1;

import java.util.Scanner;

public class prime2
{
public static void main(String[] args) 
{
	int i, p=0;
	Scanner vini= new Scanner(System.in);
	System.out.println("Please Enter a Number");
	int n= vini.nextInt();
	for (i=2; i<=n-1; i++)
	{
		if (n%i==0)
		{
			p=p+1;
		}
	}
	if (p>0)
		{
			System.out.println(n+ " Number is not a prime number");
		}
		
		else
		{
			System.out.println(n+ " Number is a prime number");
		}
	}
}