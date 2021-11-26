package org.lang;

public class StateDetails {
	private void southIndia() {
		System.out.println("south India=tirunelveli");
	}

	private void northIndia() {
		System.out.println("north India=delhi");
	}

	public static void main(String[] args) {
		StateDetails s = new StateDetails();
		s.southIndia();
		s.northIndia();
		LanguageInfo l = new LanguageInfo();
		l.tamilLanguage();
		l.englishLanguage();
		l.hindiLanguage();

	}
}
