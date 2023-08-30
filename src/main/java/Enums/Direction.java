package Enums;

public enum Direction {
    N(0), NE(45), E(90), SE(135), S(180), SW(225), W(270), NW(315);

    Direction(final int degrees) {
        this.degrees = degrees;
    }

    private int degrees;

    public static Direction ofDegrees(int degrees) {
        degrees = (degrees % 360 + 360) % 360;
        for (Direction direction : values()) {
            if (degrees == direction.degrees) {
                return direction;
            }
        }
        return null;
    }

    public static Direction closestToDegrees(int degrees) {
        degrees = (degrees % 360 + 360) % 360;
        Direction closestDir = null;
        int minDif = Integer.MAX_VALUE;
        for (Direction direction : values()) {
            int difference = Math.abs(degrees - direction.degrees);
            if (difference < minDif) {
                minDif = difference;
                closestDir = direction;
            }
        }

        return closestDir;
    }

    public Direction opposite() {
        int oppositeDegrees = (this.degrees + 180) % 360;

        for (Direction direction : values()) {
            if (direction.degrees == oppositeDegrees) {
                return direction;
            }
        }

        return null;
    }

    public int differenceDegreesTo(Direction direction) {
        int difference = (direction.degrees - this.degrees + 360) % 360;
        return Math.min(difference, 360 - difference);
    }
}
