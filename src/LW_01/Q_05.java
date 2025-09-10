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
        double ri = 4;  // inner radius
        double ro = 7;  // outer radius

        Circle inner = new Circle(ri);
        Circle outer = new Circle(ro);

        double shadedArea = outer.computeArea() - inner.computeArea();

        System.out.println("Shaded Area = " + shadedArea);
    }
}

