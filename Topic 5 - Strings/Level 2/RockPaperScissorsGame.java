import java.util.Scanner;
public class RockPaperScissorsGame {
    
    // Method to get computer's choice using Math.random()
    public static String getComputerChoice() {
        int randomNum = (int)(Math.random() * 3);
        switch(randomNum) {
            case 0: return "rock";
            case 1: return "paper";
            case 2: return "scissors";
            default: return "rock"; // fallback
        }
    }
    
    // Method to determine the winner
    public static String determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "draw";
        }
        
        if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
            (userChoice.equals("paper") && computerChoice.equals("rock")) ||
            (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
            return "user";
        } else {
            return "computer";
        }
    }
    
    // Method to calculate statistics
    public static String[][] calculateStats(int[] results, int totalGames) {
        int userWins = results[0];
        int computerWins = results[1];
        int draws = results[2];
        
        double userWinPercent = (double)userWins / totalGames * 100;
        double computerWinPercent = (double)computerWins / totalGames * 100;
        double drawPercent = (double)draws / totalGames * 100;
        
        return new String[][] {
            {"User Wins", String.valueOf(userWins), String.format("%.2f%%", userWinPercent)},
            {"Computer Wins", String.valueOf(computerWins), String.format("%.2f%%", computerWinPercent)},
            {"Draws", String.valueOf(draws), String.format("%.2f%%", drawPercent)},
            {"Total Games", String.valueOf(totalGames), "100.00%"}
        };
    }
    
    // Method to display results
    public static void displayResults(String[][] gameHistory, String[][] stats) {
        System.out.println("\nGame History:");
        System.out.println("+---------+------------+-----------------+--------+");
        System.out.println("| Game #  | Your Choice| Computer Choice | Result |");
        System.out.println("+---------+------------+-----------------+--------+");
        
        for (int i = 0; i < gameHistory.length; i++) {
            System.out.printf("| %7d | %10s | %15s | %6s |\n", 
                             (i+1), gameHistory[i][0], gameHistory[i][1], gameHistory[i][2]);
        }
        System.out.println("+---------+------------+-----------------+--------+");
        
        System.out.println("\nGame Statistics:");
        System.out.println("+----------------+------------+------------+");
        System.out.println("| Category       | Count      | Percentage |");
        System.out.println("+----------------+------------+------------+");
        
        for (String[] stat : stats) {
            System.out.printf("| %-14s | %-10s | %-10s |\n", stat[0], stat[1], stat[2]);
        }
        System.out.println("+----------------+------------+------------+");
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("How many games would you like to play? ");
        int numGames = scanner.nextInt();
        
        String[][] gameHistory = new String[numGames][3];
        int[] results = new int[3]; // [0]=user wins, [1]=computer wins, [2]=draws
        
        for (int i = 0; i < numGames; i++) {
            System.out.print("\nGame " + (i+1) + ": Enter your choice (rock/paper/scissors): ");
            String userChoice = scanner.next().toLowerCase();
            
            // Validate input
            while (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                System.out.print("Invalid choice. Please enter rock, paper, or scissors: ");
                userChoice = scanner.next().toLowerCase();
            }
            
            String computerChoice = getComputerChoice();
            String result = determineWinner(userChoice, computerChoice);
            
            // Record game history
            gameHistory[i][0] = userChoice;
            gameHistory[i][1] = computerChoice;
            gameHistory[i][2] = result.equals("draw") ? "Draw" : 
                                (result.equals("user") ? "You Win" : "Computer Wins");
            
            // Update results
            if (result.equals("user")) {
                results[0]++;
            } else if (result.equals("computer")) {
                results[1]++;
            } else {
                results[2]++;
            }
        }
        
        String[][] stats = calculateStats(results, numGames);
        displayResults(gameHistory, stats);
        
        scanner.close();
    }
}

