import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        String answer = "yes";
        Scanner sc = new Scanner(System.in);
        System.out.println("Игрок 1 введите свое имя");
        Player player1 = new Player(sc.nextLine());
        System.out.println("Игрок 2 введите свое имя");
        Player player2 = new Player(sc.nextLine());

        GuessNumber guessNumber = new GuessNumber(player1, player2);
        while(answer.equals("yes")) {
            boolean isWin = false;
            guessNumber.setSecretNumber((int) (Math.random() * 100) + 1);
            while (!isWin) {
                System.out.println("Игрок " + player1.getName() + " введите число:");
                int num1 = sc.nextInt();
                System.out.println("Игрок " + player2.getName() + " введите число:");
                int num2 = sc.nextInt();
                isWin = guessNumber.game(num1, num2);
            }
            answer = "";
            while (!answer.equals("yes") && !answer.equals("no")) {
                System.out.println("Хотите продолжить игру? [yes/no]");
                sc.nextLine();
                answer = sc.nextLine();
            }
        }
    }
}