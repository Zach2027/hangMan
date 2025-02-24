import java.util.Scanner;
public class RunHangman {
    public void play(){
        CreatePhrase j = new CreatePhrase();        
        j.makePhrase();
        
        System.out.println("Which ever player gets the full word first wins");
        while(j.getMystery()  != j.getPhrase()){

        }
    }
   



}  
