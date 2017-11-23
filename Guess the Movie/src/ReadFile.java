import java.io.File;
import java.util.Scanner;
public class ReadFile {
    public static void main(String [] args) throws Exception{
        File file = new File("movielist.txt");
        Scanner scanner = new Scanner(file);

        int lines = 0;
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            lines += line.split(" ").length;
        }
        System.out.println("The file contains "+lines+" lines.");
    }
}