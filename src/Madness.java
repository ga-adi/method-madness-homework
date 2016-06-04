import java.io.*;
import java.util.*;
import java.text.*;
import java.lang.*;

public class Madness {

    // array of words for Part One problems 6 & 7, and Bonus 6
    public static String[] wordArray = new String[]{
            "sesquipedalian",
            "pneumonoultramicroscopicsilicovolcanoconiosis",
            "pseudopseudohypoparathyroidism",
            "floccinaucinihilipilification",
            "antidisestablishmentarianism",
            "supercalifragilisticexpialidocious",
            "incomprehensibilities",
            "strengths",
            "euouae",
            "unimaginatively",
            "honorificabilitudinitatibus",
            "tsktsk",
            "uncopyrightable",
            "subdermatoglyphic",
            "sesquipidalianism"
    };

    public static void main(String[] args) {

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Madness Homework");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.print("\n 1) ");
        System.out.print(maxOfTwoNumbers(107, 6));                        // 1

        System.out.print("\n 2) ");
        System.out.print(maxOfThree(13, 42, 23));                         // 2

        System.out.print("\n 3) ");
        System.out.print(isCharacterAVowel("X"));                         // 3

        System.out.print("\n 4) ");
        System.out.print(argumentCounter("one", "two", "three", "four")); // 4

        System.out.print("\n 5) ");
        System.out.print(reverseString("This is not a palindrome."));     // 5

        System.out.print("\n 6) ");
        System.out.print(findLongestWord(wordArray));                     // 6

        // iterate through returned array using "new way to loop"
        // props to crunchify.com/how-to-iterate-through-java-list-4-way-to-iterate-through-loop/
        System.out.print("\n 7) ");
        for (String word : filterLongWords(wordArray, 23)) {              // 7
            System.out.print(word + " ");
        }

        // create a new car object and call its carReport method
        System.out.print("\n 8) ");
        Car myCar = new Car();                                            // 8
        myCar.carReport();

