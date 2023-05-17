public class SinExample {

    public static double sin(double x) {
        if (Math.abs(x) < 0.0001) {
            return x;
        } else {
            double t = tan(x / 3);
            return sin(x / 3) * ((3 - t * t) / (1 + t * t));
        }
    }

    public static double cos(double x) {
        return 1 - sin(x / 2);
    }

    public static double tan(double x) {
        return sin(x) / cos(x);
    }

    public static void main(String[] args) {
        double angle = Math.PI / 4; // Angle in radians
        double sinResult = sin(angle);
        System.out.println("sin(" + angle + ") = " + sinResult);
    }
}
