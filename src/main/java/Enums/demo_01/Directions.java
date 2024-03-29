package Enums.demo_01;

// Здесь переменная Directions типа enum,
// которая представляет собой набор из четырех констант
// EAST, WEST, NORTH и SOUTH.
//
// Каждая константа перечисления всегда неявно является
// public static final.
// Поскольку константа static, можем получить к ней доступ,
// используя имя перечисления (имя класса).
// Поскольку final, мы не можем создавать дочерние перечисления.
enum Directions {
    EAST,
    WEST,
    NORTH,
    SOUTH
}
