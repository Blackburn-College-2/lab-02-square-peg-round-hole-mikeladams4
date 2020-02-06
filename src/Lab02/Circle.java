/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab02;

/**
 *
 * @author adams
 */
public class Circle extends Ellipse {

    public double Radius;

    public Circle(double radius) {
        super(radius, radius);
        this.Radius = radius;
        System.out.println("New Circle:");
    }
}
