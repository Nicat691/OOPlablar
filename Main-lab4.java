import java.util.Scanner;

public class Main {
    final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i=0; i<10; i++){
            arr[i] = scanner.nextInt();
        }

        for (int i : arr){
            if (i % 2 == 0){
                System.out.println(i + " is even.");
            }
        }

    }
}