import java.io.*;
import java.util.*;

public class linkedhashset{
    public static void main(String args[])throws IOException{
        Set <String> s = new LinkedHashSet <String>();
        Scanner sc = new Scanner(System.in);
        String el;
        int ch;
        do{
            System.out.println("1.Add\n2.Remove\n3.Display\n4.Search\n5.Exit\nEnter your choice: ");
            ch = sc.nextInt();
            switch(ch){
                case 1:
                    System.out.println("Enter the element to be added: ");
                    el = sc.next();
                    s.add(el);
                    break;
                case 2:
                    System.out.println("Enter the element to be removed: ");
                    el = sc.next();
                    s.remove(el);
                    System.out.println(s);
                    break;
                case 3:
                    System.out.println(s);
                    break;
                case 4:
                    System.out.println("Enter the element: ");
                    el = sc.next();
                    boolean contains = s.contains(el);
                    System.out.println(contains);
                    break;
                case 5:
                    System.out.println("Exiting....");
                    break;
                default:
                    System.out.println("Invalid choice!!!");
                    break;
            }
        }while(ch!=5);
    }
}