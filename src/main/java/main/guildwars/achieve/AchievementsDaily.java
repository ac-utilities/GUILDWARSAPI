package main.guildwars.achieve;

import java.util.List;

public class AchievementsDaily {
    public AchievementsDaily(List<AchievementsBaseDetails> pve, List<AchievementsBaseDetails> pvp, List<AchievementsBaseDetails> wvw, List<AchievementsBaseDetails> fractals, List<AchievementsBaseDetails> special) {
        this.pve = pve;
        this.pvp = pvp;
        this.wvw = wvw;
        this.fractals = fractals;
        this.special = special;
    }

    public AchievementsDaily() {
    }

    public List<AchievementsBaseDetails> getPve() {
        return pve;
    }

    public void setPve(List<AchievementsBaseDetails> pve) {
        this.pve = pve;
    }

    public List<AchievementsBaseDetails> getPvp() {
        return pvp;
    }

    public void setPvp(List<AchievementsBaseDetails> pvp) {
        this.pvp = pvp;
    }

    public List<AchievementsBaseDetails> getWvw() {
        return wvw;
    }

    public void setWvw(List<AchievementsBaseDetails> wvw) {
        this.wvw = wvw;
    }

    public List<AchievementsBaseDetails> getFractals() {
        return fractals;
    }

    public void setFractals(List<AchievementsBaseDetails> fractals) {
        this.fractals = fractals;
    }

    public List<AchievementsBaseDetails> getSpecial() {
        return special;
    }

    public void setSpecial(List<AchievementsBaseDetails> special) {
        this.special = special;
    }

    private List<AchievementsBaseDetails> pve;
    private List<AchievementsBaseDetails> pvp;
    private List<AchievementsBaseDetails> wvw;
    private List<AchievementsBaseDetails> fractals;
    private List<AchievementsBaseDetails> special;
}
