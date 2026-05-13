import java.io.*;
import java.util.*;

class username extends Exception{
    username(String msg){
        super(msg);
    }
}
class password extends Exception{
    password(String msg){
        super(msg);
    }
}
class login{
    String user,pass;
    login(String user, String pass){
        this.user = user;
        this.pass = pass;
    }
    public void check(String u,String p){
        try{
            if(user.equals(u) && pass.equals(p)){
                System.out.println("Login succesful!!!");
            }
            else if(!(user.equals(u))){
                throw new username("Username doesn't match!!!");
            }
            else{
                throw new password("Password doesn't match!!!");
            }
        }
        catch(username e){
            System.out.println(e.getMessage());
        }
        catch(password e){
            System.out.println(e.getMessage());
        }
    }
}

public class userpass{
    public static void main(String args[])throws IOException{
        String u,p,user,pass;
        int k=0,c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        u = sc.next();
        System.out.println("Enter the password: ");
        p = sc.next();
        try{
            for(int i=0;i<u.length();i++){
                char ch = u.charAt(i);
                if((ch>=65&&ch<=90) || (ch>=97&&ch<=122)){
                    continue;
                }
                else{
                    throw new username("Username should only contains alphabets!!!");
                }
            }
            if(p.length()<8){
                throw new password("Password must contain minimum of 8 characters!!!");
            }
            for(int i=0;i<p.length();i++){
                char ch = p.charAt(i);
                if(ch>=48 && ch<=57 ){
                    k = 1;
                }
                if(ch=='@' || ch == '#' || ch == '$'|| ch == '!' || ch == '&'|| ch == '*'|| ch == '%'){
                    c = 1;
                }
            }
            if(k == 0 || c == 0){
                throw new password("Password must contain atleast 1 number and special character!!!");
            }
            login l = new login(u,p);
            System.out.println("Enter the username : ");
            user = sc.next();
            System.out.println("Enter the password: ");
            pass = sc.next();
            l.check(user,pass);
        }
        catch(username e){
            System.out.println(e.getMessage());
        }
        catch(password e){
            System.out.println(e.getMessage());
        }
    }
}