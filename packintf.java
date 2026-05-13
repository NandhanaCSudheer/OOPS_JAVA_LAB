import java.io.*;
import java.util.*;
import graphics.*;

public class packintf{
    public static void main(String args[])throws IOException{
        float s,l,w,d;
        double r,h,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        r = sc.nextDouble();
        graphics.circle c = new graphics.circle(r);
        c.area();
        c.perimeter();
        System.out.println("Enter the size of square: ");
        s = sc.nextFloat();
        graphics.square sq = new graphics.square(s);
        sq.area();
        sq.perimeter();
        System.out.println("Enter the length of rectangle: ");
        b = sc.nextDouble();
        System.out.println("Enter the breadth of rectangle: ");
        h = sc.nextDouble();
        graphics.rectangle rec = new graphics.rectangle(b,h);
        rec.area();
        rec.perimeter();
        System.out.println("Enter the length of triangle: ");
        l = sc.nextFloat();
        System.out.println("Enter the base of triangle: ");
        w = sc.nextFloat();
        System.out.println("Enter the height of triangle: ");
        d = sc.nextFloat();
        graphics.triangle tri = new graphics.triangle(d,w,l);
        tri.area();
        tri.perimeter();
    }
}