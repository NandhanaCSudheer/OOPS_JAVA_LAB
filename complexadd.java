import java.io.*;
import java.util.*;

class complex{
    int r,c;
    Scanner sc = new Scanner(System.in);
    complex(int n){
        System.out.println("Enter the real part: ");
        r = sc.nextInt();
        System.out.println("Enter the imaginary part: ");
        c = sc.nextInt();
        System.out.println("The complex number is: "+r+" + "+c+" i");
    }
    public static void add(complex a,complex b){
        System.out.println("The complex number after addition is: "+(a.r+b.r)+" + "+(a.c+b.c)+" i");
    }
}
public class complexadd{
    public static void main(String args[])throws IOException{
        complex c1 = new complex(1);
        complex c2 = new complex(2);
        complex.add(c1,c2);
    }
}