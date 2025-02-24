import java.util.Scanner;
public class RunHangman {
    public void play(){
        CreatePhrase j = new CreatePhrase();        
        j.makePhrase();
        PlayerTurn a = new PlayerTurn();
        CheckPhrase b = new CheckPhrase();
        System.out.println("Which ever player gets the full word first wins ");
        String last = "";
        while(! j.getMystery().equals(j.getPhrase())){
            if(a.isPlayer1Turn()){
                System.out.print("Player 1 your up ");
            }
            else{
                System.out.print("Player 2 your up ");
            }
            last = j.getMystery();
            b.checkGuess(j.getPhrase(),j);
            if(last.equals(j.getMystery())){
                a.switchTurn();
            }
        }
        if(a.isPlayer1Turn()){
            System.out.print("Player One you Win. The word was " + j.getMystery());
        }
        else{
            System.out.print("Player Two you Win. The word was " + j.getMystery());
        }
    }
   



}  
