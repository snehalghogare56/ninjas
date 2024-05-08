import java.util.* ;
import java.io.*; 
public class Solution {	
	public static String reverseString(String str) {
		// Write your code here.
// 		 char ch[]=str.toCharArray();  
//     String rev="";  
//     for(int i=ch.length-1;i>=0;i--){  
//         rev+=ch[i];  
//     }  
//     return rev;  
// }  
 StringBuilder sb=new StringBuilder(str);  
    sb.reverse();  
    return sb.toString();  
	}
// String reverseString="";
// int len=str.length();
// for(int i=len-1; i>=0; i--){
// 	 reverseString=reverseString+str.charAt(i);
// }
// return reverseString;
	
}
