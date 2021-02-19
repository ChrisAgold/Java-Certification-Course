package ExceptionsNotes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws FileNotFoundException {

        // loop user response 4 times
//        for (int i=0; i <= 3; i++) {
//            Scanner input = new Scanner(System.in);
//            System.out.println("Enter some text: ");
//            String enteredText = input.nextLine();
//            System.out.println(enteredText);
//        }

        // Read through txt files
        File file = new File("myfile.txt");
        Scanner input = new Scanner(file);
        while(input.hasNextLine()) {
            String line = input.nextLine();
            System.out.println(line);
        }
        input.close();

        MyFileUtils myUtils = new MyFileUtils();
        try {
            System.out.println(myUtils.subtract10FromLargerNumber(11));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}