package game.world;

/**
 * Handles the in-game day and night cycle.
 */
public class DayNightSystem {
    private float timeOfDay = 0f;

    /** Advance the time of day. */
    public void tick(float delta) {
        timeOfDay = (timeOfDay + delta) % 24f;
    }

    /** Current in-game hour. */
    public float getTimeOfDay() {
        return timeOfDay;
    }
}
