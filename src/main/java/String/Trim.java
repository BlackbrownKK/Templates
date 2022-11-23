package String;

public class Trim {
    public static void main( String args[] ) {
        String str = "     the quick brown fox     ";
        System.out.println("String with whitespaces: " + str);
        String trimmedStr = str.trim();
        System.out.println("Trimmed string: " + trimmedStr);
    }
}

