
import java.util.Scanner;
import java.lang.Math.*;

public class Cylinder {
    
    private double radius;
    private double height;

    public Cylinder(){

        radius = height = 1.0;
        
    }
    
    public Cylinder(double radius, double height){

        this.radius = radius;
        this.height = height;

    }

    public double calcVolume(){

        double volume = Math.PI * (radius * radius) * height;

        return(volume);

    }

    public double calcArea(){

        double area = 2 * Math.PI * radius * (radius + height);
        return(area);

    }

    public static void main(String[] args){

        Cylinder c = new Cylinder(3.0, 7.0);
        System.out.println("Surface Area = " + String.format("%.2f", c.calcArea()));
        System.out.println("Volume = " + String.format("%.2f", c.calcVolume()));
     
        
    }
   
}
