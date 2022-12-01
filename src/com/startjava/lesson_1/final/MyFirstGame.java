public class MyFirstGame {

    public static void main(String[] args) {
        int playerNum = 88;
        int secretNum = 10;

        while(playerNum != secretNum) {
            if(playerNum < secretNum) {
                System.out.println("Число " + playerNum + " меньше того, что загадал компьютер");
            } else if(playerNum > secretNum) {
                System.out.println("Число " + playerNum + " больше того, что загадал компьютер");
            }
            playerNum++;
            if(playerNum > 100) {
                playerNum = 1;
            }
        }
        System.out.println("Вы победили! Вы угадали число " + playerNum);
    }
}