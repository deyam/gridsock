package hello;

/**
 * Created by deya on 9/3/16.
 */
public class Stats {
    private String content;
    private String mon1;
//message.setName("[{key: 'Cumulative Return',
// values: [{label : 'A' ,'value' : 229.765957771107} ,{label : 'B' ,'value' : 1110} ,{label : 'C' ,'value' : 32.807804682612} ,{label : 'D' ,'value' : 196.45946739256},{label : 'E' ,'value' : 0.19434030906893} ,{label : 'F' ,'value' : 98.079782601442} ,{label : 'G' ,'value' : 13.925743130903} ,{label : 'H' ,'value' : 5.1387322875705}]}]");

    public void setContent(String content) {
        this.content = content;
    }

    public String getMon1() {
        return mon1;
    }

    public void setMon1(String mon1) {
        this.mon1 = mon1;
    }

    public Stats() {

    }
    public Stats(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

}
