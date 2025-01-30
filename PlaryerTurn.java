public class PlaryerTurn {
  private int whoesTurn = 0;
  private boolean player1Turn = true;

  

  public void switchTurn() {
    whoesTurn++;
    if (whoesTurn % 2 == 0) {
      player1Turn = true;
    } else {
      player1Turn = false;
    }
  }
}
