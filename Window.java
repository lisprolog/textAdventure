import java.util.HashMap;

public class Window extends GameObject{
    
    public Window(){
	initializeHashMap();	
    }

    String [] text = {"The curtains are close-drawn. You cannot see."};

    String [] commands = {"curtains", "openwindow", "closewindow", "done"};
    String [] answers = {"The curtains are closed. As you open them, a pigeon flies away scared. You can see a young couple walking a dog. The man looks angry, the woman is holding the dog.",
			 "The window opens and the muggy air flows out.",
			 "The windows are closed now.",
			 "done."};

    HashMap<String, String> map1 = new HashMap<String, String>();
    
    public String toString2(){
	String result = "\033[34m" + text[0] + "\033[0m";
	System.out.println(result);
	return result;
    }

    public String toStringC(){
	String result = "";
	for(int i = 0; i < commands.length; i++){
	    System.out.println(commands[i]);
	    result += commands[i] + "\n";
	}
	return result;	
    }

    public void initializeHashMap(){
	for(int i = 0; i < commands.length; i++){
	    map1.put(commands[i], answers[i]);
	}
    }

    public String checkMap(String command){

	if(command.equals("openwindow")){
	    setStatus(3, true);
	}
	
	initializeHashMap();
	
	String result = "\033[31;1m" + map1.get(command) + "\033[0m";
	System.out.println(result);
	return result;
    }
}
