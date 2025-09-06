package game.inventory;

import game.items.Item;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Manages the player's inventory.
 */
public class InventoryService {
    private final List<Item> items = new ArrayList<>();

    public void add(Item item) {
        items.add(item);
    }

    public boolean remove(Item item) {
        return items.remove(item);
    }

    public List<Item> getItems() {
        return Collections.unmodifiableList(items);
    }
}
