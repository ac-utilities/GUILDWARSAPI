package main.guildwars;

import org.json.simple.JSONArray;

public class ItemDetails {
    public ItemDetails(JSONArray jsonArray) {
        itemDetails = jsonArray;
    }

    public JSONArray getItemDetails() {
        return itemDetails;
    }

    public void setItemDetails(JSONArray itemDetails) {
        this.itemDetails = itemDetails;
    }

    private JSONArray itemDetails;
}
