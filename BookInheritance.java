import java.util.Scanner;

// Base class
class Publisher {
    String publisherName;

    void readPublisher(Scanner sc) {
        System.out.print("Enter Publisher Name: ");
        publisherName = sc.nextLine();
    }

    void displayPublisher() {
        System.out.println("Publisher Name: " + publisherName);
    }
}

// Derived class
class Book extends Publisher {
    String title;
    double price;

    void readBook(Scanner sc) {
        System.out.print("Enter Book Title: ");
        title = sc.nextLine();

        System.out.print("Enter Book Price: ");
        price = sc.nextDouble();
        sc.nextLine(); // consume newline
    }

    void displayBook() {
        System.out.println("Book Title: " + title);
        System.out.println("Book Price: " + price);
    }
}

// Derived class of Book
class Literature extends Book {
    void display() {
        System.out.println("\n--- Literature Book Details ---");
        displayPublisher();
        displayBook();
    }
}

// Derived class of Book
class Fiction extends Book {
    void display() {
        System.out.println("\n--- Fiction Book Details ---");
        displayPublisher();
        displayBook();
    }
}

// Main class
public class BookInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Book Category:");
        System.out.println("1. Literature");
        System.out.println("2. Fiction");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        if (choice == 1) {
            Literature l = new Literature();
            l.readPublisher(sc);
            l.readBook(sc);
            l.display();
        } else if (choice == 2) {
            Fiction f = new Fiction();
            f.readPublisher(sc);
            f.readBook(sc);
            f.display();
        } else {
            System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}