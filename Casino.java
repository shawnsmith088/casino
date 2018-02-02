import java.util.Scanner;

public class Casino {
    public static double money=500.0;
    public static void main(String[] args) {

        System.out.printf("You have $%.2f Dollars", money);
        System.out.println();
        boolean play = true;
        while (play == true) {
            System.out.println("What game would you like to play?");
            System.out.println("1. Slots");
            System.out.println("2. BlackJack");
            Scanner input=new Scanner(System.in);
            int game=input.nextInt();
            switch (game){
                case 2:
                    BlackJack bj=new BlackJack();
                    money=bj.play(money);
                    break;
                case 1:
                    Slots slot=new Slots();
                    money=slot.play(money);
                    break;
                default:
                    System.out.println("Did not enter valid ID");

            }
            System.out.printf("Current Money count: $%.2f", money);
            System.out.println();
        }
    }
}
