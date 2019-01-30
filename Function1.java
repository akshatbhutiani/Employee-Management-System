package demo.database;

import java.util.ArrayList;
import java.io.*;
public class Function1{
	public ArrayList<Employee> list = new ArrayList<Employee>();
	
	public static void main(String[] args)throws IOException{
		
		Utility util = new Utility(); 
		Function1 fn = new Function1();
		
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Type Start to begin the program");
	   	String s = br1.readLine();
	    util.start(s,fn.list);
	    util.display(fn.list);
	    util.remove(fn.list);
	    System.exit(0);
	}
}
