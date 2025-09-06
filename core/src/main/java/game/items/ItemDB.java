package game.items;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * In-memory database of items loaded from JSON.
 */
public class ItemDB {
    private final Map<String, Item> items = new HashMap<>();

    public void add(Item item) {
        items.put(item.getId(), item);
    }

    public Item get(String id) {
        return items.get(id);
    }

    public Map<String, Item> all() {
        return Collections.unmodifiableMap(items);
    }
}
