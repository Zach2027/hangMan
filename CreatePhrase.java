import java.util.Scanner;

public class CreatePhrase {
    private static String word = "";
    private String mystery = "";
    private static String[] words = {"hello","one","skiing","time","zig","zag","staff","witch","which","twitch"};
    
    public final String getPhrase(){
        return word;
    }
    public void makePhrase(){
        int choice = (int) (Math.random() *  words.length);
        word = words[choice];

        mystery = " ";

        for (int i = 0; i < word.length(); i ++){

            mystery += "_";
        }

    public void getMystery(){
        return mystery;
        }


    }
    

}
