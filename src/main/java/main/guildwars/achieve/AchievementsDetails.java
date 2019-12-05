package main.guildwars.achieve;

import org.json.simple.JSONArray;

import java.util.List;

public class AchievementsDetails {
    private int id;
    private String name;
    private String description;
    private String requirement;
    private String locked_text;
    private String type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    public String getLocked_text() {
        return locked_text;
    }

    public void setLocked_text(String locked_text) {
        this.locked_text = locked_text;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getFlags() {
        return flags;
    }

    public void setFlags(List<String> flags) {
        this.flags = flags;
    }

    public JSONArray getRewards() {
        return rewards;
    }

    public void setRewards(JSONArray rewards) {
        this.rewards = rewards;
    }

    private List<String> flags;
    private JSONArray rewards;

    public AchievementsDetails() {
        this.id = id;
    }

    public AchievementsDetails(int id, String name, String description, String requirement, String locked_text, String type, List<String> flags, JSONArray rewards) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.requirement = requirement;
        this.locked_text = locked_text;
        this.type = type;
        this.flags = flags;
        this.rewards = rewards;
    }
}
