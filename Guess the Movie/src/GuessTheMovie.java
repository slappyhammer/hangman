import java.io.File;
import java.util.Scanner;

public class GuessTheMovie {
    public static void main(String [] args) throws Exception{

        // read the file - still need to throw exception
        File file = new File("movielist.txt");
        Scanner scanner = new Scanner(file);

        //get no of lines and print them out
        int lines = 0;
        String[] movieLines = new String[100];
        while (scanner.hasNextLine()){
            movieLines[lines] = scanner.nextLine();
            lines++;
        }
        System.out.println("The file contains "+lines+" lines.");

        //select a random line and print it out
        int lineNo = (int) (Math.random() * lines) ;
        System.out.println("random line no is " + (lineNo + 1));
        System.out.println("Movie is: " + movieLines[lineNo]);
    }
}
