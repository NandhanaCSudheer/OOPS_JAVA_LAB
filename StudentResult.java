import java.util.Scanner;

// Base class 1
class Student {
    int academicScore;

    void readAcademic(Scanner sc) {
        System.out.print("Enter Academic Score: ");
        academicScore = sc.nextInt();
    }

    void displayAcademic() {
        System.out.println("Academic Score: " + academicScore);
    }
}

// Base class 2
class Sport {
    int sportsScore;

    void readSports(Scanner sc) {
        System.out.print("Enter Sports Score: ");
        sportsScore = sc.nextInt();
    }

    void displaySports() {
        System.out.println("Sports Score: " + sportsScore);
    }
}

// Result class
class Result extends Student {
    Sport sport = new Sport();

    void readAll(Scanner sc) {
        readAcademic(sc);
        sport.readSports(sc);
    }

    void displayAll() {
        System.out.println("\n----- Student Result -----");
        displayAcademic();
        sport.displaySports();
    }
}

// Main class
public class StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Result r = new Result();
        r.readAll(sc);
        r.displayAll();

        sc.close();
    }
}