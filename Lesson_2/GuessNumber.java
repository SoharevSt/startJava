import java.util.Scanner;

public class GuessNumber {
    private int secretNumber;

    public void play(Player player1, Player player2) {
        Scanner sc = new Scanner(System.in);
        int number;
        boolean result = false;
        secretNumber = ((int) (Math.random() * 100) + 1);
        while (!result) {
            System.out.println("Игрок " + player1.getName() + " введите число:");
            number = sc.nextInt();
            result = checkNumber(player1, number);
            if (!result) {
                System.out.println("Игрок " + player2.getName() + " введите число:");
                number = sc.nextInt();
                result = checkNumber(player2, number);
            }
        }
    }

    private boolean checkNumber(Player player, int playerNumber) {
        if (playerNumber == secretNumber) {
            System.out.println("Игрок " + player.getName() + " победил");
            return true;
        } else if (playerNumber > secretNumber) {
            System.out.println("Число " + playerNumber + " больше того, что загадал компьютер");
            return false;
        }
        System.out.println("Число " + playerNumber + " меньше того, что загадал компьютер");
        return false;
    }
}