import java.util.HashMap;

public class Door extends GameObject{
    public Door(){
	initializeHashMap();
    }

    String [] text = {"the door is closed and has a door spy"};
    String [] commands = {"open", "spy", "punch", "kick"};
    String [] answers = {"You can not open the door. It's locked.", "You look out and see somebody running away.", "You punch at the door. Nothing happens.", "You kick at the door. Nothing happens."};


    HashMap<String, String> map1 = new HashMap<String, String>();
    
    public void toString2(){
	System.out.println("\033[34m" + text[0] + "\033[0m");
    }

    public void toStringC(){
	for(int i = 0; i < commands.length; i++){
	    System.out.println(commands[i]);
	}
    }

    public void checkMap(String command){
	System.out.println("\033[31;1m" + map1.get(command) + "\033[0m");
    }

    public void initializeHashMap(){
	for(int i = 0; i < commands.length; i++){
	    map1.put(commands[i], answers[i]);
	}
    }

}
