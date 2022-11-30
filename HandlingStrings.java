
import java.util.Arrays;
import java.util.Scanner;

public class HandlingString {

    public static void main(String[] args) {

        //conversion();
        //manipulate()
        //reverse();
        //guess();
        array();

    }

    private static void conversion() {
        char ascii = 'a';
        int x = (char) ascii;
        System.out.println(x);

        int asciinum = 97;
        char letter = (char) asciinum;
        System.out.println(letter);

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first sentence: ");
        String first = input.nextLine();
        System.out.println("Enter second sentence :");
        String second = input.nextLine();

        String third = first.concat(second);

        String output = "The new phrase is: ";
        System.out.println(output + third);
    }

    private static void manipulate() {

        String str1 = "The spotted cuckoo";
        String str2 = "Is flying backwards";
        String str3 = "It's a cold day for pontooning";

        String output = (str1 + str2).trim();
        System.out.println(output);

        int length = (str1).length();
        System.out.println("Str1 " + length);
        int length2 = (str2).length();
        System.out.println("Str2 " + length2);
        int length3 = (str3).length();
        System.out.println("Str3 " + length3);
        int length4 = (str1 + str2 + str3).length();
        System.out.println("Total " + length4);

        String index3 = str1.substring(4, 8);
        System.out.println("Str1 " + index3);
        String index2 = str2.substring(12, 13);
        System.out.println("Str 2 " + index2);
        String index1 = str3.substring(27, 29);
        System.out.println("Str3 " + index1);

        str3 = str3.toLowerCase();
        int total = 0;
        for (int i = 0; i < str3.length(); i++) {
            int charPosition = str3.charAt(i);
            if (charPosition == 111) {
                total = total + 1;
                System.out.println("Character o at :" + (i + 1));
                System.out.println(total);
            }
        }

        int charPosition1 = str3.indexOf("on");
        System.out.println("Character on at :" + charPosition1);
    }

    private static void reverse() {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String str = input.nextLine(), nstr = "";
        System.out.println("Original word : " + str);

        StringBuilder str1 = new StringBuilder();
        str1.append(str);
        str1.reverse();

        System.out.println("Reversed word: " + str1);
    }

    private static void guess() {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter word for player 2 to guess: ");
        String guessword = input.nextLine();

        int k = 5;
        int i;
        for (i = 0; i < k; i++) {
            System.out.println("Guess the word");
            String guess = input.nextLine();

            if (guess.equals(guessword)) {
                System.out.println("You win");
                break;
            } else {
                System.out.println("Try again");
            }

            if (i == k) {
                System.out.println("You ran out of tries " + guessword + " was the word");
            }

        }
    }

    private static void array() {
        System.out.println("Enter the size of the array: ");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int myArray[] = new int[size];
        System.out.println("Enter the integer: ");

        for (int i = 0; i < size; i++) {
            myArray[i] = input.nextInt();
        }
        System.out.println("Contents of the array are: " + Arrays.toString(myArray));

        for (int j = 0; j < size; j++) {

            char letter = (char) myArray[j];
            System.out.print(letter);
        }
        System.out.println(" ");
    }

}
