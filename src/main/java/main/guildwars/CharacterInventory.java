package main.guildwars;

import net.bytebuddy.implementation.bind.annotation.IgnoreForBinding;
import org.json.simple.JSONArray;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

@XmlRootElement
public class CharacterInventory {

    public List<BagItem> getBags() {
        return bags;
    }

    public void setBags(ArrayList<BagItem> bags) {
        this.bags = bags;
    }

    private List<BagItem> bags;

    @IgnoreForBinding
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
