package io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class day01 {
	
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream(day01.class.getClassLoader().getResource("banner.txt").getPath());
		InputStreamReader isr=new InputStreamReader(fis);
		BufferedReader br=new BufferedReader(isr);
		int len=-1;
		//byte[] data=new byte[1024];
		String data=null;
		while((data=br.readLine())!=null){
			System.out.println(data);
		}
	}
}
