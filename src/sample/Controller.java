package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    public Button btnButton;
    public TextField txtText;
    public Label lblLabel;
    public Model model = new Model();

    public void handleButtonClick(ActionEvent actionEvent) {
        model.increment();
        lblLabel.setText(String.valueOf(model.getCount()));
    }
}
