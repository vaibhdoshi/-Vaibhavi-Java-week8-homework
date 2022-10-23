package poolarea;

public class Rectangle {
    double width;
    double length;

    public Rectangle(double width, double length) {
        this.length = length;
        this.width = width;
        if (width < 0)
            width = 0;
        if (length < 0)
            length = 0;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        double area = (width * length);
        return area;
    }
}
