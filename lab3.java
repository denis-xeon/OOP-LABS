import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        final int C3 = 1517 % 3;//String
        System.out.println("C3 = " + C3 + " /String");
        final int C17 = 1517 % 17;//В кожному реченні заданого тексту змінити місцями перше та останнє слово, не змінивши довжини речення.
        System.out.println("C17 = " + C17 + " /В кожному реченні заданого тексту змінити місцями перше та останнє слово, не змінивши довжини речення");

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Введіть текст: ");
            String text = scan.nextLine();
            if (text.length() < 1) {
                System.out.println("Ви не ввели текст!");
            } else {
                String[] sentences = text.split("\\.\\s+");
                for (int i = 0; i < sentences.length; i++) {
                    String[] splitted_sentence = sentences[i].split("[\\s]+");
                    String final_sentence = splitted_sentence[splitted_sentence.length - 1] + " ";
                    for (int j = 1; j < splitted_sentence.length - 1; j++) {
                        final_sentence += splitted_sentence[j] + " ";
                    }
                    final_sentence += splitted_sentence[0] + ".";
                    System.out.println(final_sentence);
                }
            }
        }
    }
}
