import java.io.*;
public class ReverseString {
	public char[] makeArray(String str) {
		char[] initialArray = new char[str.length()];
		initialArray = str.toCharArray();
		
		return initialArray;
	}
	
	
	public String reverseString(String str) {
		char[] initialArray = makeArray(str);
		int count = initialArray.length;
		char[] resultArray = new char[count];
		
		for(int i=0;i<count;i++) {
			resultArray[count-i-1] = initialArray[i];
		}
		
		return new String(resultArray);//*
	}
}
