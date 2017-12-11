package sample;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class Controller {

    @FXML //Choicebox for the selection of a train
    ChoiceBox<String> choiceBoxAllTrains = new ChoiceBox<>();

    @FXML //Listview for list of wagons
    ListView<String> listViewWagons;


    //Labels for Wagon information
    @FXML
    Label labelClass;

    @FXML
    Label labelChairs;

    @FXML
    Label labelType;

    @FXML
    Label labelContent;


    public void addTrain() throws Exception{
        addTrainAlertBox addTrain = new addTrainAlertBox();

        addTrain.display();

    }

    public void addWagon() throws Exception{
        addWagonAlertBox addWagon = new addWagonAlertBox();

        addWagon.display();

    }

    public void deleteTrain () throws Exception{
    }

    public void initialize (){
        //get all the trains



        //listener for trainselection, puts all the wagons in the ListView and projects a train
        listViewWagons.getItems().addAll("Wagon 1", "Wagon 2");
        choiceBoxAllTrains.getSelectionModel().selectedItemProperty().addListener((v, oldValue, newValue) -> {
                });

        //listener for wagonselection, puts all the info into the labels
        listViewWagons.getSelectionModel().selectedItemProperty().addListener((v, oldValue, newValue) -> {
                 });


        //hiding/showing wagon information labels
        labelClass.setVisible(false);
        labelChairs.setVisible(false);
        labelType.setVisible(false);
        labelContent.setVisible(false);


    }
}
