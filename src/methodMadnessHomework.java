
//(help from Stack Overflow, and javacodegeeks.com)

import java.util.Scanner;
import java.util.Arrays;

public class methodMadnessHomework {
    public static void main(String[] args) {

        //Listed methods that are commented-out are ones I could not get to run or even to be called (in some cases)
        //(Commented out so the rest of the code would run smoothly.)
        maxOfTwoNumbers();
        maxOfThreeNumbers();
        isCharacterAVowel();
        //howMany();
        reverseString();
        //findLongestWord(); (Not finished.)
        //filterLongWords(); (Not started; no code for this yet.)
        //(class Car could not be run here, but code is included below)

    }

    public static void maxOfTwoNumbers() {
        int firstNumber = 1;
        int secNumber = 2;


        if (firstNumber > secNumber) {
            System.out.println(firstNumber);
        } else {
            System.out.println(secNumber);

        }
    }

    public static void maxOfThreeNumbers() {
        int firstNumber = 1;
        int secNumber = 2;
        int thirdNumber = 3;

        if (firstNumber > secNumber && firstNumber > thirdNumber) {
            System.out.println(firstNumber);
        } else if (secNumber > firstNumber && secNumber > thirdNumber) {
            System.out.println(secNumber);
        } else if (thirdNumber > firstNumber && thirdNumber > firstNumber)
            System.out.println(thirdNumber);
        System.out.println("--------------------------------------------");
    }


    public static void isCharacterAVowel() {

        System.out.println("Enter a letter of the alphabet.");
        Scanner userInput = new Scanner(System.in);

        String x = userInput.next();

        switch (x) {

            case "A":
            case "a":
            case "E":
            case "e":
            case "I":
            case "i":
            case "O":
            case "o":
            case "U":
            case "u":
                System.out.println("True! That IS a vowel!");
                break;
            default:
                System.out.println("Sorry, that is NOT a vowel.");
                break;

            //(wanted to use a boolean & return for this ^ method but could not
            //get it right.)


        }


    }

    //Could not get this method to be called. No errors in the actual method (that I'm getting) but main can't call it.)


    public static void howMany(String[] args) {
        int length = args.length;

        if (length > 0) {

            System.out.println(length);
        } else {
            System.out.println("No arguments.");
        }
    }


    public static void reverseString() {
        String[] StringArray = {"j", "a", "g", " ", "t", "e", "s", "t", "e", "r"};

        for (int j = 9; j >= 0; j--) {
            System.out.println(StringArray[j]);
        }


    }//(This code below is not yet completed.)

    public static void findLongestWord(String[] args) {
        String[] strings = {"mustard", "rabbit", "Android", "dog", "suspicious"};

        System.out.println(strings [0].length());


    }



}



//Code below is commented out because this will not compile here since it is a new class (I got the error) but code does work.
//(help from http://www.programmingsimplified.com/java/tutorial/java-constructor-tutorial)


//import java.util.Random;

//public class Car {

    /*public static void main(String[] args) {
        Car object = new Car();
        Random rand = new Random();
        int min = 125;
        int max = 175;
        int mTopSpeed = rand.nextInt((max - min) + 1) + min;
        int mNumberOfDoors = rand.nextInt(4) + 1;

        System.out.println("Your car has the top speed of " + mTopSpeed + " mph, and for some reason, " + mNumberOfDoors + " door(s).");

    }

*/













