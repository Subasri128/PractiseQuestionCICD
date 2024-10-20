package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class duplicateElementinList {

	//IBM SDET
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(55,33,24,22,55,23,24));
		HashSet<Integer> checkset = new HashSet<>();
		HashSet<Integer> targetset = new HashSet<>();
		for(Integer integer : arr) {
			if(!checkset.add(integer)) {
				targetset.add(integer);
			}
		}
		System.out.println(targetset);
		}}
