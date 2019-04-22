import java.io.*;
import java.util.Scanner;

public class Main {
	
	public static int makeresult(int n,int c,int m) {
		int wrapper = n/c;  
		int choco = wrapper;
		int need = wrapper%m; 
		int free = wrapper/m;
		int amount = 0; 
		if(need == 0)  { 
			amount = wrapper+free;
		} else if(wrapper<m){
			amount = wrapper+free;
		} else if(wrapper>m) {
			amount = wrapper+free+need;

		}
		//int free = ;
		

		return amount;
	}
	
	private static final Scanner s = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int testcase = s.nextInt();
        
        for(int i=0;i<testcase;i++) {
        	int n = s.nextInt();//paid
        	int c = s.nextInt();//cost
        	int m = s.nextInt();//pivot
        	int result = makeresult(n,c,m);
        	
        	System.out.println(result);
        }
        
        
        
        
       // int result = countValley(str);
        //System.out.println(result);
        
        s.close();

            
        

}

}


