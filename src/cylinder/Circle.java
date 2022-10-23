package cylinder;

public class Circle {
    double radius = 0;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {

    }

    public double getRadius() {
        if (radius < 0)
            radius = 0;
            return radius;
        }


    public double getArea() {
        double area = (radius * radius * Math.PI);
        return area;
    }

}