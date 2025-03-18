import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan sebuah string: ");
        String input = scanner.nextLine();

        char[] inputChar = input.toCharArray();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < inputChar.length; i++) {
            char currentChar = inputChar[i];
            if (currentChar == 'i' || currentChar == 'o' || currentChar == 'e' || currentChar == 'a' || currentChar == 'u') {
                result.append(currentChar);
            }
        }

        System.out.println("Output: " + result.toString());
    }
}
