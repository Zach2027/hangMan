import java.util.Scanner;
string[] knownguess = new string[getPhrase.length]

public class CheckPhrase {
    scanner sc = new scanner(system.in);
    String hiden = getPhrase();
    String guess = "";
    System.out.println("make your guess (1 letter)");
    guess = sc.nextLine();
    for(int i = 0; i < hiden.length;  i++;){
        if(guess.equals(hiden.substring(i,i+1))){
            if(i > 0){
            mystery = mystery.substring(0, i-1) + guess + mystery.substring(i+1);
            }
            else{
                mystery = guess + Myster.substring(i);
            }
        }
    }
}
