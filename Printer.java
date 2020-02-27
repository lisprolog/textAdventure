import java.util.HashMap;

public class Printer extends GameObject{

    HashMap<String, String> map1 = new HashMap<String, String>();
    
    public Printer(){

	if(status[1] && !status[5]){ //grabcable(Bed) without paper
	    update = 3; //plugcable command
	}
	
	initializeHashMap();
    }

    private int update = 2;
    private boolean cableKeep, cablePlugged, paperKeep, paperPlaced  = false;
    
    String [] text = {"The printer is dusty."};
    String [] commands = {"pushbutton", "done", "plugcable", "placepaper"};
    String [] answers = {"Nothing happens.",
			 "You move back.",
			 "You put a cable into the printer and a plug.",
			 "You place paper into the printer."};
    
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
	for(int i = 0; i < update; i++){
	    map1.put(commands[i], answers[i]);
	}
    }

    public String checkMap(String command){
	
	String result = "";

	if(command.equals("plugcable") && status[1]){
	    cablePlugged = true;
	}
	    
	if(command.equals("placepaper") && status[5]){
	    paperPlaced = true;
	}
	
	if(command.equals("pushbutton")){
	    if(cablePlugged && paperPlaced){
		answers[0] = "The printer prints: Say <goodbye> before you leave.";
	    }
	}
	
	if(status[1] && !status[5]){ //grabcable(Bed)
	    update = 3; //plugcable command
	}else if(status[5] && !status[1]){ //in case he grabs the papers before cable
	    update = 3;
	    commands[2] = "placepaper";
	    commands[3] = "plugcable";
	    answers[2]= "You place paper into the printer";
	    answers[3]= "You put a cable into the printer and a plug.";
	}

	initializeHashMap();

	System.out.println("\033[31;1m" + map1.get(command) + "\033[0m");
	result = "\033[31;1m" + map1.get(command) + "\033[0m";
	
	return "Whaat?";
    }
}
