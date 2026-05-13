import java.io.*;
import java.util.*;

public class subdirectory{
    public static void List(File directory){
        File f[] = directory.listFiles();
        if (f != null){
            for(File file : f){
                if(file.exists() && file.isFile()){
                    System.out.println(file.getName());
                }
                if(file.isDirectory()){
                    List(file);
                }
            }
        }
    }
    public static boolean search(File directory, String fname){
        File f[] = directory.listFiles();
        if (f == null){
            return false;
        }
            for(File file : f){
                if(file.exists() && file.isFile()){
                    if(fname.equals(file.getName())){
                        System.out.println("File found at: "+file.getAbsolutePath());
                        return true;
                    }
                }
                else if(file.isDirectory()){
                     if(search(file,fname)){
                        return true;
                     }
                }
            }
            return false;
        }
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner(System.in);
        String dirpath,fname;
        System.out.println("Enter the directory path: ");
        dirpath = sc.nextLine();
        File directory = new File(dirpath);
        if(directory.exists() && directory.isDirectory()){
            List(directory);
        }
        else{
            System.out.println("Path doesnot exists!!!");
        }
        System.out.println("Enter the filename to be searched: ");
        fname = sc.nextLine();
        boolean check = search(directory,fname);
        if(check == false){
            System.out.println("File not found!!!");
        }
    }
}