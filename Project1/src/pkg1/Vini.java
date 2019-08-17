package pkg1;

import java.util.Scanner;

public class Vini
{
public static void main(String[] args) 
{
	Scanner ob=new Scanner(System.in);
	System.out.println("Please Enter a Number:");
	int n= ob.nextInt();
	int i, p=0;
	for (i=2; i<=n-1; i++)
	{
		if (n%i==0)
		{
			p=p+1;
		}
	}
	if (p>0)
		{
			System.out.println("Number is not a prime number");
		}
		
		else
		{
			System.out.println("Number is a prime number");
		}
	}
}