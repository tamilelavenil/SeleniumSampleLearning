package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
public void duplicates() {
	String text = "We learn java basics as part of java sessions in java week1";
	String[] split = text.split(" ");
	List<String> value = new ArrayList<String>(Arrays.asList(split));
	Set<String> res = new LinkedHashSet<String>(value);
	System.out.println(res);
}

public static void main(String[] args) {
	RemoveDuplicates dup = new RemoveDuplicates();
	dup.duplicates();
}	
	
}
	
	
	


