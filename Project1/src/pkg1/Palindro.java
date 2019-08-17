package pkg1;

import java.util.Scanner;

public class Palindro 
{
public static void main(String[] args) 
{
	Scanner pal = new Scanner(System.in);
	System.out.println("Please Enter a Number");
int n=pal.nextInt();
int temp = n, rev=0,rem; 
while (temp!=0)
{
	rem=temp%10;
	rev=rev*10+rem;
	temp=temp/10;
}

if(n==rev)
{
	System.out.println(n+" Number is palindrome");
}
else
{
	System.out.println(n+" is not a palindrome number");
}
}
}
