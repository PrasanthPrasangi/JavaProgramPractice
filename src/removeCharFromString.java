
public class removeCharFromString {

	public static void main(String[] args) {
		
		
		String str = "Anand";
		
		char ch = 'a';
		removeChar(str, ch);
		
		
	}
	
	public static void removeChar(String str ,char a) {
		
		String finalString = "";
		
		for (int i=0 ; i< str.length();i++) {
			
			
			if(str.charAt(i)!=a) {
				
				finalString = finalString + str.charAt(i);
			}
			
					}
		
		
	}

}
