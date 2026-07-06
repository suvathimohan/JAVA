import java.util.Scanner;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tar = sc.nextInt();
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i=0;i<len;i++){
            arr[i] = sc.nextInt();
        }
        Solution og = new Solution();
        og.twoSum(arr,tar);
    }
}
