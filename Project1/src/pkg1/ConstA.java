package pkg1;

public class ConstA
{
public ConstA()// TODO Auto-generated constructor stub 
{
	this (25,20,45);
	System.out.println("Parent default Constructor");
}
	
public ConstA(int a)
{
	this (); 
	System.out.println("Parent 1 parametrized Constructor");
}
public ConstA(int a, int b)
{
	this (20);
	System.out.println("Parent 2 parametrized Constructor");
}
public ConstA(int a, int b, int c)
{
	System.out.println("Parent 3 parametrized Constructor");
}
}
