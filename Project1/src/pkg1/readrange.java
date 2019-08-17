package pkg1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class readrange {

	public void readLine(int Fl, int Ll) throws IOException {

		File f = new File("C:\\Users\\Unicode\\Desktop\\Vineet.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String data;
		int Line = 0;
		for (int i = Fl; i <= Ll; i++) {
			while ((data = br.readLine()) != null) {
				Line++;
				if (Line >= Fl && Line <= Ll) {
					System.out.println(data);
				}
			}
			
		}

		br.close();
	}

	public static void main(String[] args) throws IOException {
		 readrange rn=new readrange();
		int fir, las;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Range");
		fir = sc.nextInt();
		System.out.println("Enter Second Range");
		las = sc.nextInt();
		if (fir < las) {
			rn.readLine(fir, las);
		} else {
			System.out.println("Fir Value should be less than Las");
		}

	}

}
