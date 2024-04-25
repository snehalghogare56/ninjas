import java.util.Scanner;

class Solution {
    public static void main(String args[]) {
        long totalSalary; // Using long to handle larger salary values
        Scanner sc = new Scanner(System.in);
        int basic = sc.nextInt();
        char grade = sc.next().charAt(0);
        
        double hra =  (0.20 * basic);
        double da =  (0.50 * basic);
        double allow;
        if (grade == 'A')
            allow = 1700;
        else if (grade == 'B')
            allow = 1500;
        else
            allow = 1300;
        double pf =  (0.11 * basic);

        totalSalary = Math.round(basic + hra + da + allow - pf); // Using Math.round() for proper rounding
        System.out.println(totalSalary);
    }
}
