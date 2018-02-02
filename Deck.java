public class Deck {
    private PlayingCard[] cards=new PlayingCard[52];
    private int deckPlace;
    public Deck(){
        deckPlace=0;
        int counter=0;
        for (int y=1; y<5; y++)
        {
            int v=0;
            for (int x=1; x<14; x++)
            {


                if (x>1&&x<=9)
                    v=x;
                if (x>9 &&x<=13)
                    v=10;
                if (x==1)
                    v=11;

                cards[counter]= new PlayingCard(y,v,x);
                counter++;
            }
        }
    }
    public void shuffle() {
        for (int x=51; x>0; x--)
        {
            int inloc=(int)(Math.random()*520)%52;
            int newloc=x;
            PlayingCard temp;
            temp=cards[newloc];
            cards[newloc]=cards[inloc];
            cards[inloc]=temp;
        }
    }
    public PlayingCard draw(){
        PlayingCard temp = cards[deckPlace];
        deckPlace++;
        return temp;
    }
    public void printDeck(){
        for (int x=deckPlace; x<52; x++)
        {
            System.out.println(cards[x]);
        }
    }
}

