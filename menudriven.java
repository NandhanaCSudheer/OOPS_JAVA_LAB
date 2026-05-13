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

public class menudriven{
    public static void main(String args[])throws IOException{
        double r,l,b;
        int ch;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("1.Area of circle\n2.Perimeter of circle\n3.Area of rectangle\n4.Perimeter of rectangle\n5.Exit\nEnter your choice:\n");
            ch = sc.nextInt();
            switch(ch){
                case 1:
                    System.out.println("Enter the radius of circle: ");
                    r = sc.nextDouble();
                    circle c = new circle(r);
                    c.area();
                    break;
                case 2:
                    System.out.println("Enter the radius of circle: ");
                    r = sc.nextDouble();
                    circle cc = new circle(r);
                    cc.perimeter();
                    break;
                case 3:
                    System.out.println("Enter the length of rectangle: ");
                    l = sc.nextDouble();
                    System.out.println("Enter the breadth of rectangle: ");
                    b = sc.nextDouble();
                    rectangle rec = new rectangle(l,b);
                    rec.area();
                    break;
                case 4:
                    System.out.println("Enter the length of rectangle: ");
                    l = sc.nextDouble();
                    System.out.println("Enter the breadth of rectangle: ");
                    b = sc.nextDouble();
                    rectangle rect = new rectangle(l,b);
                    rect.perimeter();
                    break;
                case 5:
                    System.out.println("Exiting.....");
                    break;
                default:
                    System.out.println("Invalid choice!!!");
            }
        }while(ch!=5);
    }
}