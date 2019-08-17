package pkg1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class writeline 
{
	public static void main(String[] args) throws IOException 
	{
		writeline wl = new writeline();
		wl.Writeline(5);
	}
	
	public void Writeline (int Lcount) throws IOException
	{
		File f = new File ("C:\\Users\\Unicode\\Desktop\\Vineet90.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the data:-");
	
			for (int i =1; i<=Lcount; i++)
			{
				String st=s.nextLine();
				bw.write(st);
				bw.newLine();
				
			}
			bw.close();
	}
	
	
}
