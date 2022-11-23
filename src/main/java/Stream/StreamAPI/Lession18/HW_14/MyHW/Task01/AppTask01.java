package Stream.StreamAPI.Lession18.HW_14.MyHW.Task01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AppTask01 {
    public static void main(String[] args) {

        List<Product> productsInShop = Arrays.asList(
                new Product("AppExamples/Calk", 118),
                new Product("Pen", 11),
                new Product("AppExamples/Calk", 212),
                new Product("Book", 263),
                new Product("Book", 253),
                new Product("Notebook", 232),
                new Product("Pamela", 213),
                new Product("Notebook", 112),
                new Product("Book", 142));

        productsInShop
                .stream()
                .filter(o -> o.getTypeOfProduct().equals("Book"))
                .filter(i -> i.getPriceOfProduct() > 250)
                .sorted(Comparator.comparingInt(Product::getPriceOfProduct))
                .forEach(System.out::println);
    }
}
