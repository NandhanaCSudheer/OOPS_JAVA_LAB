import java.io.*;

class A{
    void display(){
        System.out.println("Parent: A");
    }
}

class B extends A{
    void display(){
        super.display();  //invokes parent's display method

        System.out.println("First child: B");
    }
}

class C extends A{
    void display(){
        
        System.out.println("Second child: C");
    }
}

public class overriding{
    public static void main(String args[]) throws IOException{
        A ob;
        ob=new A();
        ob.display();
        ob=new B();
        ob.display();
        ob=new C();
        ob.display();

        /*
            A ob = new A();
            ob.display();
            B ob1 = new B();
            ob1.display();
            C ob2 = new C();
            ob2.display();
        */
    }
}