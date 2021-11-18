package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestNumberInList {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		List<Integer> findlist = new ArrayList<Integer>();
		for (Integer inte : data) {
			findlist.add(inte);
		}
		Collections.sort(findlist);
		System.out.println("The second largest number is: "+findlist.get(1));

	}

}
