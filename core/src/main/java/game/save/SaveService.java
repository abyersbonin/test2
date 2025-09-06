package game.save;

import java.nio.file.Path;

/**
 * Handles saving and loading game state.
 */
public class SaveService {
    private final Path savePath;

    public SaveService(Path savePath) {
        this.savePath = savePath;
    }

    public Path getSavePath() {
        return savePath;
    }
}
