public class PlayingCard {
    private int suit;
    private int value;
    private int face;
    public PlayingCard(){
        suit=0;
        value=0;
        face=0;
    }
    public PlayingCard(int s, int v, int f){
        suit=s;
        value=v;
        face=f;
    }
    public int getValue(){
        return value;
    }
    public void cardToString(){
        String temp;
        if (face==1)
            temp="ace";
        else if (face==11)
            temp="jack";
        else if (face==12)
            temp="queen";
        else if (face==13)
            temp="king";
        else {
            temp = Integer.toString(face);
        }
        String temp2;
        if (suit==1)
            temp2="spades";
        else if (suit==2)
            temp2="clubs";
        else if (suit==3)
            temp2="hearts";
        else if (suit==4)
            temp2="diamonds";
        else
            temp2="none";
        System.out.println(temp + " of " + temp2);
    }
}
