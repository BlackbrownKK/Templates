package Stream.StreamAPI.Lession18.HW_14;
import java.time.LocalDate;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(2021, 10, 1);
        LocalDate date2 = LocalDate.of(2022, 10, 2);
        LocalDate date3 = LocalDate.of(2022, 10, 3);

        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Book", 12, true, date2));
        products.add(new Product("Toy", 12, false, date1));
        products.add(new Product("Book", 234, true, date2));
        products.add(new Product("Toy", 234, true, date1));
        products.add(new Product("Book", 45, false, date2));
        products.add(new Product("Toy", 45, false, date1));

        products.add(new Product("Book", 456, false, date3));
        products.add(new Product("Toy", 456, false, date3));
        products.add(new Product("Book", 56, false, date3));

        products.add(new Product("Toy", 567, false, date2));
        products.add(new Product("Book", 68, true, date1));
        products.add(new Product("Toy", 68, true, date2));
        products.add(new Product("Book", 789, true, date1));
        products.add(new Product("Toy", 789, true, date2));

        StreamApp streamApp = new StreamApp(products);
        System.out.println("Filtered by type and price: " + streamApp.getFilteredByTypeAndPrice("Book", 250));
        System.out.println("Products with enabled discount: " + streamApp.applyDiscountByType("Book", 10));
        try {
            System.out.println("Lowest price product: " + streamApp.getLowestPriceProductByType("Book"));
        } catch (NoSuchElementException exception) {
            System.out.println("Can't get lowest price product. Product not found.");
        }
        System.out.println("3 recently added products: " + streamApp.getRecentlyAdded());
        System.out.println("Total sum: " + streamApp.getSumByParameters(LocalDate.now().getYear(), "Book", 75));
        System.out.println("Products grouped by type: " + streamApp.getGroupedByType());
    }
}
