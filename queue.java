import java.io.*;
import java.util.*;

public class queue{
    public static void main(String args[])throws IOException{
        PriorityQueue<String> pq = new PriorityQueue<String>();
        Scanner sc = new Scanner(System.in);
        String el;
        int ch;
        do{
            System.out.println("1.Add\n2.Remove\n3.Display\n4.Head\n5.Poll\n\n6.size\n0.Exit\nEnter your choice: ");
            ch = sc.nextInt();
            switch(ch){
                case 1:
                    System.out.println("Enter the element: ");
                    el = sc.next();
                    pq.add(el);
                    break;
                case 2:
                    pq.remove();
                    System.out.println(pq);
                    break;
                case 3:
                    System.out.println(pq);
                    break;
                case 4:
                    System.out.println("The head or top element is: "+pq.peek());
                    break;
                case 5: 
                    System.out.println("After poll: "+pq.poll());
                    System.out.println(pq);
                    System.out.println();
                    break;
                case 6:
                    System.out.println(pq.size());
                    break;
                case 0:
                    System.out.println("Exiting....");
                    break;
                default:
                    System.out.println("Invalid choice!!!");
                    break;
            }
        }while(ch!=0);
    }
}