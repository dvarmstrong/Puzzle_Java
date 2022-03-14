import java.util.*;
import java.util.ArrayList;

public class PuzzleJava {
    


    // create a method to generate and return an array with 10 random numbers 

    //Create a method that creates an Array
    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer>rand_10 = new ArrayList<Integer>();
        
        // Create an instance of Random Class
        Random randMachine = new Random();
    

        System.out.println("Printing the New Array::");

        for (int i =0; i<10; i++) {
            rand_10.add(randMachine.nextInt(20) + 1);
        }
        
        return rand_10;

    }

    public String getRandomLetter() {
        Random rand = new Random();
        String letters = "abcdefghijklmnopqrstuvwxyz";
        String[] lettersString = new String[26];
        for(int i=0; i < 26; i++) {
            lettersString[i] = String.valueOf(letters.charAt(i));
        

        // char randomChar = (char) ('a' + randMachine.nextInt(26));
        }
        return lettersString[rand.nextInt(26)];


    }

    public String generatePassword() {
        String password = "";
        for (int i = 0; i < 16; i++) {
            password =  password + getRandomLetter();
        }
        return password;
    }

    ArrayList<String> getNewPasswordSet(int length) {

        ArrayList<String> passwordSet = new ArrayList<String>();
        for(int i = 0; i < length; i++) {
            passwordSet.add(generatePassword());
        }
        return passwordSet;
    }







}




    
            











