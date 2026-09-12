package practiceJavaPrograms.Strings;

public class ChangeTheString {
    public static void main(String[] args) {
        String s = "AbCD";
        System.out.println(modify(s));
    }

    private static String modify(String s){
        char[] charArray = s.toCharArray();
        if(Character.isLowerCase(charArray[0])) return s.toLowerCase();
        return s.toUpperCase();
    }
}
