import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABCDEFGHIJKLMOP";
		System.out.println(str);
		
		char[] chrString =  str.toCharArray();
	
		char[] newChrString =  new char[chrString.length];
		int lastIndex = chrString.length-1;
		for (char c : chrString) {
			newChrString[lastIndex--] = c;			
		}
		System.out.println(new String(newChrString));
		

	}

}
