package Controls;

public class Forme1 {
    public static void main(String[] args) {
  String [] arr = {"a", "b", "c", "d", "i"};

    int renarr = arr.length;
    int count = 0;
    for (String str : arr) {
        System.out.println(str);}
        System.out.println("--------------------------");
    for (String str : arr) {
        if (str.equals("a"))
            continue;
        else if (count < renarr - 2)
            System.out.print(str + ", ");
        else
            System.out.print(str);
        count ++;
    }

    }

    }
