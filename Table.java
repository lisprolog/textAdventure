import java.util.HashMap;

public class Table extends GameObject{

    HashMap<String, String> map1 = new HashMap<String, String>();
    
    public Table(){
	initializeHashMap();
    }

    private int update = 8;
    
    String [] text = {"The table is full of notes, a calender, glas bottles, a computer, a smartphone, a plant and a dish with chinese food."};
    String [] commands = {"notes", "calendar", "bottle", "laptop", "smartphone", "plant", "chinese", "done"};
    String [] answers = {"You cannot read the notes.",
			 "The calendar says today is Friday the 13th.",
			 "One bottle is filled with a drink. The label says <Mate>.",
			 "The laptop is not plugged in.",
			 "The smartphone is turned off.",
			 "The plant is dry.",
			 "The food looks like beef chop suey.",
			 "You move back."};
    
    public String toString2(){
	String result = "\033[34m" + text[0] + "\033[0m";
	System.out.println(result);
	return result;
    }

    public String toStringC(){
	String result = "";
	for(int i = 0; i < update; i++){
	    System.out.println(commands[i]);
	    result += "\033[34m" + commands[i] + "\033[0m";
	}
	return result;
    }

    public void initializeHashMap(){
	for(int i = 0; i < commands.length; i++){
	    map1.put(commands[i], answers[i]);
	}
    }

    public String checkMap(String command){
	System.out.println("\033[31;1m" + map1.get(command) + "\033[0m");
	return "What?";
    }   
}
