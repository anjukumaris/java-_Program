package method;
import java.util.Scanner;
public class WordsNumber {
    public static void main(String[] args) {
        WordsNumber obj = new WordsNumber();
        obj.wordSentence();
    }

    public static void wordSentence() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Sentence::: ");
        String str = sc.nextLine();
        String wordArray[] = str.split("\\s");

        System.out.println("Number of Words ::::");

        for (String w : wordArray) {
            System.out.println(w);
        }
        int word = 0;
        System.out.println("-------------------------");
        System.out.println("Word Length::::::");
        for (int i = 0; i < wordArray.length; i++) {

            word++;
        }
        System.out.println(word);
        sc.close();

    }
}



