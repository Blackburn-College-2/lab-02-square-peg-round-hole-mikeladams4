package Lab02;

/**
 *
 * @author mikel.adams
 */
public class Rectangle {

    public double width;
    public double height;
    Measurement widthM;
    Measurement heightM;

    public Rectangle(double w, double h) {
        this.width = w;
        this.height = h;
        this.widthM = new Measurement(w, "unit(s)");
        this.heightM = new Measurement(h, "unit(s)");
        System.out.println("New Rectangle: " + width + " by " + height);

    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        double area = width * height;
        return area;
    }

    public double getPerimeter() {
        double perimeter = (width + height) * 2;
        return perimeter;
    }

    @Override
    public String toString() {
        String s = widthM.toString() + " by " + heightM.toString();
        return s;
    }

}
