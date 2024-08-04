import java.util.LinkedHashSet;

public class RemoveDuplicateCharinString {
	
	
	public static void main(String[] args) {
		String str = "aabbccccdefgh";
		
		System.out.println(removeDuplicates(str));
		
		
	}
	
	
	
	
	public static String removeDuplicates(String str) {
		
		
		char[] ch = str.toCharArray();
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		for(char c : ch) {
			
			set.add(c);
			
		}
		
		StringBuilder s = new StringBuilder();
		
		for(Character x : set) {
			
			s.append(x);
		}
		return s.toString();
		
		
	}

}
