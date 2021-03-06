package bullsandcows;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Spinner;
import javafx.scene.control.TableView;

public class Controller {

    private int currentTurn = 0;
    public Spinner<Integer> num1;
    public Spinner<Integer> num2;
    public Spinner<Integer> num3;
    public Spinner<Integer> num4;
    public TableView<TurnResult> turnsTable;

    public void initialize() {

    }

    public void go() {
        currentTurn++;

        int n1 = num1.getValue();
        int n2 = num2.getValue();
        int n3 = num3.getValue();
        int n4 = num4.getValue();
        String guess = "" +n1 +n2 +n3 +n4;

        TurnResult tr = new TurnResult();
        tr.setTurnNr(currentTurn);
        tr.setGuess(guess);

        turnsTable.getItems().add(0, tr);
        System.out.println(guess);
    }
}
