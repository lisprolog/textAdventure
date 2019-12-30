import java.util.HashMap;

public class Bookshelf extends GameObject{

    public Bookshelf(){
	initializeHashMap();
    }

    String [] text = {"It's a overloaded bookshelf. There are 10 books, 5 directories, 7 rubic cubes, paper, pencils and notes"};
    String [] commands = {"checkbook", "checkfolder", "takepaper", "takepencil", "notes", "done"};
    String [] answers = {"It's a book an neuroses",
			 "The folder is empty",
			 "You have taken the paper.",
			 "You have taken the pencil.",
			 "The notes mention someting about feeding the neighbours dog.",
			 "You move back."};

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
