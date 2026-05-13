import java.io.*;
import java.util.*;
class array{
    int n,found = 0;
    int ar[];
    Scanner scc = new Scanner(System.in);
    array(int n){
        this.n = n;
        ar = new int[n];
    }
    public void create(){
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            ar[i] = scc.nextInt();
        }
    }
    public void search(int el){
        for(int i=0;i<n;i++){
            if(el == ar[i]){
                System.out.println("Element found at index " +(i+1));
                found = 1;
            }
        }
        if(found == 0)
        {
            System.out.println("Element not found!!!");
        }
    }
}
public class searchelement{
    public static void main(String args[])throws IOException{
        int n,el;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        n = sc.nextInt();
        array arr = new array(n);
        arr.create();
        System.out.println("Enter the element to be searched: ");
        el = sc.nextInt();
        arr.search(el);
    }
}