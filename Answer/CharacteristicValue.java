import java.io.*;
public class CharacteristicValue {
	public char[] makeArray(String str) {
		char[] chArray = str.toCharArray();
		return chArray;	
		
	}
	public boolean distinguishCharacteristic(String str) {
		char[] chArray = makeArray(str);
		
		for(int i=0;i<str.toCharArray().length-1;i++) {
			char pivot = chArray[i];
			for(int j=1;j<str.toCharArray().length;j++) {
			
				if(pivot == chArray[j]) {
					System.out.println("pivot: "+pivot+" chArray: "+(j)+" "+chArray[j]);
					return true;
				} 
			}
		}
	return false;	
	} 
	
}
