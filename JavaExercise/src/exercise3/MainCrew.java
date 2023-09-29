package lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainCrew {


    public static void main(String[] args) {
        //File  object to read file from  disk
        File file;

        //Create a new scanner object to read user input
        Scanner sc = new Scanner(System.in);
        String input;
        //do while to to check if the file exists
        do {
            //Print message on console
            System.out.println("Enter file nationalities  name");

            //  user scanner to read reply from console
            input = sc.nextLine();
            file = new File(input);
        } while(!file.exists());

        //create a new Crew Object with the files absolute path
        Crew crew = new Crew(file.getAbsolutePath());
        //infinite while loop to run program
        while(true) {
            System.out.println("Please enter:\n" +
                    "1 to print crew (sorted)\n" +
                    "2 to print crew (shuffled)\n" +
                    "3 to assemble and print mission crew\n" +
                    "quit to quit");

            input = sc.nextLine();

            switch (input) {
                case "1":
                    crew.sortCrew();
                    crew.printCrew();

                    break;
                case "2":
                    crew.shuffleCrew();
                    crew.printCrew();
                    break;
                case "3":
                    System.out.println(crew.assembleMissionCrew());
                    break;
                case "quit":
                    System.out.println("Bye!");
                    System.exit(1);
                    break;
                default:
                    System.out.println("Invalid entry!");
            }
        }
    }

}
