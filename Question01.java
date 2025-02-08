import java.util.Scanner;

class Question01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine();  

        String[] stNames = new String[numStudents];
        double[] stMarks = new double[numStudents];
        char[] stGrades = new char[numStudents];

      
        for (int i = 0; i < numStudents; i++) {
			
            System.out.print("Enter student " + (i + 1) + ": ");
            stNames[i] = scanner.nextLine();

            System.out.print("Enter the marks for " + stNames[i] + ": ");
            stMarks[i] = scanner.nextDouble();
            scanner.nextLine();

       
            if (stMarks[i] >= 90) {
                stGrades[i] = 'A';
                
            } else if (stMarks[i] >= 75) {
                stGrades[i] = 'B';
                
            } else if (stMarks[i] >= 50) {
                stGrades[i] = 'C';
                
            } else {
                stGrades[i] = 'F';
                
            }
        }

        
        System.out.println("\nStudent Report:");
        System.out.println("Name\t\tMarks\tGrade");
        System.out.println("-----------------------------");

        for (int i = 0; i < numStudents; i++) {
			
            System.out.println(stNames[i] + "\t\t" + stMarks[i] + "\t" + stGrades[i]);
            
        }

    }
}

