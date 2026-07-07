import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                ans.add("FizzBuzz");
            } 
            else if (i % 3 == 0) {
                ans.add("Fizz");
            } 
            else if (i % 5 == 0) {
                ans.add("Buzz");
            } 
            else {
                ans.add(String.valueOf(i));
            }
        }
        return ans;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        Solution solution = new Solution();
        List<String> Op = solution.fizzBuzz(n);
        System.out.println(Op);
    }
}
