package Lambda.Example01.Ex01;

import java.util.ArrayList;
import java.util.List;

public class WithtLambda {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("fich", false, true));
        animals.add(new Animal("kangaro", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));

        print(animals, a->a.canHop());
    }

    private static void print(List<Animal> animals, CheckTrait checker){
        for(Animal animal : animals){
            if (checker.test(animal))
                System.out.println(animal + " ");
        }
        System.out.println();
    }
}

