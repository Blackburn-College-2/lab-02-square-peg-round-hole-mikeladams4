package Lab02;

/**
 *
 * @author mikel.adams
 */
public class Square extends Rectangle {

    public double side;
    
    public Square(double s) {
        super(s, s);
        this.side = s;
        System.out.println("New Square : " + side);
    }
    
        @Override
    public String toString() {
        String s = widthM.toString() + " by " + heightM.toString();
        return s;
    }
}
