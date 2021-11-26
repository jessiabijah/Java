package org.india;
//multiple inheritance
import org.tamilnadu.TamilNadu;

public class India extends TamilNadu {
	private void india() {
		System.out.println("india=India");
		
	}
public static void main(String[] args) {
	India i=new India();
	i.india();
	i.tamilLanguage();
	i.malayalam();
	i.telugu();
	
	
}
}
