public class PlayerTurn {
  Boolean player1turn = true;
  public Boolean isPlayer1Turn(){
    return player1turn;
  }
  public void switchTurn() {
   if(player1turn){
    player1turn = false;
   }
   else{
    player1turn= true;
   }

  }
}
