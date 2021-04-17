/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6;

/**
 *
 * @author HIMAJA PARACHURI
 */
public abstract class GeometricObject {
private String color;
    private boolean filled;

   
    public GeometricObject() {
    }

    public GeometricObject(String color, boolean filled) {

        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

      /**
     * Abstract method getArea
     */
    public abstract double getArea();

    /**
     * Abstract method getPerimeter
     */
    public abstract double getPerimeter();

}
