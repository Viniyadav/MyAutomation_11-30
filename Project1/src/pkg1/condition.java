package pkg1;

import java.util.Scanner;

public class condition 
{
public static void main(String[] args) 
{
	System.out.println("Please enter value of a");
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	
	if(a%2==0)
	{
		System.out.println("You Entered Even Number");
	}
	else
	{
		System.out.println("You Entered Odd Number");
	}
}

}

