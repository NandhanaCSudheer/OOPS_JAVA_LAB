import java.io.*;
import java.util.*;

class Area{
    public void area(double r){
        System.out.println("Area of circle is: "+String.format("%.2f",(3.14*r*r)));
    }
    public void area(float s){
        System.out.println("Area of square is: "+String.format("%.2f",(s*s)));
    }
    public void area(double h,double b){
        System.out.println("Area of triangle is: "+String.format("%.2f",(0.5*b*h)));
    }
    public void area(float l,float w){
        System.out.println("Area of rectangle is: "+String.format("%.2f",(l*w)));
    }
}
public class shape{
    public static void main(String args[])throws IOException{
        float s,l,w;
        double r,h,b;
        Scanner sc = new Scanner(System.in);
        Area ar = new Area();
        System.out.println("Enter the radius of circle: ");
        r = sc.nextDouble();
        ar.area(r);
        System.out.println("Enter the size of square: ");
        s = sc.nextFloat();
        ar.area(s);
        System.out.println("Enter the base of triangle: ");
        b = sc.nextDouble();
        System.out.println("Enter the height of triangle: ");
        h = sc.nextDouble();
        ar.area(h,b);
        System.out.println("Enter the length of rectangle: ");
        l = sc.nextFloat();
        System.out.println("Enter the width of rectangle: ");
        w = sc.nextFloat();
        ar.area(l,w);
    }
}