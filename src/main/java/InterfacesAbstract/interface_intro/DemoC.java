package InterfacesAbstract.interface_intro;


public class DemoC {

    private static String name;
    static double height;
    static double width;
    static double depth;
    static double time;
    static double speed;
    static double volume;
    static double distance;

    public static void main(String[] args) {
        initVars();
        handleData();
        showData();
    }

    // Получение конкретных значений
    private static void initVars() {
        name = "Alfa";
        height = 15;
        width = 36.5;
        depth = 125.8;
        time = 2.5;
        speed = 80.3;
    }

    // Передача на обработку конкретных значений
    private static void handleData() {
        RobotB robotB = new RobotB();
        volume = robotB.calcVolume(height, width, depth);
        distance = robotB.calcDistance(time, speed);
    }

    // Представление выходных данных
    private static void showData() {
        System.out.println("Robot: " + name +
                "\nVolume, cc: " + volume +
                "\novercame " + distance + " m for " + time + " hours");
    }
}
