import java.util.Scanner;

public class GuessNumber {
    private final Player player1;
    private final Player player2;
    private int secretNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        Scanner sc = new Scanner(System.in);
        secretNumber = ((int) (Math.random() * 100) + 1);
        while (true) {
            System.out.println("Игрок " + player1.getName() + " введите число:");
            int number = sc.nextInt();
            if (checkNumber(player1, number)) {
                break;
            }
            System.out.println("Игрок " + player2.getName() + " введите число:");
            number = sc.nextInt();
            if (checkNumber(player2, number)) {
                break;
            }
        }
    }

    private boolean checkNumber(Player player, int playerNumber) {
        if (playerNumber == secretNumber) {
            System.out.println("Игрок " + player.getName() + " победил");
            return true;
        }
        if (playerNumber > secretNumber) {
            System.out.println("Число " + playerNumber + " больше того, что загадал компьютер");
        } else {
            System.out.println("Число " + playerNumber + " меньше того, что загадал компьютер");
        }
        return false;
    }
}