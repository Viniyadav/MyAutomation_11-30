package pkg1;

public class Class2 
{
int r ;
public int sum (int a,int b)
{
	int c = a+b;
	return c;
}
public int sub (int a, int b)
{
	int c= a-b;
	return c;
}
public int mul (int a, int b)
{
	int c= a*b;
    return c;
}
public void div (int a, int b)
{
	int c=a/b;
	System.out.println("Final result is "+c);
}


public static void main(String [] args)
{
Class2 Vineet=new Class2 ();
int Sum_first=Vineet.sum(10,2);
int Sub_Res=Vineet.sub(Sum_first,2);
int Sum_Sec=Vineet.sum(Sub_Res,2);
int mul_Res=Vineet.mul(Sum_Sec,2);
Vineet.div(mul_Res,2);
}
}
 