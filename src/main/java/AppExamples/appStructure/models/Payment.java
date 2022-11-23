package AppExamples.appStructure.models;

// Интерфейс платежа
public interface Payment {

    // Базовые методы для расчета платежа.
    // Применение перегрузки методов.
    double calculatePayment(int quota, double price);

    double calculatePayment(double payment, double discount);
}
