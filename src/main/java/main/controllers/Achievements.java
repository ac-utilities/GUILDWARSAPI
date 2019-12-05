package main.controllers;


import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import main.conection.NetworkConection;
import main.config.Keys;
import main.guildwars.achieve.AchievementsDaily;
import main.guildwars.achieve.AchievementsBaseDetails;
import main.guildwars.ItemDetails;
import main.guildwars.achieve.AchievementsDetails;
import org.json.simple.JSONArray;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("guildwars2/Items")
@Api(value = "account details")
public class Achievements {

    //    http://localhost:2846/swagger-ui.html

    @GetMapping("getAchievementsDaily")
    @ApiOperation(value = "getAchievementsDaily", response = ItemDetails.class)
    public AchievementsDaily getAchievementsDaily() {
        String endPoint = String.format("v2/achievements/daily");
        String getURL = String.format("%s%s", Keys.BASE, endPoint);

        AchievementsDaily achievementsDaily = null;

        try {
            String response = NetworkConection.getEndpointWithoutToken(getURL);
            achievementsDaily = new ObjectMapper().readValue(response, AchievementsDaily.class);

            return achievementsDaily;
        } catch (Exception e) {
            e.printStackTrace();

            return achievementsDaily;
        }
    }

    @GetMapping("getAchievementsDailyDetails")
    @ApiOperation(value = "getAchievementsDailyDetails", response = ItemDetails.class)
    public  List<AchievementsDetails> getAchievementsDailyDetails() {
//    public  List<AchievementsDetails> getAchievementsDailyDetails(@RequestParam(value="type") String type) {
        String endPoint = String.format("v2/achievements/daily");
        String getURL = String.format("%s%s", Keys.BASE, endPoint);

        AchievementsDaily achievementsDaily = null;

        try {
            String response = NetworkConection.getEndpointWithoutToken(getURL);
            achievementsDaily = new ObjectMapper().readValue(response, AchievementsDaily.class);
            List<AchievementsDetails> achievementsDetails = AchievementsDescription(String.join(",", getAllIds(achievementsDaily)));
            return achievementsDetails;
        } catch (Exception e) {
            e.printStackTrace();

            return null;
        }
    }

    private  List<AchievementsDetails> AchievementsDescription(String idlist){
//        https://api.guildwars2.com/v2/achievements?ids=1976,1977
        String endPoint = String.format("v2/achievements?ids=%s",idlist);
        String getURL = String.format("%s%s", Keys.BASE, endPoint);
        List<AchievementsDetails> tmp = null;
        try {
            String response = NetworkConection.getEndpointWithoutToken(getURL);
            tmp = new ObjectMapper().readValue(response, List.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tmp;
    }

    private List<String> getAllIds(AchievementsDaily achievementsDaily) {
        List<String> ids = new ArrayList<>();
        for(AchievementsBaseDetails achievementsBaseDetails : achievementsDaily.getPve()){
            ids.add(String.format("%d",  achievementsBaseDetails.getId()));
        }
        return ids;
    }


}