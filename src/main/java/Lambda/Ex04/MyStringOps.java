package Lambda.Ex04;
// В этом классе определяется статический метод strReverse()
  class MyStringOps {

// Статический метод, изменяющий порядок следования символов в строке

    static String strReverse(String str){
        String result = "";
        int i;

        for(i = str.length()-1; i >=0; i--)
           result += str.charAt(i);
        return result;
    }
}
