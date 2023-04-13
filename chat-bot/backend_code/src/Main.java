import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
         */
        String token = "1110247658:AAF9VwzrpG9BVLm_R2ogi5WElPaC3K5PL68";
        String answer = getMessageGetMe(token);

    }

    public static int division(int a, int b) {
        return a / b;
    }

    public static String getMessageGetMe(String token) throws IOException {
        URL url = new URL("https://api.telegram.org/bot" + token + "/getMe");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("Content-Type", "application/json");

        System.out.println(con.getResponseCode());
        BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
        Object obj = new JSONParser().parse(br.readLine());
        return "";
    }
}