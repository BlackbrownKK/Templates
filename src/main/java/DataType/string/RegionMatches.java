package DataType.string;

public class RegionMatches {
    public static void main(String[] args) {
        String str1 = "Learn Java";
        String str2 = "Cool avatar!";
        boolean result = str1.regionMatches(7, str2, 5, 3);
 /*
 ignoreCase is a flag specifying that the letter case does not need to be considered when comparing
 (if the flag has a true value, the case is not considered).

toffset is an index from which the comparison starts in the string where we call this method.
other is a string with which the calling string is compared.
oofset is the index.
len is the number of characters to be compared in the two strings.
  */
        System.out.println(result);
    }
}
