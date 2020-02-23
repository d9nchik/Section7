import java.util.Scanner;

public class exercise34 {
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        Scanner input = new Scanner(System.in);
        System.out.println("Ordered string is " + sort(input.next()));
    }

    public static String sort(String s) {
        char[] str = new char[s.length()];
        for (int k = 0; k < s.length(); k++) {
            str[k] = s.charAt(k);
        }
        for (int k = 0; k < str.length; k++) {
            int minimum = k;
            for (int j = k + 1; j < str.length; j++) {
                if (str[minimum] > str[j])
                    minimum = j;
            }
            char temp = str[minimum];
            str[minimum] = str[k];
            str[k] = temp;
        }

        StringBuilder out = new StringBuilder();
        for (char symbol : str)
            out.append(symbol);
        return out.toString();
    }
}
