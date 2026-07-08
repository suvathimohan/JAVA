import java.util.Scanner;
class Solution {
    public int numberOfSteps(int num) {
        int c=0;
        while(num>0){
            if(num%2==0){
                num = num/2;
                c++;
            }
            else{
                num-=1;
                c++;
            }
        }
        return c;
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        Solution dv = new Solution();
        dv.numberOfSteps(n);
    }
}
