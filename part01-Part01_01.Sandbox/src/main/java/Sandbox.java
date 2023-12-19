// Introduce the scanner tool used for reading user input

import java.util.Scanner;
import java.util.ArrayList;

public class Sandbox {

    public static void main(String[] args) {
        // Create a tool for reading user input and name it scanner
        Scanner scanner = new Scanner(System.in);

        /*
        // Print "Write a message: "
        System.out.println("Write a message: ");

        // Read the string written by the user, and assign it
        // to program memory "String message = (string that was given as input)"
        String message = scanner.nextLine();

        // Print the message written by the user
        System.out.println(message);
        */

        // =================================
        // Write below this line
        
        ArrayList<Integer> numbers = new ArrayList<>();
        
        numbers.add(1);
        numbers.add(3);
        numbers.add(6);
        numbers.add(9);
        
        for(Integer i = numbers.size() - 1; i >= 0; i--) {
            System.out.println(numbers.get(i));
        }
    }
}
