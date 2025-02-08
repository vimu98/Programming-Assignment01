import java.util.Scanner;

public class Question05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] accountBalances = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter initial balance for customer " + (i + 1) + ": ");
            accountBalances[i] = scanner.nextDouble();
        }

        boolean exit = false;

        while (!exit) {
            for (int i = 0; i < 5; i++) {
                System.out.println("\nCustomer " + (i + 1));
                System.out.println("1: Deposit");
                System.out.println("2: Withdraw");
                System.out.println("3: Check Balance");
                System.out.println("4: Exit");
                System.out.print("Enter your choice: ");
                
                int choice = scanner.nextInt();
                
                switch (choice) {
                    case 1:
                        System.out.print("Enter deposit amount: ");
                        double depositAmount = scanner.nextDouble();
                        accountBalances[i] += depositAmount;
                        System.out.println("Deposited " + depositAmount + ". New balance: " + accountBalances[i]);
                        break;
                    case 2:
                        System.out.print("Enter withdrawal amount: ");
                        double withdrawAmount = scanner.nextDouble();
                        if (withdrawAmount > accountBalances[i]) {
                            System.out.println("Insufficient balance.");
                        } else {
                            accountBalances[i] -= withdrawAmount;
                            System.out.println("Withdrew " + withdrawAmount + ". New balance: " + accountBalances[i]);
                        }
                        break;
                    case 3:
                        System.out.println("Current balance: " + accountBalances[i]);
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }

                if (exit) {
                    break;
                }
            }
        }

    }
}
