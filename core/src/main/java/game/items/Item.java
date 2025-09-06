package game.items;

import java.math.BigDecimal;
import java.util.Map;

/**
 * Basic collectible item definition.
 */
public class Item {
    private final String id;
    private final String name;
    private final BigDecimal baseValue;
    private final int condition; // 0-100
    private final Map<String, Object> tags;

    public Item(String id, String name, BigDecimal baseValue, int condition, Map<String, Object> tags) {
        this.id = id;
        this.name = name;
        this.baseValue = baseValue;
        this.condition = condition;
        this.tags = tags;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public BigDecimal getBaseValue() { return baseValue; }
    public int getCondition() { return condition; }
    public Map<String, Object> getTags() { return tags; }
}
