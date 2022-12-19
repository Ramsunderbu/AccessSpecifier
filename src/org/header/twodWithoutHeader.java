package org.header;

import java.util.ArrayList;
import java.util.List;

public class twodWithoutHeader {
	
	public static void main(String[] args) {
		List<ArrayList<String>> l=new ArrayList<ArrayList<String>>();
		//Inner list
		ArrayList<String> a=new ArrayList<String>();
		a.add("Arun");
		a.add("arun@gmail.com");
		a.add("Chennai");
		
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("Bala");
		a1.add("bala@gmail.com");
		a1.add("Pune");
		
		ArrayList<String> a2=new ArrayList<String>();
		a2.add("Babu");
		a2.add("babu@gmail.com");
		a2.add("Cochin");
		
		//Outer list
		l.add(a);
		l.add(a1);
		l.add(a2);
		ArrayList<String> arrayList = l.get(1);
		String string = arrayList.get(1);
		System.out.println(string);
		
		
	}

}
