import java.util.HashMap;

public class Guitar extends GameObject{
    
    public Guitar(){
	initializeHashMap();
    }

    private int update = 3;

    String [] text = {"The guitar is dusty. It seems to be a cheap western guitar with metal strings attached.", };
    String [] commands = {"lift","play", "done", "stringOn", "playAgain" };
    String [] answers = {"A spider runs away as you lift the guitar.",
			 "A string is missing, you cannot play the guitar.",
			 "You move back.",
			 "You put the string on the guitar.",
			 "You play <Stairway to Heaven>."};

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
	
	if(getStatus(4)){
	    update = 5;//guitar string on
	}

	initializeHashMap();
	
	return result;
    }

    public void initializeHashMap(){
	for(int i = 0; i < update; i++){
	    map1.put(commands[i], answers[i]);
	}
    }

}
