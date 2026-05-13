import java.io.*;
import java.util.*;

class person{
    String name,gender,addr;
    int age;
    Scanner s = new Scanner(System.in);
    person(){
        System.out.println("Enter the name: ");
        name = s.next();
        System.out.println("Enter the gender: ");
        gender = s.next();
        System.out.println("Enter the address: ");
        addr = s.next();
        System.out.println("Enter the age: ");
        age = s.nextInt();
    }
    public void display(){
        System.out.println("The name: "+name);
        System.out.println("The gender: "+gender);
        System.out.println("The address: "+addr);
        System.out.println("The age: "+age);
    }
}
class employee extends person{
    int empid;
    String cname,quali;
    float salary;
    Scanner scc = new Scanner(System.in);
    employee(){
        super();
        System.out.println("Enter the company name: ");
        cname = scc.next();
        System.out.println("Enter the qualification: ");
        quali = scc.next();
        System.out.println("Enter the salary: ");
        salary = scc.nextFloat();
    }
    public void display(){
        super.display();
        System.out.println("The company name: "+cname);
        System.out.println("The qualification: "+quali);
        System.out.println("The Salary: "+salary);
    }
}
class teacher extends employee{
    int tid;
    String dept,sub;
    Scanner sccc = new Scanner(System.in);
    teacher(){
        super();
        System.out.println("Enter the teacher id: ");
        tid = sccc.nextInt();
        System.out.println("Enter the department: ");
        dept = sccc.next();
        System.out.println("Enter the subject: ");
        sub = sccc.next();
    }
    public void display(){
        super.display();
        System.out.println("The teacher id: "+tid);
        System.out.println("The department: "+dept);
        System.out.println("The subject: "+sub);
    }
}

public class multilevel{
    public static void main(String args[])throws IOException{
        teacher tr[];
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of teachers: ");
        n = sc.nextInt();
        tr = new teacher[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the details of "+(i+1)+"person: ");
            tr[i] = new teacher();
            System.out.println();
        }
        for(int i=0;i<n;i++){
            System.out.println("The details of "+(i+1)+" person is: ");
            tr[i].display();
            System.out.println();
        }
    }
}