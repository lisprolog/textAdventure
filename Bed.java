import java.util.HashMap;

public class Bed extends GameObject{
    
    public Bed(){
	initializeHashMap();
    }

    String [] text = {"The bed is blue. It has a pillow, a blanket. You can open the bed, you can look under the bed."};
    String [] commands = {"pillow", "blanket", "open", "lookunder", "done"};
    String [] answers = {"The pillow is dusty. Nothing special about it.",
			 "The blanket is even more dusty.",
			 "You open the bed. It is filled with toys and old newspapers.",
			 "As you move towards the floor, you hear cracking noises. Under the bed are lots of spider webs and you see a cable at the back.",
			 "You move back."};

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
