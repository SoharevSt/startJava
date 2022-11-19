public class MyFirstGame {

    public static void main(String[] args) {
        int playNum = 88;
        int compNum = 10;

        while(playNum != compNum) {
            if(playNum < compNum) {
                System.out.println("Число " + playNum + " меньше того, что загадал компьютер");
            }
            if(playNum > compNum) {
                System.out.println("Число " + playNum + " больше того, что загадал компьютер");
            }
            playNum += 1;
            if(playNum > 100) {
                playNum = 1;
            }
        }
        System.out.println("Вы победили! Вы угадали число " + playNum);
    }
}