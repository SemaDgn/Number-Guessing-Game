import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) {

		System.out.print("Lütfen bir kelime giriniz :");
		Scanner sc = new Scanner(System.in);
		String enteredWord = sc.nextLine();
		while (enteredWord.equals(ReverseWord(enteredWord))) {
			System.out.println("Girilen kelime palindrom bir kelimedir: " + enteredWord);
			System.out.print("Lütfen başka bir kelime giriniz :");
			enteredWord = sc.nextLine();

		}
		System.out.println("Reversed word: " + ReverseWord(enteredWord));
	}

	public static String ReverseWord(String word) {
		char ch;
		String rword = "";
		for (int i = 0; i < word.length(); i++) {
			ch = word.charAt(i);
			rword = ch + rword;
		}
		return rword;
	}
}

