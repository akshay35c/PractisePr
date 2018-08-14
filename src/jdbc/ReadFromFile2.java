package jdbc;

import java.io.*;

public class ReadFromFile2 {
	public static void main(String[] args) throws Exception {
		File file = new File("C:\\\\Users\\\\AkshayC\\\\Desktop\\\\New folder\\\\file1.txt");

		BufferedReader br = new BufferedReader(new FileReader(file));
	String st;
	while((st=br.readLine())!= null) {
		System.out.println(st);
	}
	}
}