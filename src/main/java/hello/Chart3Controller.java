package hello;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * Created by deya on 9/3/16.
 */
@Controller
public class Chart3Controller {
    @MessageMapping("/chart3")
    @SendTo("/topic/chart3")
    public Stats stats(StatsMessage message) throws Exception {
        Thread.sleep(1000); // simulated delay
        System.out.println("in chart3 controller...");
        System.out.println("msg in chart3 cont:"+ message.getName());
//        message.setName("[{\"key\": \"Cumulative Return\",\"values\": [{\"label\": \"A\",\"value\": 129.765957771107}, {\"label\": \"B\",\"value\": 1110}, {\"label\": \"C\",\"value\": 32.807804682612}, {\"label\": \"D\",\"value\": 196.45946739256}, {\"label\": \"E\",\"value\": 0.19434030906893}, {\"label\": \"F\",\"value\": 98.079782601442}, {\"label\": \"G\",\"value\": 13.925743130903}, {\"label\": \"H\",\"value\": 5.1387322875705}]}]");
        message.setName("[ { \"series\": 0 , \"x\":0 , \"y\":0 }, { \"series\": 0 , \"x\":1 , \"y\":0.5 } , {\"series\": 0 , \"x\":2 , \"y\":0.7} , {\"series\": 0 , \"x\":3 , \"y\":0.9} ,{\"series\": 0 , \"x\":4 , \"y\":0.99},{\"series\": 0 , \"x\":5 , \"y\":1.1},{\"series\": 0 , \"x\":6 , \"y\":1.2},{\"series\": 0 , \"x\":7 , \"y\":1.4},{\"series\": 0 , \"x\":8, \"y\":1.5},{\"series\": 0 , \"x\":9 , \"y\":1.4},{\"series\": 0 , \"x\":10 , \"y\":1.2},{\"series\": 0 , \"x\":11 , \"y\":1.1},{\"series\": 0 , \"x\":12 , \"y\":1.0},{\"series\": 0 , \"x\":13 , \"y\":1.3},{\"series\": 0 , \"x\":14 , \"y\":1.6},{\"series\": 0 , \"x\":15 , \"y\":1.9},{\"series\": 0 , \"x\":16 , \"y\":2.2},{\"series\": 0 , \"x\":17 , \"y\":2.4},{\"series\": 0 , \"x\":18 , \"y\":2.9},{\"series\": 0 , \"x\":19 , \"y\":2.5},{\"series\": 0 , \"x\":20 , \"y\":3.9},{\"series\": 0 , \"x\":21 , \"y\":4.9},{\"series\": 0 , \"x\":22 , \"y\":2.9} ]");


        //message.setName("[{key: 'Cumulative Return',values: [{'label' : 'A' ,'value' : 229.765957771107} ,{'label' : 'B' ,'value' : 1110} ,{'label' : 'C' ,'value' : 32.807804682612} ,{'label' : 'D' ,'value' : 196.45946739256},{'label' : 'E' ,'value' : 0.19434030906893} ,{'label' : 'F' ,'value' : 98.079782601442} ,{'label' : 'G' ,'value' : 13.925743130903} ,{'label' : 'H' ,'value' : 5.1387322875705}]}]");
//        JSONObject jo = new JSONObject;
//        JsonObject j = Json.create
//        jo.put("key","Cummulative Return");
        //jo.put("values",)
        System.out.println("chart3: about to return new value of message set name: "+ message.getName());
        //   return new Stats("Hello, " + message.getName() + "!");
        return new Stats(message.getName());
    }

}
