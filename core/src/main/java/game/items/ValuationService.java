package game.items;

import game.economy.MarketIndex;
import java.math.BigDecimal;

/**
 * Provides price appraisal for items.
 */
public class ValuationService {
    /**
     * Simple valuation based on base value and market hype.
     */
    public BigDecimal appraise(Item item, MarketIndex index) {
        float hype = index.getHype("default");
        return item.getBaseValue().multiply(BigDecimal.valueOf(1 + hype));
    }
}
