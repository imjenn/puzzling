import java.util.Random;
import java.util.ArrayList;

public class PuzzleJava {

    // Method that will generate and return an array with 10 random numbers between 1 and 20
    public ArrayList<Integer> getTenRolls() {
        Random rand = new Random();
        ArrayList<Integer> randomNums = new ArrayList<Integer>();
        for(int i = 1; i <= 10; i++) {
            // rand.nextInt((max - min + 1) + min)
            randomNums.add(rand.nextInt(20) + 1);
        }
        return randomNums;
    }

    // Method to create an array that contains all 26 letters of the alphabet
    // Generate a random index 0-25 to pull a random letter out of the array
    // Return the random letter
    public char getRandomLetter() {
        Random rand = new Random();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int index = rand.nextInt(26);
        return alphabet[index];
    }

    public String generatePassword() {
        String password = "";
        while (password.length() < 8) {
            password += getRandomLetter();
        }
        return password;
    }

    // Method that takes an int length as an arg and creates an array of random 8 char words
    public ArrayList<String> getNewPasswordSet(int length) {
        ArrayList<String> randomWords = new ArrayList<String>();
        for(int i = 0; i < length; i++) {
            String word = "";
            for(int j = 0; j < 8; j++) {
                word += getRandomLetter();
            }
            randomWords.add(word);
        }
        return randomWords;
    }
}