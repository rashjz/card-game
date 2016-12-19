/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rashjz.info.app.card.game;

import java.util.*;

public class DeckOfCard implements Runnable {

    ArrayList<Card> cards = new ArrayList<Card>();

//    static boolean firstThread = true;
    public DeckOfCard(String[] values) {
        for (Suits s : Suits.values()) {
            for (int j = 0; j < values.length; j++) {
                this.cards.add(new Card(s.name(), values[j]));
            }
        }
        //shuffle the deck when its created
        Collections.shuffle(this.cards);

    }

    public DeckOfCard() {
    }

    public ArrayList<Card> getDeck() {
        return cards;
    }

 

    @Override
    public void run() { 
//        DeckOfCard deck = new DeckOfCard();
        //print out the deck.
        System.out.println(""+this.getDeck());
    }
}
