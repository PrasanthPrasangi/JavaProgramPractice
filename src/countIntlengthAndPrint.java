
public class countIntlengthAndPrint {

	public static void main(String[] args) {
		
		
		
		int i = 12345678;
		
		int count = 0 ;
		
		while(i>0) {
			
			count++;
			i = i /10;
		}
		
		System.out.println(count);
	}

}
