import java.util.Scanner;

class Solution {
    
    public static void main(String args[]) {
        
        // Write code here
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0); 
        if (Character.isUpperCase(ch)) {
            System.out.println(1);
        } else if (Character.isLowerCase(ch)) {
            System.out.println(0);
        } else {
            System.out.println(-1);
        }
        
    }
}

