package DataType.string;

public class GetChars {
    public static void main(String[] args) {
        String str = "Software And Hardware!";
        int start = 9;
        int end = 12;
        char[] dst = new char[end - start];
        str.getChars(start, end, dst, 0);
        System.out.println(dst);


    }
}
/*
srcBegin is the first index in the string; it is required to start the extraction of characters.
srcEnd is the last index in the string for which characters will be extracted.
dst is the array where the extracted characters will be placed.
dstBegin is the index in the array dst, starting from which we need to add the characters extracted from the string.
 */