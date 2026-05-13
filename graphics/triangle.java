package graphics;

public class triangle implements shape{
    float b,h,l;
    public triangle(float h,float b,float l){
        this.h = h;
        this.b = b;
        this.l = l;
    }
    public void area(){
        System.out.println("Area of triangle is: "+String.format("%.2f",(0.5*b*h)));
    }
    public void perimeter(){
        System.out.println("Perimeter of triangle is: "+String.format("%.2f",(l+b+h)));
    }
}
