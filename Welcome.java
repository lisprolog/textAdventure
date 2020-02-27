public class Welcome extends GameObject{

    public Welcome(){
    }

    String [] text = {
	    "\033[34mYou are standing in a small room. It has limited space. You see a bed, a TV, a table, two spatial niches. One is supposed to be the kitchen, the other the bathroom. There is a window, a guitar, a printer, a closet, a bookshelf and the door out.\033[0m"
	};

    String [] commands = { "bed", "tv", "table", "kitchen", "bathroom", "window", "guitar", "printer", "bookshelf", "door", "closet", "quit"};

    public String toString2(){
	System.out.println(text[0]);
	return text[0];
    }

    public String toStringC(){
	String result = "";
	for(int i = 0; i < commands.length; i++){
	    System.out.println(commands[i]);
	    result += commands[i] + "\n";
	}
	return result;
    }
}

    
