package DataType.string;

public class Split {
    public static void main(String[] args) {
       //String split(String regex)	Splits this string around matches of the given regular expression

       String str = "Black box / in the room / to out place" ;

       str.split("/");
        String [] arrays =   str.split("/");
        for (String work:arrays) {
            System.out.println(work);
        }
    }
}
