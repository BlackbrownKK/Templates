package InterfacesAbstract.classes_abstract_intro;

// Класс наследует абстрактный класс, и:
// - ДОЛЖЕН переопределить все абстрактные методы абстрактного класса;
// - МОЖЕТ переопределить все неабстрактные методы абстрактного класса.
class Plane extends Transport {

    // ДОЛЖЕН переопределить.
    // Аннотация @Override - опциональна.
    void run() {
        System.out.println("Летим.");
    }

    // МОЖЕТ переопределить.
    @Override
    void changeSpeed() {
        System.out.println("Скорость 500 км/ч.");
    }
}
