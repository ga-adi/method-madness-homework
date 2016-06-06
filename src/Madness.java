//import java.util.Scanner;
import java.util.Random;
public class Madness {

    public static class Car {

        public int mTopSpeed;
        public int mNumberOfDoors;
        // Call random class to generate random numbers.
        // Ref class location: https://docs.oracle.com/javase/7/docs/api/java/util/Random.html
        // Ref example: http://stackoverflow.com/questions/5887709/getting-random-numbers-in-java
        Random randomSpeed = new Random();
        Random randomDoor = new Random();

        Car(int mTopSpeed, int mNumberOfDoors) {
            this.mTopSpeed = mTopSpeed;
            this.mNumberOfDoors = mNumberOfDoors;
        }

        public void floorIt() {
            mTopSpeed = mTopSpeed + 5;
        }
        public void addADoor() {
            mNumberOfDoors = mNumberOfDoors + 5;
        }

        public int getSpeed() {
            // Generate random numbers 0-99.
            int n = randomSpeed.nextInt(100);
            mTopSpeed = n;
            return mTopSpeed;
        }
        public int getDoors() {
            // Generate random numbers 0-9.
            int d = randomDoor.nextInt(10);
            mNumberOfDoors = d;
            return mNumberOfDoors;
        }
    }

    /* Main Method *****************************************************************/
    public static void main(String[] args) {
        // 1. The call to function, maxOfTwoNumbers, for max number between 2 numbers.
        //--------------------------------------------------
        int a1 = 3;
        int b1 = 5;
        int maxnumber1 = maxOfTwoNumbers(a1,b1);
        System.out.println("Max number between " + a1 + " and " + b1 + " is " + maxnumber1);

        //Solution #2 for max number using Math function in java.lang.math.
        //Ref. from http://www.cafeaulait.org/course/week4/40.html
        //System.out.println("Max number between " + a + " and " + b + " is " + Math.max(a,b));

        // 2. The call to function, maxOfThree, for max number between 3 numbers.
        //--------------------------------------------------
        int a2 = 83;
        int b2 = 51;
        int c2 = 8;
        int maxnumber2 = maxOfThree(a2,b2,c2);
        System.out.println("Max number between (" + a2 + "," + b2 + "," + c2 + ") is: " + maxnumber2);

        // 3. The call to function, isCharacterAVowel, to check if the character is a vowel
        //-----------------------------------------------------
        char c3 = 'p';
        if (isCharacterAVowel(c3) == true)
            System.out.println("The character " + c3 + " is a vowel");
        else
            System.out.println("The character " + c3 + " is not a vowel");

        // 4. The call to function, numberOfArgs, to display the number of arguments paased to the function.
        //---------------------------------------------------------------------------
        int a4 = numberOfArgs(32, 43 , 53   );
        System.out.println("The number of arguments passed is: " + a4);

        // 5. The call to function,reverseString, to display the reverse order of a string.
        //----------------------------------------------------------
        String s5 = "hello world";
        String r5 = reverseString(s5);
        // Incude double quotes in output
        // Ref.:http://stackoverflow.com/questions/3844595/how-can-i-make-java-print-quotes-like-hello
        System.out.println("The reverse string of \"" + s5 + "\" is: " + r5);


//System.out.print("\"Hello\"");

        // 6. The call to function,findLongestWord, for the length of the longest word in an array.
        //----------------------------------------------------------------
        String str61 = "Chicago";
        String str62 = "Detroit";
        String str63 = "Huntington Beach";
        String[] array6 = {str61,str62,str63};
        int lengthLongestWord = findLongestWord(array6);
        System.out.println("The length of the longest word between: "+str61+" , "+str62+" , "+str63+" is "+ lengthLongestWord);

        // 7. The call to function,filterLongWords, for the length of the longest word in an array.
        //----------------------------------------------------------------
        String str71 = "San Francisco";
        String str72 = "New York";
        String str73 = "Huntington Beach";
        int numFilter = 8;
        int i = 0;
        String[] longestWord;
        String[] array7 = {str71,str72,str73};
        longestWord = filterLongWords(array7,numFilter);

        System.out.println("The words with a length greater than "+numFilter+" are: ");

        for (i=0; i<longestWord.length; ++i) {
            // Had to define the array based on the number of entries in the array (i.e. = 3)
            // Since the print statement displays entries with null values, I coded an 'if'
            // statement to remove the null values.
            // Ref: http://stackoverflow.com/questions/2369967/how-we-check-for-null-array-in-java
            if (longestWord[i] != null)
                // Prints the contents of the array, not the memory address.
                // http://stackoverflow.com/questions/29368480/returning-array-contents-instead-of-memory-address
                System.out.println(longestWord[i]);
        }


        // Call to Car constructor method to generate random number of speeds/doors.
        //--------------------------------------------------------------------------
        // Ref. https://www.daniweb.com/programming/software-development/threads/320965/java-car-class-problem.
        Car car1 = new Car(0,0);
        for (int x = 0; x < 5; ++x) {
            // Test Stuff
            // car1.floorIt();
            // car1.addADoor();
            System.out.println("Your car has the top speed of " + (car1.getSpeed()) + " mph, and for some reason has " + (car1.getDoors()) + " doors.");
        }

    }

