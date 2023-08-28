
public class findMissingNumberInArray {

	public static void main(String[] args) {
		
		
		int arr1 [] = new int [] {1,2,3,4,5,6,7,8,10};
		
		int sum = (10 * 11)/2;  // Sum of n number formula (n * (n + 1)/2))
		
		int actualSum = 0;
		
		for(int i=0 ; i< arr1.length; i++) {
			
			actualSum = actualSum + arr1[i];
		}
				
			System.out.println("Missing Number is:"+(sum - actualSum) );	
				
	
	}

}
