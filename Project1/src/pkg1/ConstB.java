package pkg1;

public class ConstB extends ConstA
{
public ConstB() 
{
	this (25);
	System.out.println("Child Defaut Constructor");
}
public ConstB(int a) 
{
	super(50,80);
	System.out.println("Child 1 parametrized Constructor");
}
public ConstB(int a, int b) 
{
	this (40,5,15);
	System.out.println("Child 2 parametrized Constructor");
}
public ConstB(int a, int b, int C) 
{
	this ();
	System.out.println("Child 3 parametrized Constructor");
}
public static void main(String[] args) 
{
	ConstB ob= new ConstB(40,5);
}
}
