import java.util.Scanner;

class Solution {
    public static void main(String args[]) {
        // Write code here
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        if (x == 0 && y == 0) {
            System.out.println("Origin");
        } else if (x == 0) {
            System.out.println("y axis");
        } else if (y == 0) {
            System.out.println("x axis");
        } else if (x > 0 && y > 0) {
            System.out.println("1st Quadrant");
        } else if (x < 0 && y > 0) {
            System.out.println("2nd Quadrant");
        } else if (x < 0 && y < 0) {
            System.out.println("3rd Quadrant");
        } else {
            System.out.println("4th Quadrant");
        }
    }
}
