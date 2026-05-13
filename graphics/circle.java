package graphics;

public class circle implements shape{
    double r;
    public circle(double r){
        this.r = r;
    }
    public void area(){
        System.out.println("Area of circle is: "+String.format("%.2f",(3.14*r*r)));
    }
    public void perimeter(){
        System.out.println("Perimeter of circle is: "+String.format("%.2f",(2*3.14*r)));
    }
}