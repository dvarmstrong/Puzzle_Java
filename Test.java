import java.util.*;
import java.util.Arrays;


public class Test {
    public static void main(String[] args) {
        //Create an instance of the class PuzzleJava
        PuzzleJava generator = new PuzzleJava();
        
        // Call the method of getTenRolls method
        ArrayList<Integer> randomRolls = generator.getTenRolls();
        System.out.println(randomRolls);

        // Call the method of getRandomLetter

        String Letter = generator.getRandomLetter();
        System.out.println("The random letter is:  " + Letter);


        // Call the generatePassword method
        String Password = generator.generatePassword();
        System.out.println("Your password is: " + Password);
        
        // Call the passwordSet Method
        ArrayList<String> newPassword = generator.getNewPasswordSet(2);
        System.out.println("Your Password is:  " + newPassword);

    }


}
