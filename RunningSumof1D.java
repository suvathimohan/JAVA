import java.util.Scanner;
class Solution {
    public int[] runningSum(int[] nums) {
        for(int i = 1; i < nums.length; i++){
        nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int lenn = sc.nextInt();
        int[] arr = new int[lenn];
        for(int i=0;i<lenn;i++){
            arr[i] = sc.nextInt();
        }
        Solution er = new Solution();
        er.runningSum(arr);
    }
}
