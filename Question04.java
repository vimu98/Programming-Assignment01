import java.util.Scanner;

class Question04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
			System.out.print("Enter the numbers "+(i+1)+": ");
            numbers[i] = scanner.nextInt();
        }


        int sum = 0;
        int evenCount = 0;
        int oddCount = 0;
        int largest = numbers[0];
        int smallest = numbers[0];

      
        for (int i = 0; i < n; i++) {
           
            sum += numbers[i];

           
            if (numbers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

            
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
            

            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }


        System.out.println("Sum of all numbers: " + sum);
        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);
        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);

    }
}
