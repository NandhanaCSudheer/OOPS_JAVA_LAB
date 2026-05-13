import java.io.*;
import java.util.*;

class employee{
    int eno;
    String ename;
    float salary;
    employee(int eno,String ename,float salary){
        this.eno = eno;
        this.ename = ename;
        this.salary = salary;
    }
    public static void main(String args[])throws IOException{
        employee e[];
        int n,eno,key;
        String ename;
        float salary;
        System.out.println("Enter the no.of employees: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        e = new employee[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the details of "+(i+1)+" employee: ");
            System.out.println("Enter the employee number: ");
            eno = sc.nextInt();
            System.out.println("Enter the employee name: ");
            ename = sc.next();
            System.out.println("Enter the salary: ");
            salary = sc.nextFloat();
            e[i] = new employee(eno,ename,salary);
        }
        System.out.println("Enter the eno of employee whose details is to be found: ");
        key = sc.nextInt();
        for(int i=0;i<n;i++){
            if(e[i].eno == key){
                System.out.println("The employee number: "+e[i].eno);
                System.out.println("The employee name: "+e[i].ename);
                System.out.println("The salary: "+e[i].salary);
            }
        }
    }
}