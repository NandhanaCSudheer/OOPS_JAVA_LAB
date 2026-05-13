import java.util.LinkedList;
import java.util.Scanner;

public class linkedlist {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        System.out.println("Original LinkedList: " + list);

        // Remove all elements
        list.clear();

        System.out.println("After removing all elements: " + list);

        sc.close();
    }
}