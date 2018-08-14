package jdbc;

import java.io.*;
import java.util.Scanner;

public class readWriteFile {

	public static void main(String[] args) throws IOException {
		String input1 = "C:\\\\Users\\\\AkshayC\\\\Desktop\\\\New folder\\\\file1.txt";
		String input2 = "C:\\\\Users\\\\AkshayC\\\\Desktop\\\\New folder\\\\file2.txt";

		BufferedReader br1 = new BufferedReader(new FileReader(input1));

		BufferedReader br2 = new BufferedReader(new FileReader(input2));

		String line1;
		String line2;

		String index1;
		String index2;

		while ((line2 = br2.readLine()) != null) {
			line1 = br1.readLine();

			index1 = line1.split(",")[0];
			index2 = line2.split(",")[0];


			Scanner in1 = new Scanner(index1).useDelimiter("[^0-9]+");
			int integer1 = in1.nextInt();
			
			Scanner in2 = new Scanner(index2).useDelimiter("[^0-9]+");
			int integer2 = in2.nextInt();
			
			Scanner st = new Scanner(index1).useDelimiter("[^a-z]+");
			String String = st.next();
			
			System.out.println(String+ " "+(integer1+integer2));
			
			
		}
	}
}
