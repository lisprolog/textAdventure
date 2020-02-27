import java.util.HashMap;

public class GameObject{

    int counter;

    HashMap<String, String> map1 = new HashMap<String, String>();
    
    String[] text;

    String[] commands;

    String[] answers;

    static boolean[] status = {false, false, false, false, false, false, false, false, false, false};
	
    /*
      0
      1 grabcable
      2 remote
      3 hygro
      4 guitar string
      5 takepaper
      6 coffee/clown
      7 
      8
      9
      10
     */
    
    public GameObject(){  
    }
    
    public String toString2(){
	return "";
    }

    public String toStringC(){
	return "";
    }

    public String checkMap(String command){
	return "";
    }

    public void setStatus(int index, boolean b){
	status[index] = b;
    }

    public boolean getStatus(int index){
	return status[index];
    }
    
    public void initializeHashMap(){
    }
}