        // Bonus Madness
        // ~~~~~~~~~~~~~
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Bonus Madness");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("\n 1) ");
        System.out.print(truDat(4));                                      //  1
        System.out.print("\n 2) ");
        System.out.print(sameWords("gorilla", "GORILLA"));                //  2
        System.out.print("\n 3) \n");
        ordVertical("knowledge");                                         //  3
        System.out.print("\n 4) ");
        System.out.print(randOverFifty());                                //  4
        System.out.print("\n 5) ");
        System.out.print(tomorrow(31, 12, 1999));                          //  5
        System.out.print("\n 6) ");
        System.out.print(telephone(wordArray[1]));                        //  6
        System.out.print("\n 7) ");
        countToX(23);                                                     //  7
        System.out.print("\n 8) ");
        System.out.print(numCheck(42, 42));                               //  8
        System.out.print("\n 9) ");
        System.out.print("    " + domainCheck());                         //  9
        System.out.print("\n10) ");
        System.out.print(letterType());                                   // 10

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    // Part One
    // ~~~~~~~~
    // 1. use ternary operator (cuz cool to use something different) to compare two integers and return larger
    public static int maxOfTwoNumbers(int a, int b) {
        return (a > b) ? a : b;
    }

    // 2. return largest of three integersn using Math.max this time
    public static int maxOfThree(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

    // 3. return true if single char is a vowel - using String because char cannot be dereferenced
    // technically, this will return true if any character in the submitted string is a vowel
    public static boolean isCharacterAVowel(String s) {
        return s.matches("[aeiouAEIOU]");
    }

    // 4. return number of arguments using varargs (...)
    public static int argumentCounter(String... varargs) {
        return varargs.length;
    }

    // 5. return the reverse of a string (fun!)
    public static String reverseString(String s) {
        return new StringBuffer(s).reverse().toString();
    }

    // 6. (also fun!) return length of longest word in an array -
    // i suspect there is a cleaner way to do this - i know there is for numbers
    public static int findLongestWord(String[] words) {
        String longest = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longest.length())
                longest = words[i];
        }
        return longest.length();
    }

    // 7. (also fun!) filter array of words returning only those longer than given length
    public static List<String> filterLongWords(String[] words, int minLength) {
        List<String> longWords = new ArrayList<String>();

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= minLength)
                longWords.add(words[i]);
        }
        return longWords;
    }

    // 8. create a Car class with member variables mTopSpeed and mNumberOfDoors,
    //    constructor that assigns random values to variables, and print method:
    //    "Your car has the top speed of ____ mph, and for some reason has ____ doors."
    public static class Car {
        public int mTopSpeed;
        public int mNumberOfDoors;

        public Car() {
            Random randomGenerator = new Random();
            mTopSpeed = randomGenerator.nextInt(1000000);
            mNumberOfDoors = randomGenerator.nextInt(100);
        }

        public void carReport() {
            System.out.println("Your car has a top speed of " + mTopSpeed +
                    " mph, and for some reason has " + mNumberOfDoors + " doors.");
        }
    }

    // Bonus Madness
    // ~~~~~~~~~~~~~
    // 1. even numbers true, odd numbers false
    public static boolean truDat(int n) {
        if ( n % 2 == 0 )
            return true;
        return false;
    }

    // 2. compare two words - if spelling same, return true, otherwise false
    public static boolean sameWords(String a, String b) {
        return (a.toLowerCase().equals(b.toLowerCase()));
    }

    // 3. print a word char by char vertically, terminate if char is w
    //    mad props once again to crunchify.com, my new favorite website.
    public static void ordVertical(String ord){
        char[] charArray = ord.toCharArray();

        for (char out : charArray) {
            if (Character.toString(out).matches("[wW]")) // can't dereference chars, so convert to string
                return;
            System.out.println("    " + out);
        }
    }

    // 4. generate a random number, print it, if n > 50 return it, otherwise return -1
    public static int randOverFifty() {
        Random randomGenerator = new Random();
        int randNum = randomGenerator.nextInt(100);
        System.out.print(randNum + " ");
        return (randNum > 50) ? randNum : -1;   // happy :) ternary again
    }

    // 5. given day, month, year, calculate and return next day, month, year - this is complicated  :)
    //    well, it was complicated - i was trying to recreate the wheel, array for days in each month,
    //    test for leapyear to increment daysPerMonth[1] += 1, etc.  Then I figured had to be existing utils:
    //    final sources of direction: https://developer.android.com/reference/java/util/Calendar.html
    //    && https://ideone.com/YQp7rp

    public static String tomorrow(int day, int month, int year) {

        String dt = year + "-" + month + "-" + day;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();

        try {
            c.setTime(sdf.parse(dt));
        } catch (ParseException e) {
            System.out.println("Parse Exception in Bonus #5: cannot parse datetime to format.");
            e.printStackTrace();
        }

        c.add(Calendar.DATE, 1); // add 1 day to given date
        dt = sdf.format(c.getTime());

        return dt;
    }

    // 6. take a word and return new word with every other letter omitted
    public static String telephone(String messageIn) {
        char[] charArray = messageIn.toCharArray();
        String messageOut = "";
        int count = 0;

        for (char out : charArray) {
            if (count % 2 == 0)
              messageOut += out;
            count++;
        }
        return messageOut;
    }

    // 7. take a number greater than five and print a count up to that number omitting 4 - use while
    public static void countToX(int omega) {
        if (omega < 6)
            return;
        int i = 1;
        while ( i < omega ) {
            if (i != 4)
                System.out.print(i + "...");
            i++;
        }
        System.out.print(omega);
    }

    // 8. check if two provided numbers are identical -
    // if not, add 1 to each and return sum, if yes add 2 to each and return sum
    public static int numCheck(int a, int b) {
        if (a == b)
            return (a + b + 4);
        return a+b+2;
    }

    // 9. ask for country domain - print "United States" for US, "Germany" for DE, "Hungary" for HU, "Unknown" for rest.
    public static String domainCheck() {

        // Prompt user...
        System.out.print("Enter a two-letter country code (DE, HU, US): ");

        // Create a scanner and catch user input...
        Scanner scanner = new Scanner(System.in);
        String countryCode = scanner.nextLine().toLowerCase();

        switch (countryCode) {
            case "de":
                return "Germany";
            case "hu":
                return "Hungary";
            case "us":
                return "United States";
            default:
                return "Unknown";
        }
    }

    // 10. prompt for letter and print whether consonant or vowel
    public static String letterType() {

        // Prompt user...
        System.out.print("Enter a letter: ");

        // Create a scanner and catch first letter of user input...
        Scanner scanner = new Scanner(System.in);
        String letter = scanner.nextLine().substring(0, 1);

        if (letter.matches("[AaEeIiOoUu]"))
            return "The letter _" + letter + "_ is a vowel.\n";
        else if (letter.matches("[Yy]"))
            return "The letter _" + letter + "_ is sometimes a vowel, sometimes a consonant.\n";
        else if (letter.matches("[BbCcDdFfGgHhJjKkLlMmNnPpQqRrSsTtVvWwXxZz]"))
            return "The letter _" + letter + "_ is a consonant.\n";
        else
            return "The character _" + letter + "_ is not a letter in the English language.\n";
    }
}