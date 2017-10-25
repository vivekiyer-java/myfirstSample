import java.util.Scanner;

public class Reverse {

	 public static void main(String[] args) {
	      /***  Scanner in = new Scanner(System.in);
	        String inpStr = in.nextLine();
	        System.out.println("Original String :" + inpStr);
	        char temp;
	        char[] arr = inpStr.toCharArray();
	        int len = arr.length;
	        for(int i=0; i<(inpStr.length())/2; i++,len--){
	            temp = arr[i];
	            arr[i] = arr[len-1];
	            arr[len-1] = temp;
	            System.out.println("Reverse String itr :" + i + "  " + String.valueOf(arr));
	        }

	        System.out.println("Reverse String :" + String.valueOf(arr));
	        ***/
	       /** String str1 = "random";
	        String str2 = "and";
	        
	        char[] arr1 = str1.toCharArray();
	        char[] arr2 = str2.toCharArray();
	        int count = 0;
	        for (int i=0; i<arr1.length-arr2.length; i++) {
	        
	        		if (arr1[i] == arr2[0]) {
	        			System.out.println("here");
	        			for(int j=i, k=0;j<arr2.length;j++,k++) {
	        				
	        				if(arr2[k] == arr1[j])
	        					System.out.println(arr1[j] + " " + arr2[k]);
	        					count++;
	        			}
	        		}
	        }
	        
	        	System.out.println("pattern matches.." + count);**/
		 // this is in git
		 
		 Reverse rev = new Reverse();
		 String s = rev.reversestr("abdser");
		 System.out.println(s);
	    }
	 
	 	public static String reversestr (String str) {
	 		char []strArr = str.toCharArray();
	 		StringBuilder str2 = new StringBuilder();
	 		for (int i=strArr.length; i>0;i--) {
	 			str2.append(strArr[i-1]);
	 		}
	 		return str2.toString();
	 	}
}
