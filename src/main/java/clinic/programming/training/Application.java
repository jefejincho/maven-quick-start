package clinic.programming.training;

public class Application {
    
    public Application() {
        System.out.println ("Inside Application");
    }

    public int countWords(String input) {
		if (input == null || input.isEmpty()) {
           return 0;
        }

        String[] words = input.split("\\s+");
        return words.length;
	}
	
    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
	    Application app = new Application();
    }
}
