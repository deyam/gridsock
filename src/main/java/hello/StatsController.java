package hello;

//import org.json.JSONObject;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * Created by deya on 9/3/16.
 */
@Controller
public class StatsController {


    @MessageMapping("/mon")
    @SendTo("/topic/mon")
    public Stats stats(StatsMessage message) throws Exception {
        Thread.sleep(1000); // simulated delay
        System.out.println("in stats controller...");
        System.out.println("msg in stats cont:"+ message.getName());
        //message.setName("'A':100, 'B':{1,2,3}");
//        message.setName("[{'key': 'Cumulative Return','values': [{'label' : 'A' ,'value' : 229.765957771107} ,{'label' : 'B' ,'value' : 1110} ,{'label' : 'C' ,'value' : 32.807804682612} ,{'label' : 'D' ,'value' : 196.45946739256},{'label' : 'E' ,'value' : 0.19434030906893} ,{'label' : 'F' ,'value' : 98.079782601442} ,{'label' : 'G' ,'value' : 13.925743130903} ,{'label' : 'H' ,'value' : 5.1387322875705}]}]");
        //message.setName("[{key: 'Cumulative Return',values: [{label : 'A' ,value : 229.765957771107} ,{label : 'B' ,value : 1110} ,{label : 'C' ,value : 32.807804682612} ,{label : 'D' ,value : 196.45946739256},{label : 'E' ,value : 0.19434030906893} ,{label : 'F' ,value : 98.079782601442} ,{label : 'G' ,value : 13.925743130903} ,{label : 'H' ,value : 5.1387322875705}]}]");
        message.setName("[{\"key\": \"Cumulative Return\",\"values\": [{\"label\": \"A\",\"value\": 129.765957771107}, {\"label\": \"B\",\"value\": 1110}, {\"label\": \"C\",\"value\": 32.807804682612}, {\"label\": \"D\",\"value\": 196.45946739256}, {\"label\": \"E\",\"value\": 0.19434030906893}, {\"label\": \"F\",\"value\": 98.079782601442}, {\"label\": \"G\",\"value\": 13.925743130903}, {\"label\": \"H\",\"value\": 5.1387322875705}]}]");


        //message.setName("[{key: 'Cumulative Return',values: [{'label' : 'A' ,'value' : 229.765957771107} ,{'label' : 'B' ,'value' : 1110} ,{'label' : 'C' ,'value' : 32.807804682612} ,{'label' : 'D' ,'value' : 196.45946739256},{'label' : 'E' ,'value' : 0.19434030906893} ,{'label' : 'F' ,'value' : 98.079782601442} ,{'label' : 'G' ,'value' : 13.925743130903} ,{'label' : 'H' ,'value' : 5.1387322875705}]}]");
//        JSONObject jo = new JSONObject;
//        JsonObject j = Json.create
//        jo.put("key","Cummulative Return");
        //jo.put("values",)
        System.out.println("about to return new value of message set name: "+ message.getName());
     //   return new Stats("Hello, " + message.getName() + "!");
        return new Stats(message.getName());
    }

}
