package Stream.streamPlusLambda;


import java.util.ArrayList;

public class Ex01 {

    public static void main(String[] args) {
        ArrayList<Book> library = getLibrary();
        library.stream().filter(book -> {
            return book.getAuthor().startsWith("B");
        }).filter(book -> {
            return book.getName().startsWith("A");
        }).forEach(System.out::println);

        library.parallelStream().filter(book -> {
            return book.getAuthor().startsWith("B");
        }).filter(book -> {
            return book.getName().startsWith("A");
        }).forEach(System.out::println);

    }

    static ArrayList<Book> getLibrary() {
        ArrayList<Book> library = new ArrayList<>();
        library.add(new Book("B", "E"));
        library.add(new Book("B", "A"));
        library.add(new Book("C", "C"));
        library.add(new Book("D", "B"));
        library.add(new Book("E", "A"));
        return library;
    }
}
