package Enums.enumEx02;

//Перечисление сортов яблок
enum Apple {
    // Использовать конструктор, переменную экземпляра и метод в перечислении
    Jonathan(10), GoldenDel(9), RedDel(12),
    Winesap(15), Cortland(8);
    private int price; // цена яблока каждого сорта

    //Конструктор
    Apple(int p) {
        price = p;

        //Перегружаемый конструктор  Apple() { price = -1;}
    }

    int getPrice() {
        return price;
    }
}

