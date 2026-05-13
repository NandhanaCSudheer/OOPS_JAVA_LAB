import java.io.*;
import java.util.*;

class fibonacci implements Runnable{
    int n;
    fibonacci(int n){
        this.n = n;
    }
    public void run(){
        int a = 0;
        int b= 1;
        int s;
        for(int i=0;i<n;i++){
            System.out.println("Fibonacci: "+a);
            s = a + b;
            a = b;
            b = s;
        }
    }
}
class even implements Runnable{
    int a;
    even(int a){
        this.a = a;
    }
    public void run(){
        for(int i=0;i<a;i++){
            if(i%2==0){
                System.out.println("Even number: "+i);
            }
        }
    }
}

public class fiboeven{
    public static void main(String args[])throws IOException{
        int n,a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range for fibonacci: ");
        n = sc.nextInt();
        System.out.println("Enter the range for even numbers: ");
        a = sc.nextInt();
        Thread f = new Thread(new fibonacci(n));
        Thread e = new Thread(new even(a));
        f.start();
        e.start();
    }
}