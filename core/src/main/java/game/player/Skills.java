package game.player;

import java.util.EnumMap;
import java.util.Map;

/**
 * Tracks player skills and levels.
 */
public class Skills {
    public enum Skill { HAGGLING, APPRAISAL, RESTORATION, SCOUTING, LOGISTICS }

    private final Map<Skill, Integer> levels = new EnumMap<>(Skill.class);

    public Skills() {
        for (Skill s : Skill.values()) {
            levels.put(s, 1);
        }
    }

    /** Increase a skill by one level. */
    public void levelUp(Skill skill) {
        levels.merge(skill, 1, Integer::sum);
    }

    public int getLevel(Skill skill) {
        return levels.getOrDefault(skill, 1);
    }
}
