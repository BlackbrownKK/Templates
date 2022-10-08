package InterfacesAbstract.interface_intro;

public class RobotB implements Distance {

    double calcVolume(double height, double width, double depth) {
        return height * width * depth;
    }

    @Override
    public double calcDistance(double time, double speed) {
        return time * speed;
    }
}
