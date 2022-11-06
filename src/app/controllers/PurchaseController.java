package app.controllers;

import app.models.PurchaseModel;
import app.utils.Rounder;
import app.views.PurchaseView;

public class PurchaseController {

    PurchaseModel model;
    PurchaseView view;

    // Конструктор
    public PurchaseController(PurchaseModel model, PurchaseView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {

        view.getInputs();

        String name = model.getName();

        double paymentInitial = model.calculatePayment(model.getQuantity(), model.getPrice());
        String paymentInitialRounded = Rounder.roundValue(paymentInitial);

        double discount = model.calculateDiscount(paymentInitial);
        String discountRounded = Rounder.roundValue(discount);

        String paymentRounded = Rounder.roundValue(model
                .calculatePayment(paymentInitial, discount));

        String output = "------------------------------\n" +
                "Product name: " + name + "\n" +
                "Purchase amount (USD): " + paymentInitialRounded + "\n" +
                "Discount amount (USD): " + discountRounded + "\n" +
                "For payment (USD): " + paymentRounded;

        view.getOutput(output);
    }
}
