/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json;

import java.util.Set;
import org.json.simple.JSONObject;

/**
 *
 * @author ehaque
 */
public class ParseJson {
    public static void main(String[] args) {
        String input="{\r\n" + 
                "    \"Sample_01\": {\r\n" + 
                "        \"class\": \"Tenant\",\r\n" + 
                "        \"A1\": {\r\n" + 
                "            \"class\": \"Application\",\r\n" + 
                "            \"template\": \"http\"\r\n" + 
                "        }\r\n" + 
                "    },\r\n" + 
                "    \"Sample_02\": {\r\n" + 
                "        \"class\": \"Tenant\",\r\n" + 
                "        \"A2\": {\r\n" + 
                "            \"class\": \"Application\",\r\n" + 
                "            \"template\": \"http\"\r\n" + 
                "        }\r\n" + 
                "    }\r\n" + 
                "}";

        JSONObject jsonObject = new JSONObject(); 
       

        Set<String> keys =jsonObject.keySet();
        for(String key:keys) {
            System.out.println("Key :: "+key +", Value :: "+jsonObject.get(key));;
        }
    }
}
