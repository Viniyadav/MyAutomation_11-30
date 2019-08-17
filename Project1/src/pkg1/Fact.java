package pkg1;

import java.util.Scanner;

public class Fact 
{
public static void main(String[] args) 
{
	Scanner s = new Scanner(System.in);
	System.out.println("Please Enter Number:");
	int n = s.nextInt();
	int Fact=1, i;
	
	for(i=1; i<=n; i++)
	{
		Fact=Fact*i;
	}
	
	System.out.println("Factorial Number:"+Fact);
}
}