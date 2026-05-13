import java.io.*;
import java.util.*;

class numbers extends Exception{
    numbers(String msg){
        super(msg);
    }
}
class negnum{
    int arr[],k;
    public void check(int n){
        try{
            Scanner s = new Scanner(System.in);
            arr = new int[n];
            System.out.println("Enter the elements: ");
            for(int i=0;i<n;i++){
                k = s.nextInt();
                if(k<0){
                    throw new numbers("Element should be a positive number!!!");
                }
                else{
                    arr[i] = k;
                }
            }
            System.out.println("The array is: ");
            for(int i=0;i<n;i++){
                System.out.println(arr[i]);
            }
        }
        catch(numbers e){
            System.out.println(e.getMessage());
        }
    }
}

public class negativenumbers{
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner(System.in);
        int n;
        negnum ng = new negnum();
        System.out.println("Enter the no.of elements: ");
        n = sc.nextInt();
        ng.check(n);
    }
}