package main.guildwars;

import org.json.simple.JSONArray;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Equipment {
    public JSONArray getEquipment() {
        return equipment;
    }

    public void setEquipment(JSONArray equipment) {
        this.equipment = equipment;
    }

    private JSONArray equipment;
}
