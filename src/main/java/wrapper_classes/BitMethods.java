package wrapper_classes;

public class BitMethods {
    public static void main(String[] args) {

        int a = 500; // binary: 111110100
/*
highestOneBit method looks for a highest 1 bit in value and returns an integer, where bit in this position is the only one.

lowestOneBit does the same but considers position of the lowest 1 bit.

bitCount just counts, how many 1 bits an integer value contains.

numberOfLeadingZeros counts, how many 0 bits comes before the first 1 bit in the integer value.

 */
        int highestOneBit = Integer.highestOneBit(a); // 256 : 100000000
        int lowestOneBit = Integer.lowestOneBit(a); // 4 : 100
        int bitCount = Integer.bitCount(a); // 6

        int leadingZeros = Integer.numberOfLeadingZeros(a); // 23

        System.out.println("0".repeat(leadingZeros) + Integer.toBinaryString(a));
        // prints "00000000000000000000000111110100"


    }

}
