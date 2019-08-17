package pkg1;

import java.util.Scanner;

public class Swap 
{
	public static void main(String[] args) 
	{
		int x, y;
		System.out.println("Please enter value of X and Y");
		Scanner s=new Scanner(System.in);
		x=s.nextInt();
		y=s.nextInt();
		
		System.out.println("Before Swapping value is\nx="+x+ "\ny="+y);
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("After Swapping Value is \nx="+x+ "\ny="+y);
		
	}
}
