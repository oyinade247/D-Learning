public class Vowel{
	public static void main(String [] args){

	String word = "Hello world";
	String vowel = "aeiou";
	int vowelCount = 0;

	for (int index = 0; index < word.length(); index++) {
		char letter = word.charAt(index);

		for (int index2 = 0; index2 < vowel.length(); index2++) {
			if (letter == vowel.charAt(index2)) {
				System.out.println(letter);
				vowelCount++;
			}
		}
	}

	System.out.println(vowelCount);
}

}