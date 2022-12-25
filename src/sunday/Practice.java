package sunday;

import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter the word");
        String word = input.nextLine();

        if (word.endsWith("ly")) {
            System.out.println("Really?");
        } else {
            System.out.println("Never mind");


        }


    }
}
