
public class ReverseTheEntireSentence {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word ="India is country My";
		
		String array[] = word.split(" ");
		
		String rev ="";
		
		for (int i = array.length-1 ; i>=0; i--) {
			
			rev = rev + array[i]+ " ";
		}
		
		System.out.println(rev.substring(0,rev.length()-1));
		

	}

}
