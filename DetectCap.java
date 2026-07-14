import java.util.Scanner;
class Solution {
    public boolean detectCapitalUse(String word) {
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)>=97 && word.charAt(i)<=122 ){
                return false;
            }
        }
        return true;
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String ex = sc.nextLine();
        Solution rg = new Solution();
        rg.detectCapitalUse(ex);
    }
}
