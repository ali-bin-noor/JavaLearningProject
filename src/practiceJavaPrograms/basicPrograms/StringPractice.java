package practiceJavaPrograms.basicPrograms;

public class StringPractice {
    public static void main(String[] args) {
        String input = "swissdfkdsfkdssbgjsgew";
        System.out.println("Non repeating character : " + nonRepeatingCharacter(input));
    }

    private static String nonRepeatingCharacter(String input) {
        String character = null;
        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] != charArray[j]) {
                    character = String.valueOf(charArray[i]);
                }
            }
        }
        return character;
    }
}
