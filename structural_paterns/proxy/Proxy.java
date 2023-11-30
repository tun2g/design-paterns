package structural_paterns.proxy;

import structural_paterns.adapter.CalculateService;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Proxy {
    private CalculateService calculateService;

    private List<StringBuilder> apiKeys;

    public Proxy(){
        this.calculateService = new CalculateService();
        this.apiKeys = new ArrayList<>();
    }

    public Integer callSum(int x,int y, StringBuilder apiKey){
        if(this.verifyApiKey(apiKey) == false){
            return null;
        }
        return this.calculateService.callSum(x,y);
    }

    public Integer callDif(int x,int y, StringBuilder apiKey){
        if(this.verifyApiKey(apiKey) == false){
            return null;
        }
        return this.calculateService.callDifferent(x,y);
    }

    private StringBuilder generateApiKey(){
        int length = 10;

        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        Random random = new Random();

        StringBuilder randomString = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            char randomChar = characters.charAt(index);
            randomString.append(randomChar);
        }
        return randomString;
    }

    public StringBuilder requestApiKey(){
        StringBuilder apiKey = this.generateApiKey();
        this.apiKeys.add(apiKey);
        return apiKey;
    }

    public Boolean verifyApiKey(StringBuilder apiKey){
        return this.apiKeys.contains(apiKey);
    }
}
