import java.util.HashMap;

public class FindEachWordOccurrenceFromGivenStringInStringJava {

	public static void main(String[] args) {
		//Input = "Alice is girl and Bob is boy";
		// Output = {Bob=1, Alice=1, and=1, is=2, girl=1, boy=1}
		
		String input = "Alice is girl and Bob is boy";
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		String[] words = input.split(" ");
		
		for(String word : words) {
			
			
			if(hm.containsKey(word)) {
				
				hm.put(word, hm.get(word)+1);
			}else
			{
				hm.put(word, 1);
			}
			
		}
		System.out.println(hm);
	}

}
