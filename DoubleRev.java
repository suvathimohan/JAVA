class Solution {
    public boolean isSameAfterReversals(int num) {
        int tem = num;
        int res = 0;
        while(num>0){
            int ld = num%10;
            num/=10;
            res = res*10+ld;
        }
        int rev = 0;
        while(res>0){
            int ld  = res%10;
            res/=10;
            rev = rev*10+ld;
        }
        if(rev==tem){
            return true;
        }
        else{
            return false;
        }
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution re = new Solution();
        re.isSameAfterReversals(n);
    }
}
