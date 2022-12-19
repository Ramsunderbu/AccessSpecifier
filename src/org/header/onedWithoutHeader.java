package org.header;

import java.util.ArrayList;
import java.util.List;

public class onedWithoutHeader {
	
	public static void main(String[] args) {
		List<String> l=new ArrayList<String>();
		l.add("Ram");
		l.add("ram@gmail.com");
		l.add("Chennai");
		String string = l.get(2);
		System.out.println(string);
	}

}
