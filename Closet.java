import java.util.HashMap;

public class Closet extends GameObject{
    
    public Closet(){
	initializeHashMap();
    }

    String [] text = {"The lights are turned of. It's so dark, you cannot see.", "It's a very small closet. There is a flushing cistern and spiders running behind it.", "A key is inside the water"};
    String [] commands = {"turnon", "flush", "opencistern", "done"};
    String [] answers = {"You turn on the lights. Suddenly you see a great amount of spiders and webs around you. You decide to turn the lights off again.",
			 "The toilet gets flushed. The smell disappears. You feel much better now.",
			 "You open the cistern and see a key inside.",
			 "You move back."};
    
    HashMap<String, String> map1 = new HashMap<String, String>();
    
    public void toString2(){
	System.out.println("\033[34m" + text[0] + "\033[0m");
    }

    public void toStringC(){
	for(int i = 0; i < commands.length; i++){
	    System.out.println(commands[i]);
	}
    }

    public void checkMap(String command){
	System.out.println("\033[31;1m" + map1.get(command) + "\033[0m");
    }

    public void initializeHashMap(){
	for(int i = 0; i < commands.length; i++){
	    map1.put(commands[i], answers[i]);
	}
    }
}
