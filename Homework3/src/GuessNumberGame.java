import java.util.Scanner;

public class GuessNumberGame {

	public static void main(String[] args) {		

		System.out.print("Hi! How many people will play the game :");
        Scanner sc = new Scanner(System.in);
        int gamerCount = sc.nextInt();
        int[][] gamers = new int[gamerCount][3];
        for (int i = 0; i < gamerCount; i++) {
            gamers[i][0] = i + 1;
            gamers[i][1] = 0;
            gamers[i][2] = 0;
        }
        int number = (int) (Math.random() * 100) + 1;
        int guessNumber = 0;
        here:
        do {
            for (int i = 0; i < gamers.length; i++) {
                System.out.print(gamers[i][0] + ". User guess :");
                sc = new Scanner(System.in);
                guessNumber = sc.nextInt();
                if (number == guessNumber) {
                    gamers[i][1] += 1;
                    gamers[i][2] = 1;
                    System.out.println("Congratulations! You won :)");
                    System.out.println("Correct guess : " + guessNumber);
                    break here;
                } else {
                    if (number > guessNumber) {
                        gamers[i][1] += 1;
                        System.out.println("Too low, try again");

                    } else {
                        gamers[i][1] += 1;
                        System.out.println("Too high, try again");
                    }
                }
            }
        } while (number != guessNumber);

        System.out.println("********** SCORE BOARD ********** ");
        int winnerIndex = 0;
        for (int[] i : gamers) {
            System.out.println(i[0] + ". users count of guessing:" + i[1]);
            if(i[2]==1)
            {
                winnerIndex=i[0];
            }
        }
        System.out.print("Winner of the game: "+ winnerIndex+". User" );

	}

	
}
