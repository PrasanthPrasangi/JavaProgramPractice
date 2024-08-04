import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicatesInArray {

	public static void main(String[] args) {
		
	//	Integer [] arr = {-1, -1, 1, 2, 3,-10};
		
		
		ArrayList<Integer> arrlist = new  ArrayList<Integer>(Arrays.asList(-1, -1, 1, 2, 3,-10));
		
	
		
		LinkedHashSet<Integer> unique = new LinkedHashSet<Integer>(arrlist);
		
		ArrayList<Integer> arrlist1 = new  ArrayList<Integer>(unique);
		
		System.out.println(arrlist1);
		
	}

}
