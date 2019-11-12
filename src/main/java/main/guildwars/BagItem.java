package main.guildwars;

import org.json.simple.JSONArray;

import java.util.List;

public class BagItem {
    public BagItem() {
    }

    public BagItem(int id, int size, List<ItemLookup> inventory) {
        this.id = id;
        this.size = size;
        this.inventory = inventory;
    }


    public int getId() {
        return id;
    }
    public int getSize() {
        return size;
    }
    public List<ItemLookup> getInventory() {
        return inventory;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public void setInventory(List<ItemLookup> inventory) {
        this.inventory = inventory;
    }


    public List<ItemLookup> inventory;
    public int id;
    public int size;
}
