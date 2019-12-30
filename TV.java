import java.util.HashMap;

public class TV extends GameObject{

    HashMap<String, String> map1 = new HashMap<String, String>();

    private boolean setTV = false;
    
    public TV(){
	initializeHashMap();
    }

    String [] text = {"The TV is a fancy flat screen. It is black and looks quite new."};
    String [] commands = { "on", "off", "check", "done"};
    String [] answers = {"Nothing happens.", "Nothing happens.", "The plug cable seems to be broken.", "You move back."};
    
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
    
    public void setTV(){
	setTV = true;
	answers[3] = "The cable is switched. Hopefully it works now.";
    }
}
