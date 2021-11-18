package week3.day2;

public class College extends University {

	@Override
	public void ug() {
		
		System.out.println("Undergraduate program");
	}

	public static void main(String[] args) {
		College coll = new College();
		
		coll.ug();
	}

	@Override
	public void pg() {
		// TODO Auto-generated method stub
		
	}

}
