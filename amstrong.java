public class Main{
    public static void main(String[] args){
        int n = 153;
        int temp = n;
        int sum = 0;
        while(n>0){
            int ld = n%10;
            n/=10;
            int cube = 1;
            for(int i=1;i<=3;i++){
                cube*=ld;
            }
            sum+=cube;
        }
        if(sum == temp){
            System.out.println("Amstrong");
        }
        else{
            System.out.println("Not-Amstrong");
        }
    }
}
