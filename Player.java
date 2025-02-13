import java.util.Scanner;

public class Player {
    Scanner sc = new Scanner(System.in);
    p1Name = sc.nextLine();
    private int P1Score = 0;
    private int P2Score = 0;
    PlayerTurn player1 = new PlayerTurn();
}
public int getP1Score(){
    return P1Score;
}

public int getP2Score(){
    return P2Score;
}



public void addScore(String Player, int score){
    if (player1.isPlayer1Turn()){
        P1Score += score;
    }
    else{
        P2Score += score;
    }
}