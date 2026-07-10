import java.util.Random;
public class Main{
    public static void main(String[] args){
        String[] tub1 = {"Anu","Prakash","sakthy","Ram","Raghul"};
        String[] tub2 = {"Eniya","Kodhai","Vaagai"};
        String[] tub3 = {"Aadhi","Ananthu","Prithvi","Bhoomi"};
        int ct1 = tub1.length;
        int ct2 = tub2.length;
        int ct3 = tub3.length;
        Random rand = new Random();
        int randEX = rand.nextInt(ct1);
        System.out.println(randEX);
        int randEX2 = rand.nextInt(ct2);
        System.out.println(randEX2);
        int randEX3 = rand.nextInt(ct3);
        System.out.println(randEX3);
        String pharase = tub1[randEX] + " " +tub2[randEX2] + " " + tub3[randEX3];
        System.out.println(pharase);
    }
}
