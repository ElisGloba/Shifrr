import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public static String encrypt(String text, int shift) {
            StringBuilder result = new StringBuilder();

            for (char i : text.toCharArray()) {
                if (Character.isLetter(i)) {
                    char base = Character.isLowerCase(i) ? 'а' : 'А';
                    i = (char) ((i + shift - base) % 26 + base);
                }
                result.append(i);
            }
            return result.toString();
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите текст для шифрования:");
            String text = scanner.nextLine();

            System.out.println("Введите сдвиг (целое число):");
            int shift = scanner.nextInt();

            String encryptedText = encrypt(text, shift);
            System.out.println("Зашифрованный текст: " + encryptedText);
        }
    }
