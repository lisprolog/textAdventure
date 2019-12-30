import java.util.HashMap;

public class Guitar extends GameObject{
    
    public Guitar(){
	initializeHashMap();
    }

    String [] text = {"The guitar is dusty. It seems to be a cheap western guitar with metal strings attached.", };
    String [] commands = {"lift", "play", };
    String [] answers = {"A spider runs away as you lift the guitar", "A String is missing, you cannot play the guitar"};

    HashMap<String, String> map1 = new HashMap<String, String>();
    
    public void toString2(){
	System.out.println("\033[34m" + text[0] + "\033[0m");
    }

    public void toStringC(){
	for(int i = 0; i < text.length; i++){
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
