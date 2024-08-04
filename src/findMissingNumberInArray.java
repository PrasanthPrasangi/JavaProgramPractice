
public class findMissingNumberInArray {

	public static void main(String[] args) {
		
		
		/*int arr1 [] = new int [] {1,2,3,4,5,6,7,8,10,11};
		
		
		int sum = (10 * 11)/2; // Sum of n number formula (n * (n + 1)/2))
		
		
		int actualSum = 0;
		
		for(int i=0 ; i< arr1.length; i++) {
			
			actualSum = actualSum + arr1[i];
		}
				
			System.out.println("Missing Number is:"+(sum - actualSum) );	
				
	
	}
	*/
	
	//Approach 2
	
	int arr1 [] = new int [] {1,2,3,4,5,6,7,8,10,11};
	
	int sum = 0;
	
	for(int i =0; i < arr1.length;i++ ) {
		
		sum = sum + arr1[i];
		
	}
	
	int sum1 = 0;
	
for(int j =1; j <=11;j++ ) {
		
		sum1 = sum1 + j;
		
	}

System.out.println("Missing number::" +(sum1-sum));
	}
	

}
