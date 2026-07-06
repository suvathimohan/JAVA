import java.util.Scanner;
class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;int res = 0;
        while(x>0){
            int Ldig = x%10;
            x = x/10;
            res = res*10+Ldig;
        }
        if(temp == res){
            return true;
        }
        else{
            return false;
        }
    }
}
public class Main{
    public static void main(String[]args){
        Scanner jc = new Scanner(System.in);
        int num = jc.nextInt();
        Solution n = new Solution();
        n.isPalindrome(num);
    }
}
