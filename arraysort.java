import java.io.*;
import java.util.*;

class stringsort{
    String s[];
    Scanner scc = new Scanner(System.in);
    stringsort(int n){
        s = new String[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            s[i] = scc.next();
        }
    }
    public void sorting(){
        Arrays.sort(s);
    }
    public void display(int n){
        for(int i=0;i<n;i++){
            System.out.println(s[i]);
        }
    }

}
public class arraysort{
    public static void main(String args[])throws IOException{
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the string array: ");
        n = sc.nextInt();
        stringsort s = new stringsort(n);
        System.out.println("Before sorting: ");
        s.display(n);
        s.sorting();
        System.out.println("After sorting: ");
        s.display(n);
    }
}
