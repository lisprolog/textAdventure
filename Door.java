import java.util.HashMap;

public class Door extends GameObject{

    //Not leaving when humidity 92%
    //not leaving when door guitar string missing
    //not leaving not printed
    //not leaving no shower
    
    public Door(){
	initializeHashMap();
    }
    
    String [] text = {"The door is closed and has a door spy."};
    String [] commands = {"open", "spy", "punch", "kick", "done", "unlock"};
    String [] answers = {"You can not open the door. It's locked.",
			 "You look out and see an old man walking the stairs.",
			 "You punch at the door. Your knuckles hurt.",
			 "You kick at the door. Nothing happens.",
			 "You move back.",
			 "You unlock the Door."};

    private int update = 5;
    
    HashMap<String, String> map1 = new HashMap<String, String>();
    
    public String toString2(){
	String result = "\033[34m" + text[0] + "\033[0";
    	System.out.println("\033[34m" + text[0] + "\033[0m");
	return result;
    }

    public String toStringC(){
	String result = "";
    	for(int i = 0; i < update; i++){
	    System.out.println(commands[i]);
	    result += commands[i]+"\n";
	}
	return result;
    }

    public String checkMap(String command){
	String result = "";

	if(command.equals("drinkcoffee")){
	    setStatus(6, true);
	    //answers[1] = "You look out and see a clown walking the stairs.";
	}
	
	if(command.equals("grabkey")){
	    update++;
	}

	if(getStatus(6)){
	    answers[1] = "You look out and see a clown walking the stairs.";
	}

	initializeHashMap();

	System.out.println("\033[31;1m" + map1.get(command) + "\033[0m");
	result = "\033[31;1m" + map1.get(command) + "\033[0m";
	
	return result;
    }

    public void initializeHashMap(){
	
	if(getStatus(6)){
	    answers[1] = "You look out and see a clown walking the stairs.";
	}
	
	for(int i = 0; i < commands.length; i++){
	    map1.put(commands[i], answers[i]);
	}
    }
}
