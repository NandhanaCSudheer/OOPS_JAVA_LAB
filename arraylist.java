import java.io.*;
import java.util.*;

public class arraylist{
    public static void main(String args[])throws IOException{
        ArrayList <String> list = new ArrayList<String>();
        String el;
        int ch,index;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("1.Add\n2.Size\n3.Remove by index\n4.Remove by element\n5.Search by index\n6.Search by element\n7Contains\n.8.Display\n9.Clear\n0.Exit\nEnter your choice: \n");
            ch = sc.nextInt();
            switch(ch){
                case 1:
                    System.out.println("Enter the element to be added: ");
                    el = sc.next();
                    list.add(el);
                    break;
                case 2:
                    System.out.println("The size of the list is: "+list.size());
                    break;
                case 3:
                    System.out.println("Enter the index to be deleted: ");
                    index = sc.nextInt();
                    list.remove(index);
                    break;
                case 4:
                    System.out.println("Enter the element to be deleted: ");
                    el = sc.next();
                    list.remove(el);
                    break;
                case 5:
                    System.out.println("Enter the index of the element to be searched: ");
                    index = sc.nextInt();
                    System.out.println("The element is: "+list.get(index));
                    break;
                case 6:
                    System.out.println("Enter the element to be searched: ");
                    el = sc.next();
                    System.out.println("The index is: "+list.indexOf(el));
                    break;
                case 7:
                    System.out.println("Enter the element to be searched: ");
                    el = sc.next();
                    boolean contains = list.contains(el);
                    System.out.println(contains);
                    break;
                case 8:
                    System.out.println(list);
                    break;
                case 9:
                    list.clear();
                    System.out.println(list);
                    break;
                case 0:
                    System.out.println("Exiting.....");
                    break;
                default:
                    System.out.println("Invalid choice!!!");
                    break;
            }
        }while(ch!=0);
    }
}