import java.io.*;
import java.util.*;

public class oddeven{
    public static void main(String args[])throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String odd,even,f1;
        System.out.println("Enter the filename to be read from: ");
        f1 = reader.readLine();
        System.out.println("Enter the filename to which even numbers are to be write: ");
        even = reader.readLine();
        System.out.println("Enter the filename to which odd numbers are to be write: ");
        odd = reader.readLine();
        BufferedReader br = new BufferedReader(new FileReader((f1)));
        BufferedWriter ev = new BufferedWriter(new FileWriter((even)));
        BufferedWriter od = new BufferedWriter(new FileWriter((odd)));
        String line;
        while((line = br.readLine()) != null){
            int num = Integer.parseInt(line);
            if(num%2==0){
                ev.write(line);
                ev.newLine();
            }
            else{
                od.write(line);
                od.newLine();
            }
        }
        br.close();
        ev.close();
        od.close();
        System.out.println("File copied!!!");
    }
}