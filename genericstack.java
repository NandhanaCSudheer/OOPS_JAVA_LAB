import java.io.*;
import java.util.*;

class stack <T>{
    ArrayList <T> A;
    int top = -1;
    int size ;
    stack(int n){
        this.size = n;
        this.A = new ArrayList<T>(size);
    }
    public void push(T v){
        if((top+1)==size){
            System.out.println("The stack overflow!!!");
        }
        else{
            top = top + 1;
            if(A.size()<top){
                A.set(top,v);
            }
            else{
                A.add(v);
            }
        }
    }
    T top(){
        if(top == -1){
            System.out.println("Stack underflow!!!");
            return null;
        }
        else{
            return A.get(top);
        }
    }
    public void pop(){
        if(top == -1){
            System.out.println("Stack underflow!!!");
            return;
        }
        else{
            top--;
        }
    }
    boolean empty(){
        return top == -1;
    }
    public String toString(){
        String Ans = " ";
        for(int i=0;i<top;i++){
            Ans+=String.valueOf(A.get(i))+"->";
        }
        Ans+=String.valueOf(A.get(top));
        return Ans;
    }
}

public class genericstack{
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the stack: ");
        n = sc.nextInt();
        stack <Integer> s = new stack<>(n);
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            int v = sc.nextInt();
            s.push(v);
        }
        System.out.println("The stack is: "+s);
        s.pop();
        System.out.println("the stack after pop is: "+s);
    }
}