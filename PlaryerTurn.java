public class PlaryerTurn {
  private int whoesTurn = 1;
  private boolean player1Turn = true;

  public void switchTurn() {
    if (whoesTurn % 2 == 0) {
      player1Turn = true;
    } else {
      player1Turn = false;
    }
    whoesTurn++;
  }
}
