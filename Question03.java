import java.util.Scanner;

class Question03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] candidates = new String[5];
        int[] votes = new int[5];
        
      
        for (int i = 0; i < candidates.length; i++) {
            System.out.print("Enter the name of candidate " + (i + 1) + ": ");
            candidates[i] = scanner.nextLine();
        }

        for (int i = 0; i < candidates.length; i++) {
			
            while (true) {
				
                System.out.print("Enter votes for " + candidates[i] + ": ");
                int voteCount = scanner.nextInt();
              
                if (voteCount < 0) {
                    System.out.println("Invalid input!");
                } else {
                    votes[i] = voteCount;
                    break; 
                }
                
            }
        }

        int totalVotes = 0;
        int highestVotes = votes[0];
        int highestVoteIndex = 0;

        for (int i = 0; i < votes.length; i++) {
            totalVotes += votes[i];
            if (votes[i] > highestVotes) {
                highestVotes = votes[i];
                highestVoteIndex = i;
            }
        }


        System.out.println("Total votes: " + totalVotes);
        System.out.println("Candidate with the highest votes: " + candidates[highestVoteIndex] + " with " + highestVotes + " votes.");

        scanner.close();
    }
}

