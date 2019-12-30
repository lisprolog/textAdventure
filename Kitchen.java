import java.util.HashMap;

public class Kitchen extends GameObject{

    HashMap<String, String> map1 = new HashMap<String, String>();

    public Kitchen(){
	initializeHashMap();
    }

    String [] text = {"There is a shelf, a fridge, a pot, and a cup"};
    String [] commands = {"openshelf", "openfridge", "openpot", "smellcup", "done"};
    String [] answers = {"There is a muffin in the shelf.",
			 "There are mushrooms inside the fridge",
			 "There are noodles inside the pot.",
			 "There is coffee in the cup.",
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
