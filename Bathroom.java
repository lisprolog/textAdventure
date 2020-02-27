import java.util.HashMap;

public class Bathroom extends GameObject{

    HashMap<String, String> map1 = new HashMap<String, String>();
    private int update = 6;
    
    public Bathroom(){
	initializeHashMap();
    }

    String [] text = {"The bathroom is tiny. There is a sink for brushing teeth and one for taking a shower. There is cologne, a toothbrush, a soap, and a towel."};
    String [] commands = {"cologne", "toothbrush", "soap", "towel", "shower", "done", "hygro"};
    String [] answers = {"It's a cologne. It smells nice.",
			 "A used toothbrush. You don't want to use it.",
			 "You use the soap. Your hands are clean now.",
			 "You take the towel.",
			 "You take a shower.",
			 "You move back.",
			 "The hygrometer says nothing."};

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

	if(command.equals("shower")){
	    answers[6] = "The hygrometer says 92% Humidity.";
	    setStatus(3, false);
	    update = 7;
	}
	if(command.equals("openwindow")){
	    answers[6] = "The hygrometer says 55% Humidity.";
	    setStatus(3, true);
	}
	
	initializeHashMap();

	System.out.println("\033[31;1m" + map1.get(command) + "\033[0m");
	result = "\033[31;1m" + map1.get(command) + "\033[0m";
	
	return result;
    }
    
    public void initializeHashMap(){
	
	if(getStatus(3)){
	    answers[6] = "The hygrometer says 55% Humidity.";
	}else{
	    answers[6] = "The hygrometer says 92% Humidity.";
	}
	
	for(int i = 0; i < commands.length; i++){
	    map1.put(commands[i], answers[i]);
	}
    }
}
