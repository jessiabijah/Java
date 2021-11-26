package org.phone;

public class PhoneInfo {
private void phoneName() {
System.out.println("ph name=realme");
}
private void phoneMieinum() {
	System.out.println("ph mieinum=123123456634567");
} private void phoneCamera() {
System.out.println("camera=dual camera");
}
private void phoneStorage() {
System.out.println("storage=32gb");
}
private void phoneOsname() {
System.out.println("os name=andriod");
}
public static void main(String[] Args) {

PhoneInfo ph=new PhoneInfo();
ph.phoneName();
ph.phoneMieinum();
ph.phoneStorage();
ph.phoneOsname();

}
}
