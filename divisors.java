import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Integer> printDivisors(int n) {
        List<Integer> divisors = new ArrayList<>();
        
        // Loop through numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            // If i divides n without leaving a remainder, it's a divisor
            if (n % i == 0) {
                divisors.add(i);
            }
        }
        
        return divisors;
    }
}
