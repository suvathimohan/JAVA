import java.util.Scanner;
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int cou = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    cou++;
                }
            }
        }
        return cou;
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Solution bw = new Solution();
        bw.numIdenticalPairs(arr);
    }
}
