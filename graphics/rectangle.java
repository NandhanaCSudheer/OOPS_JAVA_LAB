package graphics;

public class rectangle implements shape{
    double l, b;
    public rectangle(double l,double b){
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
