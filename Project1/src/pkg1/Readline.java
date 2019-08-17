package pkg1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Readline 
{	
		public static void main(String[] args) throws IOException 
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter Line Number:");
        int a=sc.nextInt();
        readline(a);
		}
        public static String readline(int num) throws IOException
        {
        	File f=new File ("C:\\Users\\Unicode\\Desktop\\Vineet.txt");
    		FileReader fr=new FileReader(f);
    		BufferedReader b=new BufferedReader(fr);
    		String s;	
    		int r=0;
		while ((s = b.readLine())!=null)
		{
			r++;
			if (r==num)
			{
 System.out.println(s);
			}
		}
		return null;
        }
}

	