    // Function #1.
    public static int maxOfTwoNumbers(int n1, int n2) {
        // Used the conditional operator. Ref. = Java in a Nutshell 6th ed. page 44.
        int maxnum = (n1 > n2) ? n1 : n2;
        return maxnum;
    }

    // Function #2.
    public static int maxOfThree(int n1, int n2, int n3) {
        // Used the conditional operator. Ref. = Java in a Nutshell 6th ed. page 44.
        // Get max from 1st 2 numbers and save it.
        int max1 = (n1 > n2) ? n1 : n2;
        // Compare the max # from 1st 2 numbers to third number.
        int finalmax = (max1 > n3) ? max1 : n3;
        return finalmax;
    }

    // Function #3.
    public static boolean isCharacterAVowel(char c1) {
        // First convert the character to uppercase, to reduce the number of characters
        // to check from 10 down to 5.
        // Reference for converting to uppercase:
        // http://stackoverflow.com/questions/21147319/how-to-convert-input-char-to-uppercase-automatically-in-java
        c1 = Character.toUpperCase(c1);
        if ((c1 == 'A') || (c1 == 'E') || (c1 == 'I') || (c1 == 'O') || (c1 == 'U'))
            return true;
        else
            return false;
    }

    // Function #4.
    public static int numberOfArgs(int... rest) {
        //The function expects the arguments to be separated by commas.
        // Used the Variable-length argument list. Ref. = Java in a Nutshell 6th ed. page 71.
        int num = 0;
        for (int i : rest) {
            num = num + 1;
        }
        return num;
    }

    // Function #5.
    public static String reverseString(String c) {
        //Using the StringBuffer method to reverse the string.
        //http://www.tutorialspoint.com/javaexamples/string_reverse.htm
        String reverseName = new StringBuffer(c).reverse().toString();
        return reverseName;
    }

    // Function #6.
    public static int findLongestWord(String[] wordArray) {
        //The function expects an array of words, which returns the length of the longest one.
        //http://alvinalexander.com/blog/post/java/method-return-longest-string-in-given-array-of-strings
        int maxWord = 0;
        int i = 0;
        for (String w : wordArray) {
            if (wordArray[i].length() > maxWord) {
                maxWord = wordArray[i].length();
            }
            i = i + 1;

        }
    return maxWord;
    }

    // Function #7.
    public static String[] filterLongWords(String[] argWordArray, int argFilterNum) {
        //The function gets passed an array of strings and a number.  This function will filter
        // the strings in the array that are at least the length of the number.
        //http://alvinalexander.com/blog/post/java/method-return-longest-string-in-given-array-of-strings

        //* Attempted to count the number of records in array that qualify for the length of the
        //* number passed and declare my array based on the # of entries.
        int num = 0;
        int i = 0;
        int mtdargFilterNum = argFilterNum;

        for (String x : argWordArray) {
            if (argWordArray[i].length() > mtdargFilterNum) {
                num = num + 1;
            }
            i++;
        }
        int h = 0;

        // Setting up the array to be returned to the main() function
        // Ref: http://www.mathcs.emory.edu/~cheung/Courses/170/Syllabus/09/array-return.html
        String[] array;

        //*Tried declaring my returning array (which may be smaller than the incoming array size
        //*depending of filtered entries) based on above for loop.  Compiles clean, but get
        //* exception error, "java.lang.ArrayIndexOutOfBoundsException" when size of
        //* returning array smaller than original array string.
        //* array = new String[num];

        array = new String[argWordArray.length];
        for (String x : argWordArray) {
            if (argWordArray[h].length() > mtdargFilterNum) {
                array[h] = new String();
                array[h] = argWordArray[h];
                }
            h++;
        }
        return (array);
    }

}

