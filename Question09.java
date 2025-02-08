import java.util.Scanner;

public class Question09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Enter the number to search for: ");
        int searchNumber = scanner.nextInt();

      
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (numbers[i] == searchNumber) {
                System.out.println("Number found at index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Number not found.");
        }

        scanner.close();
    }
}

