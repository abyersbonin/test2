package game.player;

/**
 * Basic player movement controller placeholder.
 */
public class PlayerController {
    private float x;
    private float y;
    private float z;

    /** Move the player by a delta. */
    public void move(float dx, float dy, float dz) {
        x += dx;
        y += dy;
        z += dz;
    }

    public float[] getPosition() {
        return new float[] {x, y, z};
    }
}
