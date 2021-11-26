
public class Desktop implements Hardware, Software {
	public void desktopModel() {
		System.out.println("HP Envy Desktop");

	}

	@Override
	public void softwareResources() {
		System.out.println("Microsoft Word");

	}

	@Override
	public void hardwareResource() {
		System.out.println("CPU");

	}

	public static void main(String[] args) {
		
	
	Desktop d = new Desktop();
	d.desktopModel();
	d.softwareResources();
	d.hardwareResource();
	}
}