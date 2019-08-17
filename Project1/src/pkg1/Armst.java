package pkg1;

import java.util.Scanner;

public class Armst 
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner (System.in);
		System.out.println("Please enter a number");
		int n= s.nextInt();
		int t1=n;int leng=0;
		while (t1!=0)
		{
			leng=leng+1;
			t1=t1/10;
		}
		
		int t2=n; int rem;
		 int arm=0;
		 
		while(t2!=0)
		{
			int mul=1;
			rem=t2%10;
			for (int i=1; i<=leng;i++)
			{
				mul=mul*rem;
			}
			
			arm=arm+mul;
			t2=t2/10;
		}
		
		if(arm==n)
		{
			System.out.println(n+" Number is Armstong");
		}
		else 
		System.out.println(n+" Number is not Armstrong");	
	}

}
