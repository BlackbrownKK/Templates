package debagger;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class OutOfMemoryError {


        private static List<Product> products =  new ArrayList<>();
        public static void main(String[] args) {
            while (true) {
                products.add( new Product(UUID.randomUUID().toString()));
            }
        }


    private static class Product {
        UUID name;

        public Product(String name) {
            this.name = UUID.fromString(name);
        }
    }
}
