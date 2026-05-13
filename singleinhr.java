import java.io.*;
import java.util.*;

class employee{
    int empid;
    String name,addr;
    float salary;
    Scanner scc = new Scanner(System.in);
    employee(){
        System.out.println("Enter the employee id: ");
        empid = scc.nextInt();
        System.out.println("Enter the employee name: ");
        name = scc.next();
        System.out.println("Enter the employee salary: ");
        salary = scc.nextFloat();
        System.out.println("Enter the employee address: ");
        addr = scc.next();
    }
}
class teacher extends employee{
    String dept,sub[];
    int no;
    Scanner s = new Scanner(System.in);
    teacher(){
        super();
        System.out.println("Enter department name: ");
        dept = s.next();
        System.out.println("Enter the no.of subjects taught: ");
        no = s.nextInt();
        sub = new String[no];
        System.out.println("Enter the subjects taught: ");
        for(int i=0;i<no;i++){
            sub[i] = s.next();
        }
    }
    public void display(int n){
        System.out.println("The details of "+(n+1)+" student is: ");
        System.out.println("The employee id: "+empid);
        System.out.println("The employee name: "+name);
        System.out.println("The employee salary: "+salary);
        System.out.println("The employee address: "+addr);
        System.out.println("Department name: "+dept);
        System.out.println("The subjects taught: ");
        for(int i=0;i<no;i++){
            System.out.println(sub[i]);
        }
    }
}

public class singleinhr{
    public static void main(String args[])throws IOException{
        teacher tr[];
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of teachers: ");
        n = sc.nextInt();
        tr = new teacher[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter details of "+(i+1)+ " employee ");
            tr[i] = new teacher();
        }
        System.out.println();
        System.out.println("The details are: ");
        for(int i=0;i<n;i++){
            tr[i].display(i);
        }
    }
}