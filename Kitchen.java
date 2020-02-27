import java.util.HashMap;

public class Kitchen extends GameObject{

    HashMap<String, String> map1 = new HashMap<String, String>();

    private int update = 5;

    public Kitchen(){
	initializeHashMap();
    }

    String [] text = {"There is a shelf, a fridge, a pot, and a cup."};
    String [] commands = {"openshelf", "openfridge", "openpot", "smellcup", "done", "drinkcoffee"};
    String [] answers = {"There is a muffin in the shelf.",
			 "There are mushrooms inside the fridge.",
			 "There are noodles inside the pot.",
			 "There is coffee in the cup.",
			 "You move back.",
			 "The coffee tastes weird. You feel a little dizzy."};
    
    public String toString2(){
	String result = "\033[34m" + text[0] + "\033[0m";
	System.out.println(result);
	return result;
    }

    public String toStringC(){
	String result = "";
	for(int i = 0; i < update; i++){
	    System.out.println(commands[i]);
	    result += commands + "\n";
	}
	return result;
    }

    public void initializeHashMap(){
	for(int i = 0; i < update; i++){
	    map1.put(commands[i], answers[i]);
	}
    }

    public String checkMap(String command){
	String result = "";

	if(command.equals("smellcup")){
	    update = 6;
	}
	if(command.equals("drinkcoffee")){
	    setStatus(6, true);
	}

	initializeHashMap();

	System.out.println("\033[31;1m" + map1.get(command) + "\033[0m");
	result = "\033[31;1m" + map1.get(command) + "\033[0m";
	
	return result;
    }  
}
