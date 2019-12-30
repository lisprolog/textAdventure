import java.util.HashMap;

public class Table extends GameObject{

    HashMap<String, String> map1 = new HashMap<String, String>();
    
    public Table(){
	initializeHashMap();
    }
    
    String [] text = {"The table is full of notes, a calender, glas bottles, a computer, a smartphone, a plant and a dish with chinese food."};
    String [] commands = {"notes", "calendar", "bottle", "computer", "smartphone", "plant", "chinese", "done"};
    String [] answers = {"You cannot read the notes.",
			 "The calendar says today is Friday the 13th.",
			 "One bottle is filled with a coffein drink. The label says <Mate>",
			 "The Computer is not plugged in", "The smartphone is turned off",
			 "The plant is dry", "The food looks like beef chop suey.",
			 "You move back."};
    
    public void toString2(){
	System.out.println("\033[34m" + text[0] + "\033[0m");
    }

    public void toStringC(){
	for(int i = 0; i < commands.length; i++){
	    System.out.println(commands[i]);
	}
    }

    public void initializeHashMap(){
	for(int i = 0; i < commands.length; i++){
	    map1.put(commands[i], answers[i]);
	}
    }

    public void checkMap(String command){
	System.out.println("\033[31;1m" + map1.get(command) + "\033[0m");
    }   
}
