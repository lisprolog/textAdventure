import java.util.HashMap;

public class Printer extends GameObject{

    HashMap<String, String> map1 = new HashMap<String, String>();
    
    public Printer(){
	initializeHashMap();
    }

    String [] text = {"The printer is dusty.", "A cartridge is missing", "There is no connection between the printer and the computer", "Paper is missing"};
    String [] commands = {"turnon", "turnoff", "plugcable", "plugcartridge", "placepaper"};
    String [] answers = {"Nothing happens", "Nothing happens", "You plug in the cable.", "You put the cartridge inside the printer.", "You place paper into the printer."};
    
    public void toString2(){
	System.out.println("\033[34m" + text[0] + "\033[0m");
    }

    public void toStringC(){
	for(int i = 0; i < text.length; i++){
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
