package Lab02;

/**
 *
 * @author mikel.adams
 */
public class Square extends Rectangle {

    public double Side;

    public Square(double s) {
        super(s, s);
        Side = s;
        System.out.println("New Square : " + Side);
    }
    
        @Override
    public String toString() {
        String tostring = "Square of " + Side;
        return tostring;
    }
}
