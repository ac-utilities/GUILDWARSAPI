package main.guildwars;

import org.json.simple.JSONArray;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.LinkedHashMap;

@XmlRootElement
public class CharacterInventory {
    public JSONArray getBags() {
        return bags;
    }

    public void setBags(JSONArray bags) {
        this.bags = bags;
    }

    private JSONArray bags;

    public String getItemIds() {
        ArrayList<String> arrayList = new ArrayList<String>();
        for(Object tmp :bags){
            arrayList.add(((LinkedHashMap) tmp).get("id").toString());
            ArrayList inventory = (ArrayList) ((LinkedHashMap) tmp).get("inventory");
            if(inventory != null) {
                for (Object item : inventory) {
                    if (item != null) {
                        arrayList.add(((LinkedHashMap) item).get("id").toString());
                    }
                }
            }
        }
        return String.join(",",arrayList);
    }
}
