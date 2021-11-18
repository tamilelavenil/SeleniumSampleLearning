package week3.day2;

public class Automation extends MultipleLangauge implements TestTool{


	public void python() {
		
	
	}

	
	public void ruby() {
			System.out.println("Ruby is a programming Language");
		}

	@Override
	public void java() {
		System.out.println("Java is a programming Language ");
		
	}

	@Override
	public void Selenium() {
		System.out.println("Selenium is Automation testing tool ");
	}
	
	
	public static void main(String[] args) {
		
		Automation aut = new Automation();
		aut.java();
		aut.python();
		aut.ruby();
		aut.Selenium();
		
	}

}
