package Collection;

public class ArrayList<F> {
    public static void main(String[] args) {
        User<String> user = new User<>();
        user.setValue("hello");
        System.out.println(user.getValue());


        User<Integer> user1 = new User<>();
        user1.setValue(1);
        System.out.println(user1.getValue());

    }


}
