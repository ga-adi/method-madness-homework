import java.util.*;

public class Probs {
    public static void main(String[] args) {
        maxOfTwoNumbers(2, 3);
        maxOfThree(2, 3, 4);
        isCharacterAVowel("y");

        String[] array = new String[]{"a", "few", "of", "these", "args"};
        noOfArgs(array);

        String string = "this-a-one";
        reverseString(string);

        String[] array2 = new String[]{"the", "longest", "one", "isn't", "long"};
        findLongestWord(array2);

        String[] array3 = new String[]{"longishest","talkativest","short","q","r"};
        filterLongWords(3, array3);

        oddOrEven(4);

        Probs prob = new Probs();
        prob.greaterThanFifty();
    }

    // 1
    public static Float maxOfTwoNumbers(float f1, float f2) {
        float larger = 0;
        if (f1 > f2) {
            larger = f1;
        }
        if (f2 > f1) {
            larger = f2;
        }
        System.out.println(larger);
        return larger;
    }

    // 2 there is prob an easier way here - http://stackoverflow.com/questions/1484347/finding-the-max-min-value-in-an-array-of-primitives-using-java
    public static Float maxOfThree(float f1, float f2, float f3) {

        float[] a = {f1, f2, f3};
        float max = f1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(max);
        return max;
    }

    //3
    public static boolean isCharacterAVowel(String string) {

        boolean isVowel = false;

        switch (string) {
            case "a":
                System.out.println("Vowel");
                isVowel = true;
                break;
            case "e":
                System.out.println("Vowel");
                isVowel = true;
                break;
            case "i":
                System.out.println("Vowel");
                isVowel = true;
                break;
            case "o":
                System.out.println("Vowel");
                isVowel = true;
                break;
            case "u":
                System.out.println("Vowel");
                isVowel = true;
                break;
            case "y":
                System.out.println("Maybe");
                isVowel = true;
                break;
        }

        return isVowel;
    }

    //4
    public static int noOfArgs(String[] args) {
        int noOfArgs = args.length;
        System.out.println(noOfArgs);
        return noOfArgs;
    }

    //5 http://stackoverflow.com/questions/11229986/get-string-character-by-index-java
    public static String reverseString(String args) {
        String reverse = "";
        int lastCharPos = args.length() - 1;
        for (int i = lastCharPos; i >= 0; i--) {
            char a_char = args.charAt(i);
            reverse = reverse + a_char;
        }
        System.out.println(reverse);
        return reverse;

    }

    //6
    public static int findLongestWord(String[] args) {
        int longest = 0;

        for (int i = 0; i < args.length; i++) {
            int length = args[i].length();

            if (length > longest) {
                longest = length;
            }
        }
        System.out.println(longest);
        return longest;

    }

    //7 remember - (Str2.length()); this one is not quite finished

    public static ArrayList<String> filterLongWords(int i, String[] args) {

        ArrayList<String> array4 = new ArrayList<String>();

        i = 3;

        for (int j = 0; j < args.length; j++) {

            String maybeAddThisWord = args[j];
            int loopedWordLength = maybeAddThisWord.length();

            if (loopedWordLength > i) {
                array4.add(maybeAddThisWord);
            }
        }

        return array4;

    }

    //8 is in Cars.java

    //bonus 1
    public static boolean oddOrEven(int number) {
        boolean result = false;
        if (number % 2 == 0) {
            result = true;
            System.out.println(result);
        } else {
            System.out.println(result);
        }
        return result;
    }

    //bonus 4
    public void greaterThanFifty() {
        Random rand = new Random();
        int randoNo = rand.nextInt(100);
        String text;
        text = Integer.toString(randoNo);

        if (randoNo > 50) {
            System.out.println("Rando no is " + text + " and, by the way, is larger than 50.");
        }
        else {
            System.out.println("Rando no is " + text + " and, by the way, -1");
        }


    }

}






