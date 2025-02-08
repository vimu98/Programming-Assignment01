import java.util.Scanner;

public class Question07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

       
        String[] words = sentence.split(" ");
		 String[] temp = new String[words.length];
      
        for (int i = 0; i < words.length; i++) {
           temp[i] = words[(words.length)-i-1];
           
        }

		for (String word : temp) {
			 System.out.print(word + " "); 
			 
		}
    }
}

