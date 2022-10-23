package cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getHeight() {
        if (height > 0) {
            return height;
        } else {
            height = 0;
            return height;
        }
    }

    public double getVolume() {
        double area = getArea() * getHeight();
        return area;
    }


}
