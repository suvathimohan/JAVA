public class Main{
    public static void main(String[] args){
        int num = 454;
        int temp = num;
        int res = 0;
        while(num>0){
            int ld = num%10;
            num/=10;
            res = res*10+ld;
        }
        if(temp == res){
            System.out.println("Palindrome number");
        }
        else{
            System.out.println("Not a Palindrome number");
        }
    }
}
