package practiceJavaPrograms.Strings;

public class CheckConsonantsAndVowels {
    public static void main(String[] args) {
        String s = "thequickbrownfoxjumpsoverthelazydog";
        int v = 0;
        int c = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')
                v++;
            else
                c++;
        }
        if (v > c) System.out.println("Yes");
        else if (c > v) System.out.println("No");
        else System.out.println("Same");


        String s2 = "thequickbrownfoxjumpsoverthelazydog";
        char[] charArray = s2.toCharArray();
        for (char ch : charArray) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') v++;
            else if (Character.isAlphabetic(ch)) c++;

        }
    }

}
