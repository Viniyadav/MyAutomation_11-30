package pkg1;

public class primelist 
{
	public static void main(String[] args) 
	{
		for (int n=5;n<=50;n++)
		{
			int temp=0;
			for (int i=2; i<=n-1; i++)
			{
				if (n%i==0)
				{
					temp=temp+1;
				}
			}
			if (temp==0)
			{
				System.out.println(n);
			}
		}
	}

}
