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

    public String getItemIds() {
        ArrayList<String> arrayList = new ArrayList<String>();
        for(BagItem bagItem :bags){
            arrayList.add( String.valueOf(bagItem.getId()));
            List<ItemLookup> inventory = bagItem.getInventory();
            if(inventory != null) {
                for (ItemLookup item : inventory) {
                    if (item != null) {
                        arrayList.add(String.valueOf(item.getId()));
                    }
                }
            }
        }
        return String.join(",",arrayList);
    }
     public void cleanUpData(){
         for ( BagItem bagItem: this.bags ) {
             List<ItemLookup> inventory = bagItem.getInventory();
             while(inventory.contains(null)){
                 inventory.remove(null);
             }

         }
     }
}
