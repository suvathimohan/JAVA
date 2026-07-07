import java.util.Scanner;
class Solution {
    public int countDigits(int num) {
        int dup = num;
        int count = 0;
        while(dup>0){
            int x = dup%10;
            if(num%x==0){
                count++;
            }
            dup = dup/10;
        }
        return count;
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Solution mm = new Solution();
        mm.countDigits(num);
    }
}
