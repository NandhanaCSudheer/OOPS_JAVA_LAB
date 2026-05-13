import java.io.*;
import java.util.*;

interface shape{
    public void area();
    public void perimeter();
}

class circle implements shape{
    double r;
    circle(double r){
        this.r = r;
    }
    public void area(){
        System.out.println("Area of circle is: "+String.format("%.2f",(3.14*r*r)));
    }
    public void perimeter(){
        System.out.println("Perimeter of circle is: "+String.format("%.2f",(2*3.14*r)));
    }
}
class rectangle implements shape{
    double l, b;
    rectangle(double l,double b){
        this.l = l;
        this.b = b;
    }
    public void area(){
        System.out.println("Area of rectangle is: "+String.format("%.2f",(l*b)));
    }
    public void perimeter(){
        System.out.println("Perimeter of rectangle is: "+String.format("%.2f",(2*(l+b))));
    }
}

public class intf{
    public static void main(String args[])throws IOException{
        double r,l,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        r = sc.nextDouble();
        circle c = new circle(r);
        System.out.println("Enter the length of rectangle: ");
        l = sc.nextDouble();
        System.out.println("Enter the breadth of rectangle: ");
        b = sc.nextDouble();
        rectangle rec = new rectangle(l,b);
        c.area();
        c.perimeter();
        rec.area();
        rec.perimeter();
    }
}