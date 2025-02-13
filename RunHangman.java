import java.util.Scanner;
public class RunHangman {
    public void play(){
        CreatePhrase j = new CreatePhrase();
        System.out.println("player one, enter your name");
        
        j.makePhrase();
        System.out.println(j.getPhrase());
    }
   



}  
