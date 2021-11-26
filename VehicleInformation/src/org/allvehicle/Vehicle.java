package org.allvehicle;

import org.fourwheeler.FourWheeler;
import org.threewheeler.ThreeWheeler;
import org.twowheeler.TwoWheeler;

public class Vehicle {
private void vehicleNecessary() {
System.out.println("vehicle necessary=vehicle");
}
public static void main(String[] args) {
	Vehicle v=new Vehicle();
	v.vehicleNecessary();
	TwoWheeler t=new TwoWheeler();
	t.bike();
	t.cycle();
	ThreeWheeler tw=new ThreeWheeler();
	tw.auto();
	FourWheeler fw=new FourWheeler();
	fw.car();
	fw.bus();
	fw.lorry();
}
}
