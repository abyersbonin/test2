package game.economy;

import java.util.HashMap;
import java.util.Map;

/**
 * Tracks market hype levels by category.
 */
public class MarketIndex {
    private final Map<String, Float> hype = new HashMap<>();

    public float getHype(String category) {
        return hype.getOrDefault(category, 0f);
    }

    public void setHype(String category, float value) {
        hype.put(category, value);
    }
}
