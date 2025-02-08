import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int subjects = 5;
        int[] exam1Marks = new int[subjects];
        int[] exam2Marks = new int[subjects];
        int[] improvement = new int[subjects];
        int totalImprovement = 0;

       
        System.out.println("Enter marks for 5 subjects in Exam 1:");
        for (int i = 0; i < subjects; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            exam1Marks[i] = scanner.nextInt();
        }

        System.out.println("Enter marks for 5 subjects in Exam 2:");
        for (int i = 0; i < subjects; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            exam2Marks[i] = scanner.nextInt();
        }

      
        System.out.println("\nImprovement in marks for each subject:");
        for (int i = 0; i < subjects; i++) {
            improvement[i] = exam2Marks[i] - exam1Marks[i];
            totalImprovement += improvement[i];
            System.out.println("Subject " + (i + 1) + ": " + improvement[i]);
        }

   
        double averageImprovement = (double) totalImprovement / subjects;
        System.out.println("\nAverage improvement across all subjects: " + averageImprovement);

     
    }
}
