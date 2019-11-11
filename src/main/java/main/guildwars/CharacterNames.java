package main.guildwars;

import org.json.simple.JSONArray;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CharacterNames {

    public JSONArray getCharacterName() {
        return characterName;
    }

    public void setCharacterName(JSONArray characterName) {
        this.characterName = characterName;
    }

    private JSONArray characterName;

    public CharacterNames(JSONArray jsonArray) {
        this.characterName = jsonArray;
    }
    public CharacterNames(){
        super();
    }
}
