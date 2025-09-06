package game.trade;

import game.items.Item;
import game.npc.NPC;
import java.math.BigDecimal;

/**
 * Simulates a simple negotiation outcome.
 */
public class NegotiationService {
    public BigDecimal negotiate(NPC npc, Item item, BigDecimal askPrice) {
        // Placeholder logic: NPC offers 90% of asking price
        return askPrice.multiply(BigDecimal.valueOf(0.9));
    }
}
