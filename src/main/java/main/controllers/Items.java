package main.controllers;


import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import main.conection.NetworkConection;
import main.config.Keys;
import main.guildwars.*;
import org.json.simple.JSONArray;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("guildwars2/Items")
@Api(value = "account details")
public class Items {

    //    http://localhost:2846/swagger-ui.html

    @GetMapping("getItems")
    @ApiOperation(value = "getItems", response = ItemDetails.class)
    public ItemDetails getItems(@RequestParam(value="ids") String ids ){
        String endPoint =  String.format("v2/items?ids=%s",ids);
        String getURL = String.format("%s%s", Keys.BASE, endPoint);

        JSONArray jsonArray = null;
        ItemDetails characterNames = null;

        try {
            String response = NetworkConection.getEndpointWithoutToken(getURL);
            jsonArray = new ObjectMapper().readValue(response, JSONArray.class);

            characterNames = new ItemDetails(jsonArray);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return characterNames;
    }


    @GetMapping("getCharacterItems")
    @ApiOperation(value = "getCharacterItems", response = ItemDetails.class)
    public ItemDetails getCharacterItems(@RequestParam(value="name") String name,@RequestParam(value="accountName") String accountName ){


        String endPoint = String.format("/v2/characters/%s/inventory",name);
        String getURL = String.format("%s%s", Keys.BASE, endPoint);
        CharacterInventory equipment = null;

        try {
            String response = NetworkConection.getEndpoint(getURL,accountName);
            equipment = new ObjectMapper().readValue(response, CharacterInventory.class);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        String ids = equipment.getItemIds();


        endPoint =  String.format("v2/items?ids=%s",ids);
        getURL = String.format("%s%s", Keys.BASE, endPoint);

        JSONArray jsonArray = null;
        ItemDetails characterNames = null;

        try {
            String response = NetworkConection.getEndpointWithoutToken(getURL);
            jsonArray = new ObjectMapper().readValue(response, JSONArray.class);

            characterNames = new ItemDetails(jsonArray);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return characterNames;
    }


}
