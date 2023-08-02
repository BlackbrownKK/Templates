package DataType.string;

public class StringBufferStringBuilder {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");
        String result = sb.toString(); // Converts the StringBuffer to a String
        System.out.println(result);

        StringBuilder sb2 = new StringBuilder();
        sb2.append("Java");
        sb2.append(" ");
        sb2.append("is");
        sb2.append(" ");
        sb2.append("great");
        String result2 = sb2.toString(); // Converts the StringBuilder to a String
        System.out.println(result2);

        System.out.println(  sb2.reverse());


// The methods equals() and hashCode() are not overridden for the classes StringBuffer and StringBuilder.
// Based on this, it is impossible to compare the content of two objects.
 System.out.println(sb2.toString().contentEquals(sb));

        System.out.println(sb2.capacity());
        sb2.delete(3,5);
        System.out.println(sb2);


// Remember, StringBuilder is generally preferred in most scenarios due to its better performance,
// unless you specifically need thread safety provided by StringBuffer.

        StringBuilder sb3 = new StringBuilder(10);
        sb3.append("Hello...");
        char c = '!';
        sb3.append(c);
        sb3.insert(8, " Java");
        sb3.delete(5, 8);
        System.out.println(sb3);

    }

    /*
    int capacity()

Returns the current capacity

void ensureCapacity(int minimumCapacity)

Ensures that the capacity is at least equal to the specified minimum
void setLength(int newLength)	Sets the length of the character sequence:
If the new size is larger than the stored string, the string will be supplemented with whitespaces at the end.
If the new size is smaller, the string will be trimmed.
StringBuilder append(…)	Appends the string representation of the argument to the sequence
StringBuilder insert(…)	Inserts the string representation of the argument into the sequence
char charAt(int index)	Returns the char value in the sequence at the specified index
StringBuilder delete(int start, int end)	Removes the characters in a substring of the sequence
StringBuilder deleteCharAt(int index)	Removes the char at a specified position in the sequence
StringBuilder replace(int start, int end, String str)	Replaces the characters in a substring of the sequence with characters in the specified String
String substring(int start)
String substring(int start, int end)	Returns a new String that contains a subsequence of characters currently contained in the character sequence
StringBuilder reverse()	Causes the character sequence to be replaced by the inverse of the sequence
     */
}
