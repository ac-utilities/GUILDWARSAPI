package main.controllers;


import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import main.conection.NetworkConection;
import main.config.Keys;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

@RestController
@RequestMapping("guildwars2/account")
@Api(value = "account details")
public class Account {

    //    http://localhost:2846/swagger-ui.html

    @GetMapping("all")
    @ApiOperation(value = "getAll", response = main.guildwars.Account.class)
    public main.guildwars.Account allItems(){
        String endPoint = "v2/account";
        String getURL = String.format("%s%s", Keys.BASE, endPoint);
        main.guildwars.Account account = null;

        try {
            String response = NetworkConection.getEndpoint(getURL);
            account = new ObjectMapper().readValue(response, main.guildwars.Account.class);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return account;
    }


}

