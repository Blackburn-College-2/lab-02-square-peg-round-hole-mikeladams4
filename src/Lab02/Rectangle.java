package Lab02;

/**
 *
 * @author mikel.adams
 */
public class Rectangle {

    public double Width;
    public double Height;

    public Rectangle(double w, double h) {
        Width = w;
        Height = h;
        System.out.println("New Rectangle: " + Width + " by " + Height);
    }

    public double getWidth() {
        return Width;
    }

    public double getHeight() {
        return Height;
    }

    public double getArea() {
        double area = Width * Height;
        return area;
    }

    public double getPerimeter() {
        double perimeter = (Width + Height)*2;
        return perimeter;
    }

    @Override
    public String toString() {
        String tostring = "Rectangle of " + Width + " by " + Height;
        return tostring;
    }
}
