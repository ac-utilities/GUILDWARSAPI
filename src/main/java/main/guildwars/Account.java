package main.guildwars;

import org.json.simple.JSONArray;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Account {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorld() {
        return world;
    }

    public void setWorld(int world) {
        this.world = world;
    }

    public JSONArray getGuilds() {
        return guilds;
    }

    public void setGuilds(JSONArray guilds) {
        this.guilds = guilds;
    }

    public JSONArray getGuild_leader() {
        return guild_leader;
    }

    public void setGuild_leader(JSONArray guild_leader) {
        this.guild_leader = guild_leader;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public JSONArray getAccess() {
        return access;
    }

    public void setAccess(JSONArray access) {
        this.access = access;
    }

    public Boolean getCommander() {
        return commander;
    }

    public void setCommander(Boolean commander) {
        this.commander = commander;
    }

    public int getFractal_level() {
        return fractal_level;
    }

    public void setFractal_level(int fractal_level) {
        this.fractal_level = fractal_level;
    }

    public int getDaily_ap() {
        return daily_ap;
    }

    public void setDaily_ap(int daily_ap) {
        this.daily_ap = daily_ap;
    }

    public int getMonthly_ap() {
        return monthly_ap;
    }

    public void setMonthly_ap(int monthly_ap) {
        this.monthly_ap = monthly_ap;
    }

    public int getWvw_rank() {
        return wvw_rank;
    }

    public void setWvw_rank(int wvw_rank) {
        this.wvw_rank = wvw_rank;
    }

    public String getLast_modified() {
        return last_modified;
    }

    public void setLast_modified(String last_modified) {
        this.last_modified = last_modified;
    }

    private int age;
    private String name;
    private int world;
    private JSONArray guilds;
    private JSONArray  guild_leader;
    private String created;
    private JSONArray access;
    private Boolean commander;
    private int fractal_level;
    private int daily_ap;
    private int monthly_ap;
    private int wvw_rank;
    private String last_modified;

    public Account(){
        super();
    }
}
