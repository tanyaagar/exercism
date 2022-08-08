import java.util.HashMap;
public class Blackjack {
    
    public int parseCard(String card) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("ace" , 11);
        map.put("two",2);
        map.put("three",3);
        map.put("four",4);
        map.put("five",5);
        map.put("six",6);
        map.put("seven",7);
        map.put("eight",8);
        map.put("nine",9);
        map.put("ten",10);
        map.put("jack",10);
        map.put("queen",10);
        map.put("king",10);
       if(map.containsKey(card))
           return map.get(card);
        return 0;
    }

    public boolean isBlackjack(String card1, String card2) {
        int c1 = parseCard(card1)+parseCard(card2);
        return (c1 == 21);
    }

    public String largeHand(boolean isBlackjack, int dealerScore) {
        if(isBlackjack ){
            if(dealerScore<10)
                return "W";
            else
                return "S";
        }
        else
            return "P";
        }

    public String smallHand(int handScore, int dealerScore) {
        if(handScore>=17)
            return "S";
        if(handScore<=11)
            return "H";
        if(dealerScore>=7)
            return "H";
        return "S";
    }

    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}
