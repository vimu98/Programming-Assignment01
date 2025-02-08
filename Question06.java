import java.util.Scanner;

public class Question06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] celsiusTemp = new double[7];
        double[] fahrenheitTemp= new double[7];

       
        for (int i = 0; i < 7; i++) {
            System.out.print("Enter temperature in Celsius for day " + (i + 1) + ": ");
            celsiusTemp[i] = scanner.nextDouble();
        }

        
        for (int i = 0; i < 7; i++) {
            fahrenheitTemp[i] = (celsiusTemp[i] * 9 / 5) + 32;
        }

        
        for (int i = 0; i < 7; i++) {
            System.out.println("Day " + (i + 1) + ": " + celsiusTemp[i] + "C  " + fahrenheitTemp[i] + "F");
        }

 
    }
}
