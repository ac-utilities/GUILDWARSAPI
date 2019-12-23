package main.config;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Keys {
    public final static String BASE = "https://api.guildwars2.com/";

    public static String getTOKEN(){

        InputStream inputStream = Keys.class.getClassLoader().getResourceAsStream("token.properties");

        Properties prop = new Properties();
        try {
            prop.load(inputStream);
            return prop.getProperty("default");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
    public static String getTOKEN(String tokenName){

        InputStream inputStream = Keys.class.getClassLoader().getResourceAsStream("token.properties");

        Properties prop = new Properties();
        try {
            prop.load(inputStream);
            return prop.getProperty(tokenName);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

}
