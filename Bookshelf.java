import java.util.HashMap;

public class Bookshelf extends GameObject{

    public Bookshelf(){
	initializeHashMap();
    }

    String [] text = {"It's a overloaded bookshelf. There are 5 books, directories, 7 rubic cubes, pencils and notes."};
    String [] commands = {"checkbook1","checkbook2","checkbook3","checkbook4","checkbook5", "checkdirectory", "guitarstrings", "notes", "done", "takepaper"};
    String [] answers = {"It says <I am Legend> by Richard Matheson.",
			 "It says <1984> by George Orwell.",
			 "It says <Faust> by Johann Wolfgang von Goethe.",
			 "It says <Do Androids Dream of Electric Sheep?> by Phillip K. Dick.",
			 "It says <Alice in Wonderland> by Lewis Carroll.",
			 "There is blank paper in the directory.",
			 "You have taken the guitar strings.",
			 "The notes mention someting about feeding the neighbours dog.",
			 "You move back.",
			 "You have taken the paper."};

    private int update = commands.length - 1;
    
    public String toString2(){
	String result = "\033[34m" + text[0] + "\033[0";
    	System.out.println("\033[34m" + text[0] + "\033[0m");
	return result;
    }

    public String toStringC(){
	String result = "";
    	for(int i = 0; i < update; i++){
	    System.out.println(commands[i]);
	    result += commands[i]+"\n";
	}
	return result;
    }

    public String checkMap(String command){
	String result = "";
	System.out.println("\033[31;1m" + map1.get(command) + "\033[0m");
	result = "\033[31;1m" + map1.get(command) + "\033[0m";
	if(command.equals("checkdirectory")){
	    update++;
	}
	if(command.equals("takepaper")){
	    setStatus(5, true);
	}
	if(command.equals("guitarstrings")){
	    setStatus(4,true);
	}
	return result;
    }

    public void initializeHashMap(){
	for(int i = 0; i < commands.length; i++){
	    map1.put(commands[i], answers[i]);
	}
    }
}
