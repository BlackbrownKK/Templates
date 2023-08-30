package wrapper_classes;

public class Ex01 {
    public static void main(String[] args) {
        Integer x = Integer.parseInt("+255");
        System.out.println("x = " + x);

         x = Integer.decode("0xff");
        System.out.println("x = " + x);

        Integer oct = Integer.decode("0377");   //Decodes as 255 (octal)
        Integer dec = Integer.decode("255");    //Decodes as 255 (decimal)
        Integer bin = Integer.parseInt("11111111", 2); //Decodes as 255 (binary)
        Integer bin2 = Integer.parseInt("3333", 4); //Decodes as 255 (quaternary)

        System.out.println(oct);
        System.out.println(dec);
        System.out.println(bin);
        System.out.println(bin2);

        String aString = x.toString();    //"255"
        System.out.println(aString);

        int s =  -255; // 255
        String aString2 = Integer.toString(s);    //"255"
        System.out.println(aString2);

        String hexString = Integer.toString(s, 16);   //"ff"
        String octString = Integer.toString(s, 8);    //"377"
        String binString = Integer.toString(s, 2);    //"11111111"

        System.out.println(hexString);
        System.out.println(octString);
        System.out.println(binString);

        String aString3 = Integer.toUnsignedString(s);    //"4294967041"

        String hexString2 = Integer.toUnsignedString(s, 16);   //"ffffff01"
        String octString2 = Integer.toUnsignedString(s, 8);    //"37777777401"
        String binString2 = Integer.toUnsignedString(s, 2);    //"11111111111111111111111100000001"


        System.out.println(aString3);
        System.out.println(hexString2);
        System.out.println(octString2);
        System.out.println(binString2);
    }
}
