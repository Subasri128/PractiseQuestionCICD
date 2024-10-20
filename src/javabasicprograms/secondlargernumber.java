package javabasicprograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class secondlargernumber {
	
	
	public static Integer secondlargernumberlist(Integer[]a) {
		List<Integer> list = Arrays.asList(a);
		Collections.sort(list);
		return list.get(list.size()-2);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[]= {3,4,1,99,84,109,39,97};
		System.out.println(secondlargernumberlist(a));
				}

}
