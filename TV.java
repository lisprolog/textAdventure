import java.util.HashMap;

public class TV extends GameObject{

    HashMap<String, String> map1 = new HashMap<String, String>();
    
    public TV(){
	initializeHashMap();
    }

    String [] text = {"The TV is a fancy flat screen. It is black and looks quite new."};
    String [] commands = { "on", "off", "check", "done"};
    String [] answers = {"Nothing happens.", "Nothing happens.", "You check the cables and the buttons, still not working.", "You move back.", "The TV turns on."};
    
    public String toString2(){
	System.out.println("\033[34m" + text[0] + "\033[0m");
	return "\033[34m" + text[0] + "\033[0m";
    }

    public String toStringC(){
	String result = "";
	for(int i = 0; i < commands.length; i++){
	    System.out.println(commands[i]);
	    result += commands[i];
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
	return "\033[31;1m" + map1.get(command) + "\033[0m";
    }
}
