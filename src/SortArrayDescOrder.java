
public class SortArrayDescOrder {

	public static void main(String[] args) {
		
			// TODO Auto-generated method stub

			int temp =0;
			int[] arr = {23,0,5,0,17,3,2};
			
			System.out.println("Original array : ");
			
			for (int i=0;i<arr.length;i++) {
				
				System.out.println(arr[i]+" ");
			}
			
			

			
			for(int i=0;i<arr.length;i++) {
				
				for(int j=i+1;j<arr.length;j++) {
					
					if(arr[i]<arr[j]) {
						
					   temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
					
					
				}
			}
			
	System.out.println("Sorted array : ");
			
			for (int i=0;i<arr.length;i++) {
				
				System.out.println(arr[i]+" ");
			}
			
			
		

	}

}
