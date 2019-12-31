import java.util.HashMap;
import java.util.Scanner;
//import java.io.Console;

public class TextAdventure{

    public static GameObject o1;
    
    public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	boolean run = true;
	boolean run2 = true;
	int status = 0;
	
	String command = "";

	HashMap<String, GameObject> bigMap = new HashMap<String, GameObject>();
	Bed b1 = new Bed();
	bigMap.put("bed", b1);
	TV tv1 = new TV();
        bigMap.put("tv", tv1);
	Table t1 = new Table();
        bigMap.put("table", t1);
	Kitchen k1 = new Kitchen();
	bigMap.put("kitchen", k1);
        Bathroom br1 = new Bathroom();
        bigMap.put("bathroom", br1);
	Window win1 = new Window();
        bigMap.put("window", win1);
	Guitar g1 = new Guitar();
        bigMap.put("guitar", g1);
	Printer p1 = new Printer();
        bigMap.put("printer", p1);
	Bookshelf bs1 = new Bookshelf();
        bigMap.put("bookshelf", bs1);
 	Door d1 = new Door();
        bigMap.put("door", d1);	
	Closet c1 = new Closet();
        bigMap.put("closet", c1);
        Welcome w1 = new Welcome();
	//out while: choose <object>
	while(run){
	    
	    System.out.println("................................................................................................................................................................................................................................................................................................................................................................................................");
	    w1.toString2();
	    System.out.println("................................................................................................................................................................................................................................................................................................................................................................................................");
	    System.out.println("commands:");
	    w1.toStringC();
	    //System.out.println("next move:");
	    command = sc.next();
	    if(command.equals("quit")){
		    run = false;
	    }else{
		    if(bigMap.get(command) == null){
			run2 = false;
		    }else{
			o1 = bigMap.get(command);
		    }
	    //inner while: choose <option>
		    while(run2){
			System.out.println("................................................................................................................................................................................................................................................................................................................................................................................................");
			o1.toString2();
			System.out.println("................................................................................................................................................................................................................................................................................................................................................................................................");
			o1.toStringC();
			command = sc.next();
			if(command.equals("done")){
			    run2 = false;
			}else if (command.equals("quit")){
			    run2 = false;
			    run = false;
			}else{
			    System.out.println("################################################################################################################################################################################################");
			    try{
				status = o1.checkMap(command);
			    }catch(NullPointerException e){
				o1.checkMap(command);
				System.out.println("Error!");
			    }     
			    System.out.println("################################################################################################################################################################################################");
			}
		    }//while end
	    }//else end
	    run2 = true; //to get into second while again
	}
    }
}
