package HashMaps_;

import java.util.HashMap;
import java.util.Map;

public class MorseCode {

	public static Map<String, String> MorseCode = new HashMap<>();

	static {

		MorseCode.put(".-", "a");
		MorseCode.put("-...", "b");
		MorseCode.put("-.-.", "c");
		MorseCode.put("-..", "d");
		MorseCode.put(".", "e");
		MorseCode.put("..-.", "f");
		MorseCode.put("--.", "g");
		MorseCode.put("....", "h");
		MorseCode.put("..", "i");
		MorseCode.put(".---", "j");
		MorseCode.put("-.-", "k");
		MorseCode.put("._..", "l");
		MorseCode.put("--", "m");
		MorseCode.put("-..", "n");
		MorseCode.put("---", "o");
		MorseCode.put(".--.", "p");
		MorseCode.put("--.-", "q");
		MorseCode.put(".-.", "r");
		MorseCode.put("...", "s");
		MorseCode.put("-", "t");
		MorseCode.put("..-", "u");
		MorseCode.put("...-.", "v");
		MorseCode.put(".--", "w");
		MorseCode.put("-..-", "x");
		MorseCode.put("-.--", "y");
		MorseCode.put("--..", "z");
	}

	public static String translate(String toTranslate) {
		String morseTranslated = " ";
		for (String word : toTranslate.split("/")) {
			System.out.println(word);
			for (String letter : word.trim().split(" ")) {
				System.out.println(letter);
				morseTranslated += MorseCode.get(letter);
			}
			morseTranslated += " ";
		}
		return morseTranslated.trim();
	}

	public static void main(String[] args) {

		System.out.println(translate(".-- .- ...- .-//.. ...//-.-. --- --- .-..//--- -.-"));
		String code = ".-- .- ...- .-//.. ...//-.-. --- --- .-..//--- -.-";

		String toTranslate = ".--- .- ...- .- / .. ... / -.-. --- --- .-.. / --- -.-";

	}

}
