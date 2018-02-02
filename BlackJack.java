import java.util.Scanner;

public class BlackJack {
    private Deck deck = new Deck();
    private int Pscore;
    private int Dscore;

    public double play(double money) {
        Scanner input = new Scanner(System.in);
        System.out.println("How much do you wanna bet?");
        double bet = input.nextDouble();
        PlayingCard pc1 = deck.draw();
        PlayingCard pc2 = deck.draw();
        PlayingCard dc1 = deck.draw();
        PlayingCard dc2 = deck.draw();
        System.out.println("Player cards: ");
        pc1.cardToString();
        System.out.print(" and ");
        pc2.cardToString();
        System.out.println();
        System.out.println("Dealer card: ");
        dc1.cardToString();
        System.out.println();
        Pscore = pc1.getValue() + pc2.getValue();
        Dscore = dc1.getValue() + dc2.getValue();
        if (Pscore == 21)
            System.out.println("You got a blackjack!");
        else {
            if (Dscore == 21)
                System.out.println("Dealer got a blackjack!");
            else {

                playerTurn();
                if (Pscore > 21)
                    System.out.println("Bust!");
                else {
                    dealerTurn();
                    System.out.print("Hidden Dealer Card: ");
                    dc2.cardToString();
                    System.out.println();
                    if (Dscore > 21)
                        System.out.println("Dealer Bust!");
                    else {
                        if (Pscore > Dscore) {
                            System.out.println("You win!");
                            money += bet;
                        }
                        if (Dscore > Pscore) {
                            System.out.println("You lose :(");
                            money -= bet;
                        }
                        if (Pscore == Dscore) {
                            System.out.println("Push :/");
                        }
                    }
                }
            }
        }
        return money;
    }
    public BlackJack(){
        deck.shuffle();
        Pscore=0;
        Dscore=0;
    }
    public void playerTurn(){
        int x=1;
        Scanner input=new Scanner(System.in);
        while (x>=0){
            System.out.println("Do you want to hit? Y/N");
            char[] tempo=(input.next()).toCharArray();
            char temp=tempo[0];
            PlayingCard card;
            if (temp=='y'||temp=='Y')
            {
                card=deck.draw();
                Pscore+=card.getValue();
                card.cardToString();
            }
            if (Pscore>21)
            {
                x=-1;
            }
            if (temp=='n'||temp=='N')
            {
                x=-1;
            }

        }
    }
    public void dealerTurn(){
        int x=1;
        System.out.println();
        System.out.println("dealerTurn");
        System.out.println();
        while (x>=0&&Dscore<21){
            PlayingCard card;
            if (Dscore<17)
            {
                card=deck.draw();
                Dscore+=card.getValue();
                card.cardToString();
            }
            else
                x=-1;
        }
    }


}
