import java.io.*;
import java.util.*;
class CPU{
    int price;
    CPU(int price){
        this.price = price;
    }
    class Processor{
        int cores;
        String manufacturer;
        Processor(int cores,String manufacturer){
            this.cores = cores;
            this.manufacturer = manufacturer;
        }
        void display(){
                System.out.println("The price is: "+price);
                System.out.println("The no.of cores = "+cores);
                System.out.println("The manufacturer is: "+manufacturer);
        }
    }
        static class RAM{
            int memory;
            String manufacturer;
            RAM(int memory,String manufacturer){
                this.memory = memory;
                this.manufacturer = manufacturer;
            }
            void display(){
                System.out.println("The memory power is: "+memory);
                System.out.println("The manufacturer is: "+manufacturer);
            }
        }
    }

public class innerclass{
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner(System.in);
        int mem,cores;
        String mp,mr;
        System.out.println("Enter the memory power: ");
        mem = sc.nextInt();
        System.out.println("Enter the no.of cores: ");
        cores = sc.nextInt();
        System.out.println("Enter the manufacturer of Processor: ");
        mp = sc.next();
        System.out.println("Enter the manufacturer of RAM: ");
        mr = sc.next();
        CPU c = new CPU(mem * cores);
        CPU.Processor p = c.new Processor(cores,mp);
        CPU.RAM r = new CPU.RAM(mem,mr);
        p.display();
        r.display();
    }
}