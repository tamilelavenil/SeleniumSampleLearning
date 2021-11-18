package week3.day2;



public class Desktop implements Hardware, Software {

	
	public void hardwareResources() {
		System.out.println("Hardware Resources");
		
	}
	
	
	public void softwareResources() {
		System.out.println("Software Resource");}
		
	public static void main(String[] args) {
		
		Desktop desk = new Desktop();
		
		desk.hardwareResources();
		desk.softwareResources();
	}
}
