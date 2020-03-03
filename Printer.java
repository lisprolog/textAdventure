import java.util.HashMap;

public class Printer extends GameObject{

    HashMap<String, String> map1 = new HashMap<String, String>();

    private int update = 2;

    
    private static boolean cableKeep, cablePlugged, paperKeep, paperPlaced  = false;

    String [] text = {"The printer is dusty."};
    String [] commands = {"pushbutton", "done", "plugcable", "placepaper"};
    String [] answers = {"Nothing happens.",
			 "You move back.",
			 "You put a cable into the printer and a plug.",
			 "You place paper into the printer."};
    
    public Printer(){

	if(getStatus(1) && !getStatus(5)){ //grabcable(Bed) without paper
	    update = 3; //plugcable command
	}

	if(getStatus(5) && !getStatus(1)){ //no cable(Bed) with paper
	    update = 3; //plugcable command
	    commands[2] = "placepaper";
	    commands[3] = "plugcable";
	    answers[2]= "You place paper into the printer";
	    answers[3]= "You put a cable into the printer and a plug.";
	}

	if(getStatus(1) && getStatus(5)){
	    update = 4;
	}
	
	initializeHashMap();
    }
   
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

	if(command.equals("plugcable") && getStatus(1)){
	    setStatus(7,true);
	}
	    
	if(command.equals("placepaper") && getStatus(5)){
	    setStatus(8,true);
	}
	
	if(command.equals("pushbutton")){
	    if(getStatus(7) && getStatus(8)){
		answers[0] = "The printer prints: Say <goodbye> before you leave.";
		setStatus(9,true);
	    }
	}
	
	if(getStatus(1) && !getStatus(5)){ //grabcable(Bed)
	    update = 3; //plugcable command
	}else if(getStatus(5) && !getStatus(1)){ //in case he grabs the papers before cable
	    update = 3;
	    commands[2] = "placepaper";
	    commands[3] = "plugcable";
	    answers[2]= "You place paper into the printer";
	    answers[3]= "You put a cable into the printer and a plug.";
	}

	if(getStatus(5) && getStatus(5)){
	    update = 4;
	}

	initializeHashMap();

	System.out.println("\033[31;1m" + map1.get(command) + "\033[0m");
	result = "\033[31;1m" + map1.get(command) + "\033[0m";
	
	return "Whaat?";
    }
}
