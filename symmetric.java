import java.io.*;
import java.util.*;
public class symmetric{
    Scanner sc = new Scanner(System.in);
    int m[][],r,c;
    int ch = 1;
    public void matrix(){
        System.out.println("Enter the no.of rows: ");
        r = sc.nextInt();
        System.out.println("Enter the no.of columns: ");
        c = sc.nextInt();
        if(r!=c){
            System.out.println("No.of rows and columns should be same");
            return;
        }
        else{
            m = new int[r][c];
            System.out.println("Enter the elements: ");
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    m[i][j] = sc.nextInt();
                }
            }
        }
    }
    public void check(){
        if (m == null) return;
        else{
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    if(m[i][j]!=m[j][i]){
                        ch = 0;
                    }
                }
            }
            if(ch == 1){
                System.out.println("The matrix is symmetric");
            }
            else{
                System.out.println("The matrix is not symmetric!!!");
            }
        }
    }
    public static void main(String args[])throws IOException{
        symmetric sm = new symmetric();
        sm.matrix();
        sm.check();
    }
}