package objtrain;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class main2 {

	public static void main(String[] args) {
		try {
			File f = new File("exam.txt");
			FileWriter fw = new FileWriter(f);
			fw.write("PavazhaMalli\nInstrumental Cover By - Daniel Martin");
			fw.close();
			Scanner fs = new Scanner(f);
			while(fs.hasNextLine()) {
				System.out.println(fs.nextLine());
			}
			fs.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
