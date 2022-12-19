package org.header;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class twodWithHeader {
	
public static void main(String[] args) {
	
		List<LinkedHashMap<String,String>> l=new ArrayList<LinkedHashMap<String,String>>();
		
		LinkedHashMap<String,String> m=new LinkedHashMap<String,String>();
		m.put("Name", "Ram");
		m.put("Email", "ram@gmail.com");
		m.put("City", "Chennai");
		
		LinkedHashMap<String,String> m1=new LinkedHashMap<String,String>();
		m1.put("Name", "Ram");
		m1.put("Email", "ram@gmail.com");
		m1.put("City", "Chennai");
		
		LinkedHashMap<String,String> m2=new LinkedHashMap<String,String>();
		m2.put("Name", "Ram");
		m2.put("Email", "ram@gmail.com");
		m2.put("City", "Chennai");
		
		String string = m.get("Email");
		System.out.println(string);
		
	}


}
