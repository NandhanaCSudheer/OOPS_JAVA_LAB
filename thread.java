import java.io.*;
import java.util.*;

class perfect extends Thread{
    int n;
    perfect(int n){
        this.n = n;
    }
    public void run(){
        for(int i=2;i<n;i++){
            int sum = 0;
            for(int j=1;j<i;j++){
                if(i%j==0){
                    sum+=j;
                }
            }
            if(sum == i){
                    System.out.println("The perfect Number: "+i);
                }
        }
    }
}

class armstrong extends Thread{
    int n;
    armstrong(int n){
        this.n = n;
    }
    public void run(){
        for(int i=1;i<n;i++){
            int b,temp,result = 0;
            b = i;
            temp = i;
            while(temp != 0){
                int digit = temp % 10;
                result = result + digit*digit*digit;
                temp = temp/10;
            }
            if (b == result){
                System.out.println("Armstrong number: "+b);
            }
        }
    }
}

public class thread{
    public static void main(String args[])throws IOException{
        int a,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range for perfect numbers: ");
        a = sc.nextInt();
        System.out.println("Enter the range for armstrong numbers: ");
        n = sc.nextInt();
        perfect p = new perfect(a);
        armstrong arm = new armstrong(n);
        p.start();
        arm.start();
    }
}