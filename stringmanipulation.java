import java.io.*;
import java.util.*;

public class stringmanipulation{
    public static void main(String args[])throws IOException{
        String s;
        int index;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        s = sc.nextLine();
        System.out.println("The string in lowercase: "+s.toLowerCase());
        System.out.println("The string in uppercase: "+s.toUpperCase());
        System.out.println("The total string length:  "+s.length());
        System.out.println("Replacing a with * "+s.replace("a","*"));
        System.out.println("After trimming: "+s.trim());
        System.out.println("Enter the index: ");
        index = sc.nextInt();
        System.out.println("The element at the given index is: "+s.charAt(index));
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse = reverse + s.charAt(i);
        }
        System.out.println("Reversed string: " + reverse);

        if (s.equals(reverse)) {
            System.out.println("The string is a Palindrome");
        } else {
            System.out.println("The string is NOT a Palindrome");
        }

        System.out.println("Enter the starting index of substring: ");
        int start = sc.nextInt();
        System.out.println("Enter the ending index of substring: ");
        int end = sc.nextInt();
        System.out.println("The substring is: "+s.substring(start));
        System.out.println("The substring is: "+s.substring(start,end));
    }
}