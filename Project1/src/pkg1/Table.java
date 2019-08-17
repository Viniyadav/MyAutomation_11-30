package pkg1;

import java.util.Scanner;

public class Table 
{
public static void main(String[] args) 
{
	Scanner s = new Scanner (System.in);
	System.out.println("Enter Any Number=");
	int n= s.nextInt();
	System.out.println("Table of " +n+ " is");
    for (int i=1;i<=10;i++)
    	
    {
    	System.out.println(n*i);
    }
}
}
