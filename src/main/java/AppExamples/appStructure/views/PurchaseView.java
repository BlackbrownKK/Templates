package AppExamples.appStructure.views;

import AppExamples.appStructure.models.PurchaseModel;
import AppExamples.appStructure.utils.Validator;

import java.util.Scanner;

// View
public class PurchaseView {

    PurchaseModel model;
    String title;
    String name;
    int quantity;
    double price;
    Scanner scanner;

    // Конструктор
    public PurchaseView(PurchaseModel model) {
        this.model = model;
    }

    public void getInputs() {

        // Создаем экземпляр Scanner
        scanner = new Scanner(System.in);

        // Ввод и валидация данных

        title = "Enter product name: ";
        System.out.print(title);
        name = Validator.validateName(scanner);
        model.setName(name);

        title = "Enter product quantity (pcs.): ";
        System.out.print(title);
        quantity = Validator.validateQuantityInput(scanner);
        model.setQuantity(quantity);

        title = "Enter product price (USD): ";
        System.out.print(title);
        price = Validator.validatePriceInput(scanner);
        model.setPrice(price);

        // Закрываем Scanner
        scanner.close();
    }

    // Вывод данных
    public void getOutput(String output) {
        System.out.println(output);
    }
}
