package javaBasic.Task10;

public class circle {
    private double radius;

    // constructor with no arguments
    public circle() {
        this.radius = 0;
    } 
    // constructor with two arguments
    public circle(double radius) {
        this.radius = radius;
    }
    // calculation
    public double calculateCircumference(){
        return 2 * Math.PI * radius;
    }
    

    public static void main(String[] args) {
        circle c1 = new circle();

        System.out.println("circumference of circle1: " +c1.calculateCircumference());

        circle c2 = new circle(4);

        System.out.println("circumference of circle2: " +c2.calculateCircumference());
    }
    
}
