package Arrays.leedcode;

import Classes.demo_07.C;

import java.util.HashMap;

/*
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
 */
public class SolutionRomeNums {
    public static void main(String[] args) {

        //System.out.println(romanToInt("MCMXCIV"));
        System.out.println(romanToInt("DCCC"));
    }

// MCMXCIV

    static HashMap<String, Integer> romaNums = new HashMap<>();


    public static int romanToInt(String s) {
        int result = 0;
        int prevVal = 0;

        // Define the values for Roman numerals
        HashMap<Character, Integer> romaNums = new HashMap<>();
        romaNums.put('I', 1);
        romaNums.put('V', 5);
        romaNums.put('X', 10);
        romaNums.put('L', 50);
        romaNums.put('C', 100);
        romaNums.put('D', 500);
        romaNums.put('M', 1000);

        char[] inputStr = s.toCharArray();
        for (int i = inputStr.length - 1; i >= 0; i--) {
            int currentValue = romaNums.get(inputStr[i]);
            if (currentValue < prevVal) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
            prevVal = currentValue;
        }
        return result;
    }


    public static int romanToInt1(String s) {
        StringBuffer stringBuffer = new StringBuffer();
        initiateRomaNums();
        char[] inputStr = s.toCharArray();
        for (int i = inputStr.length - 1; i >= 0; i--) {
            if (i >= 4) {
                String s1 = "";
                s1 += String.valueOf(inputStr[i]);
                s1 += String.valueOf(inputStr[i - 1]);
                s1 += String.valueOf(inputStr[i - 2]);
                s1 += String.valueOf(inputStr[i - 3]);
                System.out.println(s1);
                stringBuffer.append(romaNums.get(s1));
//1111
            }


        }
        stringBuffer.reverse();
        System.out.println(stringBuffer.toString());
        return Integer.parseInt(stringBuffer.toString());
    }


    private static void initiateRomaNums() {
        romaNums.put("I", 1);
        romaNums.put("II", 2);
        romaNums.put("III", 3);
        romaNums.put("IV", 4);
        romaNums.put("V", 5);
        romaNums.put("VI", 6);
        romaNums.put("VII", 7);
        romaNums.put("VIII", 8);
        romaNums.put("IX", 9);
        romaNums.put("X", 10);
        romaNums.put("XX", 20);
        romaNums.put("XXX", 30);
        romaNums.put("XL", 40);
        romaNums.put("L", 50);
        romaNums.put("LX", 60);
        romaNums.put("LXX", 70);
        romaNums.put("LXXX", 80);
        romaNums.put("XC", 90);
        romaNums.put("C", 100);
        romaNums.put("CC", 200);
        romaNums.put("CCC", 300);
        romaNums.put("CD", 400);
        romaNums.put("D", 500);
        romaNums.put("DC", 600);
        romaNums.put("DCC", 700);
        romaNums.put("DCCC", 800);
        romaNums.put("CM", 900);
        romaNums.put("M", 1000);
        romaNums.put("MM", 2000);
        romaNums.put("MMM", 3000);

    }

}
