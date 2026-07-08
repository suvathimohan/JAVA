import java.util.Scanner;
class Solution {
    public int fib(int n) {
        int temp;
        int a = 0;
        int b = 1;
        int res = 0;
        for(int i = 1; i <= n; i++){
            temp = a+b;
            a = b;
            b = temp;
        }
        System.out.println(a);
        return a;
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution jy = new Solution();
        jy.fib(n);
    }
}
