package org.all;
import org.tamil.Tamil;
//multiple inheritance

//child
public class Language extends Tamil {
	public void allLanguage() {
		System.out.println("all language=language");

	}
public static void main(String[] args) {
	Language l=new Language();
	l.allLanguage();
	l.tamilLanguage();
	l.englishLanguage();
	l.teluguLanguage();
	
	
	
	
	
		
}
	
}

