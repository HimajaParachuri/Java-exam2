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
public class Triangle extends GeometricObject{
    
    
    private double s1, s2, s3;

  
    public Triangle(double s1, double s2, double s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    
    public Triangle(double s1, double s2, double s3, String color, boolean filled) {
        super(color, filled);
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    
    
    public double getS1() {
        return s1;
    }

    public void setS1(double s1) {
        this.s1 = s1;
    }

    public double getS2() {
        return s2;
    }

    public void setS2(double s2) {
        this.s2 = s2;
    }

    public double getS3() {
        return s3;
    }

    public void setS3(double s3) {
        this.s3 = s3;
    }

    
    public double getArea(){
        double s = (s1+s2+s3)/2;
        double res = s*(s-s1)*(s-s2)*(s-s3);
        double area=Math.sqrt(res);
        return area;
    }
    
     
    public double getPerimeter(){
        double perimiter = s1+s2+s3;
        return perimiter;
    }

    
    @Override
    public String toString() {
        return "\nArea of the Triangle: " + getArea() + "\nPerimiter of the Triangle: " +getPerimeter()
                +"\nColor: " + getColor() + "\nIsFilled: " + isFilled();
    }    

    
}
