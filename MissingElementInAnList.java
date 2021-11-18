package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementInAnList {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		List<Integer> missingelement = new ArrayList<Integer>();
		for (Integer elem : arr) {
			missingelement.add(elem);
		}
		Collections.sort(missingelement);
		
		for(int i=1;i<=missingelement.size();i++) {
			if(i!=arr[i-1]) {
				System.out.println("The missing element is: "+i);
				break;
			
		}
		
	}

}


	}

