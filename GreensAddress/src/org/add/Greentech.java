package org.add;

public class Greentech {
	private void greenOmr() {
 System.out.println("greensTechnology");

		}
		private void greenOmr(String name ,int batch ,String course) {
			System.out.println("name:"+name);
			System.out.println("batch pm:"+batch  );
			System.out.println("course:"+course);

		}
		private void greenOmr(int timing,String address) {
			System.out.println("timing hr:"+timing);
			System.out.println("address:"+address);

		}
		private void greenOmr(String courses,long contactno) {
			System.out.println("courses:"+courses);
			System.out.println("contact no:"+contactno);

		}
		public static void main(String[] args) {
			Greentech g=new Greentech();
			g.greenOmr();
			g.greenOmr("greeenstechnology", 3 , "python");
			g.greenOmr(1, "n0-12,thoraipakkam");
			g.greenOmr("Java", 8300032276l);
			
			
		}			

}
