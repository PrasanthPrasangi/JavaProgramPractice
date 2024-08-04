
public class CountingOccurancesInStingForWord {
	
	public static void main(String[] args) {
		
		String str = "Java is a programming language Java Java";
		String word = "Java";
		System.out.println(countOccurances(str,word));
		
		
	}
	
	static int countOccurances(String str , String word) {
		
		String a[] = str.split(" ");
		
		int count =0;
		
		for (int i=0 ; i<a.length; i++ ) {
			
			if(word.equals(a[i])) {
				count++;
			}
		}
		
		return count;
	}

}
