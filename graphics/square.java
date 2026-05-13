package graphics;

public class square implements shape{
    float s;
    public square(float s){
        this.s = s;
    }
    public void area(){
        System.out.println("Area of square is: "+String.format("%.2f",(s*s)));
    }
    public void perimeter(){
        System.out.println("Perimeter of square is: "+String.format("%.2f",(4*s)));
    }
}