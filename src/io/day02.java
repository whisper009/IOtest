package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class day02 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		FileOutputStream fos=new FileOutputStream("F:/haha.txt");
		OutputStreamWriter osw=new OutputStreamWriter(fos);
		PrintWriter pw=new PrintWriter(osw);
		String data=null;
		while((data=br.readLine())!=null){
			//pw.write(data);
			pw.println(data);
			pw.flush();
		}
		
		br.close();
		pw.close();
	}
}
