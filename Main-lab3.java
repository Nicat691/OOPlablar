import java.util.Scanner;

public class Main {
    final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int maxNumber = 0;
        for (int i=0; i<10; i++){
            int num = scanner.nextInt();
            if (i==0) maxNumber = num;
            maxNumber = Math.max(num, maxNumber);
        }

        System.out.println("Max number is: " + maxNumber);
    }
}