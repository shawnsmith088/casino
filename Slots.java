import java.util.Scanner;

public class Slots {
    public static double play(double money) {
        Scanner input = new Scanner(System.in);
        System.out.println("How much would you like to bet?");
        double bet = input.nextDouble();
        if (bet > money) {
            System.out.println("Unable to bet this much. Returning you to selection screen");
            return money;
        }
        char reel1 = pickCode();
        char reel2 = pickCode();
        char reel3 = pickCode();
        System.out.println(reel1 + " " + reel2 + " " + reel3);
        if (reel1 == reel2 && reel2 == reel3) {
            System.out.println("You win!!!");
            money += bet * 3;
        } else {
            System.out.println("Sorry, you lose :(");
            money -= bet;
        }
        return money;
    }

    private static char pickCode() {
        int num = (int) (Math.random() * 10) % 5;
        if (num == 0) {
            return 0x03A8;
        } else if (num == 1) {
            return 0x03A9;
        } else if (num == 2) {
            return 0x03A6;
        } else if (num == 3) {
            return 0x039B;
        } else if (num == 4) {
            return 0x03A3;
        } else {
            return 0x03A0;
        }
    }
}