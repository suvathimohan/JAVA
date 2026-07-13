import java.util.Scanner;
class Solution {
    public int addDigits(int num) {
        int cou = 0;
        while(num>=10){
            while(num>0){
                int ld = num%10;
                cou+=ld;
                num/=10;
            }
        }
        int res = 0;
        if(cou>=10){
            while(cou>0){
                int ld = cou%10;
                res += ld;
                cou/=10;
            }
            return res;
        }
        else{
            cou = num;
        }
        return cou;
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution jc = new Solution();
        jc.addDigits(n);
    }
}
