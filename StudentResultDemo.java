import java.util.Scanner;

// Base class
class Student {
    String name;

    void readStudent(Scanner sc) {
        System.out.print("Enter Student Name: ");
        name = sc.nextLine();
    }

    void displayStudent() {
        System.out.println("Student Name: " + name);
    }
}

// Intermediate class
class Score extends Student {
    int academicScore;
    int sportsScore;

    void readScore(Scanner sc) {
        System.out.print("Enter Academic Score: ");
        academicScore = sc.nextInt();

        System.out.print("Enter Sports Score: ");
        sportsScore = sc.nextInt();
    }

    void displayScore() {
        System.out.println("Academic Score: " + academicScore);
        System.out.println("Sports Score: " + sportsScore);
    }
}

// Derived class
class Result extends Score {

    void displayResult() {
        System.out.println("\n----- Result -----");
        displayStudent();
        displayScore();
    }
}

// Main class
public class StudentResultDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Result r = new Result();
        r.readStudent(sc);
        r.readScore(sc);
        r.displayResult();

        sc.close();
    }
}