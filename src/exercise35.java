import java.util.Arrays;
import java.util.Scanner;

public class exercise35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {"write", "that", "program", "porn"};

        char userContinue = 'y';
        while (userContinue != 'n') {
            int randomChoice = (int) (Math.random() * words.length);

            char[] guessingWord = createGuessingWord(words[randomChoice].length());

            int missed = 0;

            while (!(isGuessed(guessingWord))) {
                System.out.print("(Guess) Enter a letter in word ");
                showWord(guessingWord);
                System.out.print(" > ");
                char userChoice = input.next().charAt(0);
                if (isLetterOnTheWord(userChoice, words[randomChoice])) {
                    openLetter(userChoice, guessingWord, words[randomChoice]);
                } else {
                    missed++;
                    System.out.println("\t" + userChoice + " is not in the word");
                }
            }

            System.out.println("The word is " + words[randomChoice] + ". You missed " + missed + " time");
            System.out.println();
            System.out.print("Do you want to guess another word? Enter y or n> ");
            userContinue = input.next().charAt(0);
        }

    }

    public static char[] createGuessingWord(int length) {
        char[] guessingWord = new char[length];
        Arrays.fill(guessingWord, '*');
        return guessingWord;
    }

    public static boolean isGuessed(char[] guessingWord) {
        for (char c : guessingWord) {
            if (c == '*')
                return false;
        }
        return true;
    }

    public static void openLetter(char symbol, char[] guessingWord, String word) {
        for (int k = 0; k < word.length(); k++) {
            if (word.charAt(k) == symbol) {
                if (guessingWord[k] == symbol) {
                    System.out.println("\t" + symbol + " is already in the word");
                    return;
                }

                guessingWord[k] = symbol;
            }
        }
    }

    public static boolean isLetterOnTheWord(char symbol, String word) {
        for (int k = 0; k < word.length(); k++) {
            if (word.charAt(k) == symbol)
                return true;
        }
        return false;
    }

    public static void showWord(char[] word) {
        for (char symbol : word)
            System.out.print(symbol);
    }
}
