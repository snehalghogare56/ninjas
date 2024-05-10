import java.util.* ;
import java.io.*; 

public class Solution {
    static int countDigit(long x) {
        // Write your code here.
        int digit=0;
        int count=0;
        while(x>0){
            digit=(int)(x%10);
            count++;
            x=x/10;
        }
        return count;
        
    }
}
