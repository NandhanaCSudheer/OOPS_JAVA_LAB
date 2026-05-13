import java.io.*;
import java.util.*;

class multi extends Thread{
    int n;
    multi(int n){
        this.n = n;
    }
    public void run(){
        for(int i=0;i<n;i++){
            System.out.println("5 * "+i+" = "+5*i);
        }
    }
}
class prime extends Thread{
    int n;
    prime(int n){
        this.n = n;
    }
    public int isprime(int a){
        if(a<2){
            return 0;
        }
        for(int i=2;i<=a/2;i++){
            if(a%i==0){
                return 0;
            }
        }
        return 1;
    }
    public void run(){
        for(int i=1;i<=n;i++){
            if(isprime(i)==1){
                System.out.println("Prime: "+i);
            }
        }
    }
}

public class mulprime{
    public static void main(String args[]) throws IOException{
        int n,a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range for multiplication: ");
        n = sc.nextInt();
        System.out.println("Enter the range for prime numbers: ");
        a = sc.nextInt();
        multi m = new multi(n);
        prime p = new prime(a);
        m.start();
        p.start();
    }
}