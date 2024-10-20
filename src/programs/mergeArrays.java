package programs;

import java.util.ArrayList;
import java.util.Arrays;

public class mergeArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] array1 = {2,3,4};
	int[] array2 = {5,6,7,8};
	int[] array3 = {9,10,11};
	ArrayList<Integer> a = new ArrayList<Integer>();
	mergeFunction(a,array1);
	mergeFunction(a,array2);
	mergeFunction(a,array3);
	
	int[] result = a.stream().mapToInt(i->i).toArray();
	System.out.println(Arrays.toString(result));
	
	
	}
	public static void mergeFunction(ArrayList<Integer> arrayList , int [] list) {
		for(int a : list) {
			arrayList.add(a);
		}
	} 
}
