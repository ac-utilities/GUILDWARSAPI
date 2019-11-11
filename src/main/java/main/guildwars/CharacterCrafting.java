package main.guildwars;

import org.json.simple.JSONArray;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CharacterCrafting {
    public JSONArray getCrafting() {
        return crafting;
    }

    public void setCrafting(JSONArray crafting) {
        this.crafting = crafting;
    }

    private JSONArray crafting;


}
