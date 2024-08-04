public class findDuplicateCharacters {

public static void main (String[] args) {


String str = new String("Automation");
int count=0;
char[] ch = str. toCharArray();
for (int i=0; i<ch. length; i++) {
for (int j=i+1 ; j<ch.length ; j++) {
if(ch[i]== ch[j]) {
System.out.println("duplicate characters in String are : " +ch[j]); 
count++;
}
}
}
System.out.println( "duplicate characters count:" +count) ;
}
}
