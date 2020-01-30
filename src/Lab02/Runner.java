package Lab02;

/**
 *
 * @author paul.kline
 */
public class Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(3,5);
        Rectangle rectangle2 = new Rectangle(5,8);
        Square square1 = new Square(4);
        Square square2 = new Square(6);
        System.out.println(rectangle1.toString());
        System.out.println(square1.toString());
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getPerimeter());
        System.out.println(square1.getArea());
    }
    
}
