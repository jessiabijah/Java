package org.network;

public class Wifi {
public void wifiName() {
System.out.println("wifiname=jio");
}
public static void main(String[] args) {
	Wifi w=new Wifi();
	w.wifiName();
	MobileData m=new MobileData();
	m.dataname();
	Lan l=new Lan();
	l.lanName();
	Wireless a=new Wireless();
	a.modamName();
}
}
