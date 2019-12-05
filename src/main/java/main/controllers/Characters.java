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
@RequestMapping("guildwars2/character")
@Api(value = "account details")
public class Characters {

    //    http://localhost:2846/swagger-ui.html

    @GetMapping("all")
    @ApiOperation(value = "allNames", response = CharacterNames.class)
    public CharacterNames allNames(){
        String endPoint = "v2/characters";
        String getURL = String.format("%s%s", Keys.BASE, endPoint);

        JSONArray jsonArray = null;
        CharacterNames characterNames = null;

        try {
            String response = NetworkConection.getEndpoint(getURL);
            jsonArray = new ObjectMapper().readValue(response, JSONArray.class);

            characterNames = new CharacterNames(jsonArray);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return characterNames;
    }

    @GetMapping("core")
    @ApiOperation(value = "core", response = CharacterCore.class)
    public CharacterCore core(@RequestParam(value="name") String name ){


        String endPoint = String.format("/v2/characters/%s/core",name);
        String getURL = String.format("%s%s", Keys.BASE, endPoint);
        CharacterCore characterCore = null;

        try {
            String response = NetworkConection.getEndpoint(getURL);
            characterCore = new ObjectMapper().readValue(response, CharacterCore.class);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return characterCore;
    }

    @GetMapping("crafting")
    @ApiOperation(value = "crafting", response = CharacterCrafting.class)
    public CharacterCrafting crafting(@RequestParam(value="name") String name ){

        String endPoint = String.format("v2/characters/%s/crafting",name);
        String getURL = String.format("%s%s", Keys.BASE, endPoint);
        CharacterCrafting characterCrafting = null;

        try {
            String response = NetworkConection.getEndpoint(getURL);
            characterCrafting = new ObjectMapper().readValue(response, CharacterCrafting.class);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return characterCrafting;
    }

    @GetMapping("equipment")
    @ApiOperation(value = "equipment", response = Equipment.class)
    public Equipment equipment(@RequestParam(value="name") String name ){

        String endPoint = String.format("v2/characters/%s/equipment",name);
        String getURL = String.format("%s%s", Keys.BASE, endPoint);
        Equipment equipment = null;

        try {
            String response = NetworkConection.getEndpoint(getURL);
            equipment = new ObjectMapper().readValue(response, Equipment.class);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return equipment;
    }


    @GetMapping("inventory")
    @ApiOperation(value = "inventory", response = CharacterInventory.class)
    public CharacterInventory inventory(@RequestParam(value="name") String name ){

        String endPoint = String.format("v2/characters/%s/inventory",name);
        String getURL = String.format("%s%s", Keys.BASE, endPoint);
        CharacterInventory equipment = null;

        try {
            String response = NetworkConection.getEndpoint(getURL);
            equipment = new ObjectMapper().readValue(response, CharacterInventory.class);
            equipment.cleanUpData();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return equipment;
    }


}
