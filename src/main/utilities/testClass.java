package utilities;

public class testClass {
	static final int MAX_CHAR = 256;
	public static  void hell(){
		System.out.println("hell enters");
	}
	
	 public static void main(String[] args) 
	    { 
	        String str = "geeksforgeeks"; 
	        getOccuringChar(str); 
	    } 
	
	static void getOccuringChar(String str) 
    { 
		int x=0;
        // Create an array of size 256 i.e. ASCII_SIZE 
        int count[] = new int[MAX_CHAR]; 
  
        int len = str.length(); 
  
        // Initialize count array index 
        for (int i = 0; i < len; i++) 
        	 x = count[str.charAt(i)]++; 
  
        // Create an array of given String size 
        char ch[] = new char[str.length()]; 
        for (int i = 0; i < len; i++) { 
            ch[i] = str.charAt(i); 
            int find = 0; 
            for (int j = 0; j <= i; j++) { 
        		char d =ch[j];
                // If any matches found 
                if (str.charAt(i) == ch[j])  
                    find++;                 
            } 
  
            if (find == 1)  
                System.out.println("Number of Occurrence of " + 
                 str.charAt(i) + " is:" + x);             
        } 

}
}