package main.guildwars;

import org.json.simple.JSONArray;

public class BagItem {
    public int id;
    public int size;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public JSONArray getInventory() {
        return inventory;
    }

    public void setInventory(JSONArray inventory) {
        this.inventory = inventory;
    }

    public JSONArray inventory;
}
