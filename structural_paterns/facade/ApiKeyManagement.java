package structural_paterns.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ApiKeyManagement {
    private List<StringBuilder> apiKeys;

    public ApiKeyManagement(){
        this.apiKeys = new ArrayList<>();
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

    public StringBuilder provideApikey(){
        StringBuilder apiKey = this.generateApiKey();
        this.apiKeys.add(apiKey);
        return apiKey;
    }

    public Boolean verifyApiKey(StringBuilder apiKey){
        return this.apiKeys.contains(apiKey);
    }
}
