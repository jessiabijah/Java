//singleInheritance
public class Desktop extends Computer {
	public void desktopSize() {
System.out.println("desktopsize=30");
	}
	public static void main(String[] args) {
		Desktop d=new Desktop();
		d.desktopSize();
		d.computerModel();
	}

}
