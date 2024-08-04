import java.util.ArrayList;
import java.util.List;

public class printUniqueElementsInarray {
	
	
    public static void main(String[] args) {
        int[] inputArray = {1, 1, 2, 2, 3, 4, 5, 5, 6, 6};
        List<Integer> uniqueElements = new ArrayList<>();
        
        for (int i = 0; i < inputArray.length; i++) {
            int count = 0;
            for (int j = 0; j < inputArray.length; j++) {
                if (inputArray[i] == inputArray[j]) {
                    count++;
                }
            }
            if (count == 1) {
                uniqueElements.add(inputArray[i]);
            }
        }
        
        System.out.println(uniqueElements);
    }
}
