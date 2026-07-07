import java.util.Scanner;
class Solution {
    public int subtractProductAndSum(int n) {
        int tem = n;
        int pro = 1;
        int sum = 0;
        while(tem>0){
            int x = tem%10;
            pro*=x;
            sum+=x;
            tem = tem/10;
        }
        int res = pro-sum;
        return res;
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution bu = new Solution();
        bu.subtractProductAndSum(n);
    }
}
