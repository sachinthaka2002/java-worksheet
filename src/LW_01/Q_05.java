package LW_01;

class Circle {
    double radius;

    Circle(double r) {
        radius = r;
    }
    double computeArea() {
        return Math.PI * radius * radius;
    }
}

public class Q_05 {
    public static void main(String[] args) {
        double r1 = 4;  // inner radius
        double r2 = 7;  // outer radius

        Circle inner = new Circle(r1);
        Circle outer = new Circle(r2);

        double shadedArea = outer.computeArea() - inner.computeArea();

        System.out.println("Shaded Area = " + shadedArea);
    }
}

