package app;

import app.controllers.PurchaseController;
import app.models.PurchaseModel;
import app.views.PurchaseView;

// Входная точка в программу/приложение
public class App {

    public static void main(String[] args) {

        // Создание экземпляров M, V, C
        PurchaseModel model = new PurchaseModel();
        PurchaseView view = new PurchaseView(model);
        PurchaseController controller = new PurchaseController(model, view);
        // Запуск программы/приложения
        controller.runApp();
    }
}
