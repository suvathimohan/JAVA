import java.util.Scanner;
class Solution {
    public int reverse(int x) {
        int temp = x;
        int rev = 0;
        while(x>0 || x<0){
            int ld = x%10;
            x/=10;
            rev = rev*10+ld;
        }
        return rev;
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution nw = new Solution();
        nw.reverse(n);
    }
}
