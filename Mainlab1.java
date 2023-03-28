import java.util.Scanner;

public class Main {
    final static Scanner scanner = new Scanner(System.in);

    public static void printInfo(String c, String y){
        System.out.println("My name is " + c + " and surname is " + y);
    }

    public static void main(String[] args) {
        System.out.print("Name: ");
        String c = scanner.nextLine();

        System.out.print("Surname: ");
        String y = scanner.nextLine();

        printInfo(c, y);
    }
}