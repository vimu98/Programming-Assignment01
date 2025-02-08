import java.util.Scanner;

class Question02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of items in the cart: ");
        int numItems = scanner.nextInt();

        double[] prices = new double[numItems];
        
        for (int i = 0; i < numItems; i++) {
			
            System.out.print("Enter the price of item " + (i + 1) + ": ");
            prices[i] = scanner.nextDouble();
            
        }

        
        double total = 0;
        double highest = prices[0];
        double lowest = prices[0];

        for (int i = 0; i < numItems; i++) {
			
            total += prices[i];
            if (prices[i] > highest) {
                highest = prices[i];
            }
            if (prices[i] < lowest) {
                lowest = prices[i];
            }
            
        }

        double avgPrice = total / numItems;

        System.out.println("\nShopping Cart Summary:");
        System.out.println("Total Price: Rs." + total);
        System.out.println("Average Price: Rs." + avgPrice);
        System.out.println("Highest Price: Rs." + highest);
        System.out.println("Lowest Price: Rs." + lowest);

    }
}
