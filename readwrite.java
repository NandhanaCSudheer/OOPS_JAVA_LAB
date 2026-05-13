import java.io.*;
import java.util.*;

public class readwrite{
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner(System.in);
        String f1,text;
        System.out.println("Enter the filename to be read from: ");
        f1 = sc.nextLine();
        System.out.println("Enter the contents: ");
        text = sc.nextLine();

        /*
        To store multiple lines,
        System.out.println("Enter the no.of lines of the contents: ");
        int n = sc.nextInt();
        String text = "";
        for(int i=0;i<n;i++){
            text+=sc.nextLine()+"\n";
        }
        */
        FileOutputStream fout = new FileOutputStream(f1);
        FileInputStream fin = new FileInputStream(f1);
        
        fout.write(text.getBytes());
        byte b[] = new byte[fin.available()];
        fin.read(b);
        String contents = new String(b);
        System.out.println("The contents of the file is: ");
        System.out.println(contents);
    }
}