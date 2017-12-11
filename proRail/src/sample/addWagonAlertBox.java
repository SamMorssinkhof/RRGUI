package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;

public class addWagonAlertBox {

    @FXML //Choiceboxes for picking the type of wagon
    ChoiceBox<String> choiceBoxWagonType = new ChoiceBox<>();
    @FXML //Choiceboxes for picking the type of goods
    ChoiceBox<String> choiceBoxGoodsType = new ChoiceBox<>();
    @FXML //Choiceboxes for picking 1st or 2nd class passenger wagon
    ChoiceBox<String> choiceBoxClassType = new ChoiceBox<>();



    public void display() throws Exception {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("addWagonAlertBox.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();

            Stage stage = new Stage();

            stage.setScene(new Scene(root1));

            stage.showAndWait();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void initialize(){
        //initialise choicebox content and hide goods and class box
        choiceBoxWagonType.getItems().addAll("Passenger", "Goods");
        choiceBoxGoodsType.getItems().addAll("Liquid", "Solid");
        choiceBoxClassType.getItems().addAll("First Class", "Second Class");
        choiceBoxGoodsType.setVisible(false);
        choiceBoxClassType.setVisible(false);

        //listen for changes
        choiceBoxWagonType.getSelectionModel().selectedItemProperty().addListener((v, oldValue, newValue) -> {
            if (newValue == "Passenger"){
                choiceBoxClassType.setVisible(true);
                choiceBoxGoodsType.setVisible(false);
            } else if (newValue == "Goods"){
                choiceBoxClassType.setVisible(false);
                choiceBoxGoodsType.setVisible(true);
            }
        });
    }

    public void addWagon () {
        if (choiceBoxWagonType.getValue() == "Passenger" && choiceBoxClassType.getValue() != null) {

        } else if (choiceBoxWagonType.getValue() == "goods" && choiceBoxGoodsType.getValue() != null) {

        } else {
            System.out.println("Fill in the values");
        }


    }
}
