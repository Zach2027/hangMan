import java.util.Scanner;

public class CheckPhrase {
    private Scanner sc = new Scanner(System.in);
    private String guess = "";
    public void checkGuess(String word, String mystery) {
        System.out.println("make your guess (1 letter)");
        String guess = sc.nextLine();
        for(int i = 0; i < word.length();  i++){
            if(guess.equals(word.substring(i,i+1))){
                if(i > 0){
                mystery = mystery.substring(0, i-1) + guess + mystery.substring(i+1);
                }
                else{
                    mystery = guess + mystery.substring(i+1);
                }
            }
            
            
        }

        System.out.println(mystery);
    }
    
}
