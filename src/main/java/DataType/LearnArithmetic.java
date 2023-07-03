package DataType;

public class LearnArithmetic {
    /*
&	The bitwise operator and will put 1 into the result bit if both operands have 1 in this position.	Binary	(a & b) will give 12 (… 0000_1100)
|	The bitwise operator or will put 1 into the result bit if either operand has 1 in this position.	Binary	(a | b) will give 61 (… 0011_1101)
^	The bitwise operator exclusive or will put 1 into the result bit if one operand, but not both, has 1 in this position.	Binary	(a ^ b) will give 49 (… 0011_0001)
~	The bitwise operator complement "reflects" a bit.	Unary prefix	(~ a) will give -61 (1111_1111_1111_1111_1111_1111_1100_0011)
<< 	With the bitwise operator left shift, the value of the left operand is shifted to the left by the number of bits set by the right operand. The vacated bits on the right are filled with zeros.	Binary	a << 2 will give 240 (… 1111_0000)
b << 2 will give 52 (… 0011_0100)
>> 	With the bitwise operator right shift, the value of the left operand is shifted to the right by the number of bits set by the right operand. For positive numbers, the vacated leftmost bits are filled with zeros, and with ones for negative numbers.	Binary	a >> 2 will give 15 (… 0000_1111)
b >> 2 will give 3 (… 0000_0011)
(~ a >> 2) will give -16 (1111_1111_1111_1111_1111_1111_1111_0000)
>>> 	With the zero-fill right shift operator, the value of the left operand is shifted to the right by the number of bits set by the right operand, and the shifted values are always filled with zeros.	Binary	a >>> 2 will give 15 (… 0000_1111)
(~ a >> 2) will give 1073741808 (0011_1111_1111_1111_1111_1111_1111_0000)
     */
    public static void main(String[] args) {
        int a = 60;
        int b = 13;

        System.out.println("a & b   = " + (a & b)); // 12  = ... 0000 1100
        System.out.println("a | b   = " + (a | b)); // 61  = ... 0011 1101
        System.out.println("a ^ b   = " + (a ^ b)); // 49  = ... 0011 0001
        System.out.println("~a      = " + ~a); // -61 = 1111 1111 1111 1111 1111 1111 1100 0011
        System.out.println("a << 2  = " + (a << 2)); // 240 = ... 1111 0000
        System.out.println("a >> 2  = " + (a >> 2)); // 15  = ... 0000 1111
        System.out.println("a >>> 2 = " + (a >>> 2)); // 15  = ... 0000 1111
    }
}
