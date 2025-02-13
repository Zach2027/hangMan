import java.util.Scanner;

public class CreatePhrase {
    private static String word = "";

    private static String[] words = {"hello","one","skiing","time","zig","zag","staff","witch","which","twitch"};
    
    public String getPhrase(){
        return word;
    }
    public static void makePhrase(){
        int choice = (int) (Math.random() *  words.length);
        word = words[choice];

        String mystery = " ";

        for (int i = 0; i < word.length(); i ++){

            mystery += "_";
        }




    }
    

}
