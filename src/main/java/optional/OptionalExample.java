package optional;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        int [] arr = {1,6,8,7};
        IntService intService=new IntService();
//        double avg = intService.average(arr);
//        System.out.println(avg); //5.5

        Optional<Double> optionalDouble = intService.averageOrt(arr);


        if(optionalDouble.isPresent()){
            System.out.println(optionalDouble.get());
        }
        if (optionalDouble.isEmpty()){
            System.out.println("isEmpty");
        }

        optionalDouble.ifPresent(System.out::println);

        int [] arr1 = null;
        optionalDouble = intService.averageOrt(arr1);
        optionalDouble.ifPresent(System.out::println);
//        System.out.println(optionalDouble);



    }
}
