package main.conection;

import main.config.Keys;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class NetworkConection {

    public static String getEndpointWithoutToken(String endpoint) throws Exception{
        URL url = new URL(endpoint);

        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;

        StringBuffer content = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }

        in.close();
        con.disconnect();
        return content.toString();
    }

    public static String getEndpoint(String endpoint) throws Exception {
        String token = String.format("?access_token=%s", Keys.getTOKEN());
        return getEndpointWithoutToken(endpoint.concat(token));
    }


}
