package org.sample;

import java.util.LinkedHashMap;
import java.util.Map;

public class KeyValues2 {
	public static void main(String[] args) {
	Map<Integer,String>m=new LinkedHashMap<Integer,String>();	
	m.put(10,"10");
	m.put(20,"20");
	m.put(30,"30");
	m.put(40,"40");
	m.put(50,"50");
	m.put(60,"60");
	m.put(10,"10");
	m.put(50,"50");
	m.put(40,"40");
	System.out.println(m);
}
}
	
