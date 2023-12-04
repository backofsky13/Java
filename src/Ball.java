import java.lang.*;
public class Ball {
    private String name;
    private double radius;
    public Ball(String n, double r) {
        name = n;
        radius = r;
    }
    public Ball(String n){
        name = n;
        radius = 0;
    }
    public Ball(){
        name = "Red";
        radius = 0;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public void setName (String name){
        this.name = name;
    }
    public String getName(String name) {
        return name;
    }
    public double getRadius(){
        return radius;
    }
    public String toString() {
        return this.name + ", radius " + this.radius;
    }
    public void intoRadiusBall(){
        System.out.println(name+"'s radius in ball is " + radius + " sm");
    }
}