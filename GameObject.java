import java.util.HashMap;

public class GameObject{

    int counter;

    HashMap<String, String> map1 = new HashMap<String, String>();
    
    String[] text;

    String[] commands;

    String[] answers;
    
    public GameObject(){  
    }

    public void toString2(){
	for(int i = 0; i < this.text.length; i++){
	    System.out.println(this.text[i]);
	}
    }

    public void toStringC(){
	//System.out.println(this.commands[this.counter]);
    }

    public void checkMap(String command){
    }

    
    public void initializeHashMap(){
	for(int i = 0; i < commands.length; i++){
	    map1.put(this.commands[i], this.answers[i]);
	}
    }
}
