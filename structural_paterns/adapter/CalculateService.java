package structural_paterns.adapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CalculateService{

    private List<StringBuilder> apiKeys;

    public CalculateService(){
        this.apiKeys = new ArrayList<>();
    }

    public int callSum(int x, int y){
        int sum = x + y;
        return sum;
    }

    public int callDifferent(int x, int y){
        return x - y;
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
