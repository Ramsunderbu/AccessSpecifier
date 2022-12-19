package org.header;

import java.util.LinkedHashMap;
import java.util.Map;

public class onedWithHeader {
	
	public static void main(String[] args) {
		
		Map<String,String> m=new LinkedHashMap<String,String>();
		m.put("Name", "Ram");
		m.put("Email", "ram@gmail.com");
		m.put("City", "Chennai");
		
		String string = m.get("Email");
		System.out.println(string);
		
	}

}
