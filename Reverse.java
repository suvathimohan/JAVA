import java.util.Scanner;

class Solution {
    public int reverse(int x) {
        long rev = 0;
        while (x != 0) {
            int ld = x % 10;
            x /= 10;
            rev = rev * 10 + ld;
        }
        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) rev;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Solution nw = new Solution();

        System.out.println(nw.reverse(n));
    }
}
