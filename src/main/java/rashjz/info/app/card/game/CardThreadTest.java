/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rashjz.info.app.card.game;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author rasha_000
 */
public class CardThreadTest {
//An expected exception should be handled by the optional expected argument of @Test
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentExceptionForInvalidNumber() {
        String[] values = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        DeckOfCard exThread = new DeckOfCard(values);
        exThread.run();
 
    }
}
