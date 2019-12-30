import java.util.HashMap;

public class Bathroom extends GameObject{

    HashMap<String, String> map1 = new HashMap<String, String>();
    boolean set = true;
    public Bathroom(){
	initializeHashMap();
    }

    String [] text = {"the bathroom is tiny. There is a sink for brushing teeth and one for taking a shower. There is cologne, a toothbrush, a hygrometer, a soap, a towel."};
    String [] commands = {"cologne", "toothbrush", "hygro", "soap", "towel", "shower"};
    String [] answers = {"You put on some cologne. It smells nice. Like a boss!", "A used toothbrush. Useless to you.", "the hygrometer says 92% Humidity.", "You use the soap. Your hands are clean now.", "You take the towel.", "You take a shower. You realise that the floor became wet for some weird reason."};


    public void setHygro(){
	if(set){
	    set = false;
	    answers[3] = "The hygrometer says 55% Humidity";
	}else{
	    set = true;
	    answers[3] = "The hygrometer says 92% Humidity";
	}
    }

    
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
}
