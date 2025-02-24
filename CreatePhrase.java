import java.util.Scanner;

public class CreatePhrase {
    private static String word = "";
    private String mystery = "";
    private static String[] words = {"hello", "one", "skiing", "time", "zig", "zag", "staff", "witch", "which", "twitch", "abruptly", "banjo", "headsman", "tailsman","cutthroat", "jazz", "assassin", "quiz"};
    
    // Getter for word
    public final String getPhrase(){
        return word;
    }
    
    
    public String makePhrase(){
        int choice = (int) (Math.random() * words.length);
        word = words[choice];

        mystery = "";  

        for (int i = 0; i < word.length(); i++) {
            mystery += "_";
        }

        return mystery;  
    }

    
    public String getMystery(){
        return mystery;
    }
    public void setMystery(String s){
         mystery= s;
    }
}
