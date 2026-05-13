import java.io.*;
import java.util.*;

public class copyfile{
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner(System.in);
        String f1,f2,text;
        System.out.println("Enter the filename to be read from: ");
        f1 = sc.nextLine();
        System.out.println("Enter the filename to be write to: ");
        f2 = sc.nextLine();
        System.out.println("Enter the contents: ");
        text = sc.nextLine();
        FileOutputStream fouts = new FileOutputStream(f1);
        FileInputStream fin = new FileInputStream(f1);
        FileOutputStream fout = new FileOutputStream(f2);

        //overwrites
        
        fouts.write(text.getBytes());
        byte b[] = new byte[fin.available()];
        fin.read(b);
        fout.write(b);
        fin.close();
        fout.close();
        fouts.close();
        System.out.println("File copied!!!");
    }
}