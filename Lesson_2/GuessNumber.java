public class GuessNumber {

    private final Player player1;
    private final Player player2;
    private int secretNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void setSecretNumber(int secretNumber) {
        this.secretNumber = secretNumber;
    }

    public boolean game(int number1, int number2) {
        if (number1 == secretNumber){
            System.out.println("Игрок " + player1.getName() + " победил");
            return true;
        } else if (number1 > secretNumber) {
            System.out.println("Число " + number1 + " больше того, что загадал компьютер");
        } else {
            System.out.println("Число " + number1 + " меньше того, что загадал компьютер");
        }
        if (number2 > secretNumber) {
            System.out.println("Число " + number2 + " больше того, что загадал компьютер");
            return false;
        } else if (number2 < secretNumber) {
            System.out.println("Число " + number2 + " меньше того, что загадал компьютер");
            return false;
        } else {
            System.out.println("Игрок " + player2.getName() + " победил");
            return true;
        }
    }
}