import java.io.*;
import java.util.*;

class product{
    int pcode,price;
    String pname;
    public product(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pcode: ");
        pcode = sc.nextInt();
        System.out.println("Enter pname: ");
        pname = sc.next();
        System.out.println("Enter price: ");
        price = sc.nextInt();
    }
    public void lowest(product p2,product p3){
        if (price<p2.price && price<p3.price){
            System.out.println("The lowest price is of product 1: "+price);
            System.out.println("The product code is: "+pcode);
            System.out.println("The product name is: "+pname);
        }
        else if(p2.price<p3.price){
            System.out.println("The lowest price is of product 2: "+p2.price);
            System.out.println("The product code is: "+p2.pcode);
            System.out.println("The product name is: "+p2.pname);
        }
        else{
            System.out.println("The lowest price is of product 3: "+p3.price);
            System.out.println("The product code is: "+p3.pcode);
            System.out.println("The product name is: "+p3.pname);
        }
    }
}
public class lowestprice{
    public static void main(String args[])throws IOException{
        System.out.println("Enter details of 1st product: ");
        product p1 = new product();
        System.out.println("Enter details of 2nd product: ");
        product p2 = new product();
        System.out.println("Enter details of 3rd product: ");
        product p3 = new product();
        p1.lowest(p2,p3);
    }
}