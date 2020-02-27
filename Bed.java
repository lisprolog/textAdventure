import java.util.HashMap;

public class Bed extends GameObject{

    private int update = 5;
    
    public Bed(){
	initializeHashMap();
    }

    String [] text = {"The bed is blue. It has a pillow, a blanket. You can open the bed, you can look under the bed."};
    String [] commands = {"pillow", "blanket", "open", "lookunder", "done", "grabcable"};
    String [] answers = {"The pillow is dusty. Nothing special about it.",
			 "The blanket is even more dusty.",
			 "You open the bed. It is filled with toys and old newspapers.",
			 "As you move towards the floor, you hear cracking noises. Under the bed are lots of spider webs and you see a cable at the back.",
			 "You move back.",
			 "You look under the bed, close your eyes, grab into the spider webs and grab the plug cable."};
		 

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
	System.out.println("\033[31;1m" + map1.get(command) + "\033[0m");
	result = "\033[31;1m" + map1.get(command) + "\033[0m";
	if(command.equals("lookunder")){
	    update = 6;
	}
	if(command.equals("grabcable")){
	    setStatus(1, true);
	}
	return result;
    }

    public void initializeHashMap(){
	for(int i = 0; i < commands.length; i++){
	    map1.put(commands[i], answers[i]);
	}
    }
    
}
