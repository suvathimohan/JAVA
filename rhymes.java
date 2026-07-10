public class Main{
    public static void main(String[] args){
        int b = 10;
        
        while(b>0){
            String w = (b==1)?"Bottle":"Bottles";

            System.out.println(b+ " green " + w + ",hanging on the wall");
            System.out.println(b+ " green " + w + ",hanging on the wall");
            System.out.println("And if one green bottle should accidentally fall,");
            b--;
            if(b>0){
                System.out.println("There'll be "+b+" green "+ w+ ", hanging on the wall");
            }
            else{
                System.out.println("There'll be no green bottles, hanging on the wall");
            }
        }
    }
}
