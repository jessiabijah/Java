package org.lang;
//singleInhertiance
public class LanguageInfo extends StateDetails {
	public void tamilLanguage() {
		System.out.println("tamil language=tamil");

	}
	public void englishLanguage() {
		System.out.println("english language=english");

	}
	public void hindiLanguage() {
		System.out.println("hindi language=hindi");

	}
public static void main(String[] args) {
	LanguageInfo l=new LanguageInfo();
	l.tamilLanguage();
	l.englishLanguage();
	l.hindiLanguage();
	l.southIndia();
	l.northIndia();
}
}
