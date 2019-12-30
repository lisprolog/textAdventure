import java.util.HashMap;

public class Window extends GameObject{
    
    public Window(){
	initializeHashMap();	
    }

    String [] text = {"The curtains are close-drawn. You cannot see."};

    String [] commands = {"curtains", "openwindow", "closewindow", "done"};
    String [] answers = {"The windows are closed. As you open them, a pigeon flies away scared. You can see the neighbors having an argument.",
			 "The window opens and the muggy air flows out.",
			 "The windows are closed now.",
			 "done."};

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
