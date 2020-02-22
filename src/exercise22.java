import java.util.Scanner;

public class exercise22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userLine = input.nextLine();
        System.out.println("Number of vowels is equal " + vowels(userLine));
    }

    public static int vowels(String userLine) {
        char[] allVowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        int vowelCount = 0;
        for (int k = 0; k < userLine.length(); k++) {
            for (char allVowel : allVowels) {
                if (userLine.charAt(k) == allVowel)
                    vowelCount++;
            }
        }
        return vowelCount;
    }
}
