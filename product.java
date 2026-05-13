import java.io.*;
import java.util.*;

interface calculatetotal{
    public void calculate();
}

class prod{
    int prodid,quantity,unitprice;
    static int total;
    String name;
    prod(Scanner sc){
        System.out.println("Enter the product id: ");
        prodid = sc.nextInt();
        System.out.println("Enter the product name: ");
        name = sc.next();
        System.out.println("Enter the product quantity: ");
        quantity = sc.nextInt();
        System.out.println("Enter the product unit price: ");
        unitprice = sc.nextInt();
    }
    public void calculate(){
        total = total + quantity * unitprice;
    }
    public static void bill(){
        System.out.println("The total collection for today is: "+total);
    }
}

public class product{
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner(System.in);
        int orderno,n;
        prod p[];
        System.out.println("Enter the orderno: ");
        orderno = sc.nextInt();
        System.out.println("Enter the no.of products: ");
        n = sc.nextInt();
        p = new prod[n];
        for(int i=0;i<n;i++){
            p[i] =  new prod(sc);
        }
        for(int i=0;i<n;i++){
            p[i].calculate();
        }
        System.out.println("Order no: "+orderno);
        System.out.println("Product Id\t Name\t Quantity\t unit price\t Total\n");
        for(int i=0;i<n;i++){
            System.out.println(p[i].prodid+"\t"+p[i].name+"\t"+p[i].quantity+"\t"+p[i].unitprice+"\t"+(p[i].quantity * p[i].unitprice));
            prod.bill();
        }
    }
}