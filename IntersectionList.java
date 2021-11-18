package week3.day2;
import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.LinkedHashSet;
import java.util.List;
//import java.util.Set;
public class IntersectionList {

	public void removeAll() {//Removes all the common elements
		int[] arr1 = {3,2,11,4,6,7};
		int[] arr2 = {1,2,8,4,9,7};
		
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		for (Integer var1 : arr1) {
			list1.add(var1);
			}
		for (Integer var2 : arr2) {
			list2.add(var2);
		}
		list1.removeAll(list2);
		
		System.out.println("Without Common Elements :"+list1);
	}
	
	public void Intersecti() {//Retains all the common elements
		int[] arr3 = {3,2,11,4,6,7};
		int[] arr4 = {1,2,8,4,9,7};
		
		List<Integer> list3 = new ArrayList<Integer>();
		List<Integer> list4 = new ArrayList<Integer>();
		
		for (Integer var3 : arr3) {
			list3.add(var3);
			}
		for (Integer var4 : arr4) {
			list4.add(var4);
		}
		list3.retainAll(list4);
		
		System.out.println("Intersection:"+list3);
	}
	

	public static void main(String[] args) {
		 
		IntersectionList inter = new IntersectionList();
		inter.removeAll();
		inter.Intersecti();
		
	}

}
