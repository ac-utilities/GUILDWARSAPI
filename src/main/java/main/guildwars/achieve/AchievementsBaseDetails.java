package main.guildwars.achieve;

import java.util.List;

public class AchievementsBaseDetails {
    private int id;
    private LevelRange level;
    private List<String> required_access;

    public AchievementsBaseDetails(int id, LevelRange level, List<String> required_access) {
        this.id = id;
        this.level = level;
        this.required_access = required_access;
    }

    public AchievementsBaseDetails() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LevelRange getLevel() {
        return level;
    }

    public void setLevel(LevelRange level) {
        this.level = level;
    }

    public List<String> getRequired_access() {
        return required_access;
    }

    public void setRequired_access(List<String> required_access) {
        this.required_access = required_access;
    }
}
