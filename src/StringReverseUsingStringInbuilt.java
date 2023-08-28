
public class StringReverseUsingStringInbuilt {

	public static void main(String[] args) {
		String str = "Automation";
		//int str = 1234;
		
		StringBuilder str2 = new StringBuilder();
		str2.append(str);
		str2=str2.reverse();
		System.out.println(str2);
	}

}
