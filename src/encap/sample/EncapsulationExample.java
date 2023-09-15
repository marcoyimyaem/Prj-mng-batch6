package encap.sample;
public class EncapsulationExample {
    private int numCards;

    private int numOfPlayers;

    public int getNumCards() {
        return numCards;
    }

    public void setNumCards(int numCards) {
        if(numCards>=12)
            this.numCards = numCards;
        else
            System.out.println("number must be greater than 11");
    }

    public EncapsulationExample() {
        setNumCards(52);
        setNumOfPlayers(4);
    }

    public EncapsulationExample(int numCards, int numOfPlayers) {
        setNumCards(numCards);
        setNumOfPlayers(numOfPlayers);
    }


    public int getNumOfPlayers() {
        return numOfPlayers;
    }

    public void setNumOfPlayers(int numOfPlayers) {
        this.numOfPlayers = numOfPlayers;
    }

    public static void main(String[] args) {
        EncapsulationExample table1 = new EncapsulationExample();
        EncapsulationExample table2 = new EncapsulationExample(32,2);

    }



}


