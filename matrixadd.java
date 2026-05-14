import java.util.*;
import java.io.*;
class matrix{
    int m1[][],m2[][],m[][],r1,c1,r2,c2;
    Scanner sc = new Scanner(System.in);
    matrix(){
        System.out.println("Enter the no.of rows of first matrix: ");
        r1 = sc.nextInt();
        System.out.println("Enter the no.of columns of first matrix: ");
        c1 = sc.nextInt();
        System.out.println("Enter the no.of rows of second matrix: ");
        r2 = sc.nextInt();
        System.out.println("Enter the no.of columns of second matrix: ");
        c2 = sc.nextInt();
        if(r1!=r2 || c1!=c2){
            System.out.println("Rows and columns should match!!!");
            return;
        }
        else{
            m1 = new int[r1][c1];
            m2 = new int[r2][c2];
            m = new int[r1][c1];
            System.out.println("Enter the elements to 1st matrix: ");
            for(int i=0;i<r1;i++){
                for(int j=0;j<c1;j++){
                    m1[i][j] = sc.nextInt();
                }
            }
            System.out.println("Enter the elements to 2nd matrix: ");
            for(int i=0;i<r2;i++){
                for(int j=0;j<c2;j++){
                    m2[i][j] = sc.nextInt();
                }
            }
        }
    }
    public void add(){
        if(m1==null && m2==null) return;
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                m[i][j] = m1[i][j]+m2[i][j];
            }
        }
        System.out.println("The first matrix is: ");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                System.out.print(m1[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("The second matrix is: ");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                System.out.print(m2[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("The matrix after addition is : ");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                System.out.print(m[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
class matrixadd{
    public static void main(String args[])throws IOException{
        matrix mat = new matrix();
        mat.add();
    }
}