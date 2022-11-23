package DataType.Exercise;

public class everyNth {

    public static void main(String[] args) {
        System.out.println(everyNth("very well", 4));
    }

    public static String everyNth(String str, int n) {
        String result = "";

        // Look at every nth char
        for (int i=0; i<str.length(); i = i + n) {
            result = result + str.charAt(i);
        }
        return result;
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile == true || bSmile == true){
            return true;}
  else if (aSmile == false || bSmile == false){
            return true;
        }else{
            return false;
        }
    }
}
