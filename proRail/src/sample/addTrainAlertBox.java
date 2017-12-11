package sample;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.geometry.*;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;



public class addTrainAlertBox {
    Stage stage;

    @FXML //textfield input for adding a name
    TextField nameInput;

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void display() throws Exception {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("addTrainAlertBox.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();

            Stage stage = new Stage();

            setStage(stage);
            stage.setScene(new Scene(root1));
            stage.showAndWait();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addTrain(){
        if (nameInput.getText() != null){
            System.out.println(nameInput.getText());
        } else {
            System.out.println("Fill in a name!");
        }


    }

    public void close(){
        stage.close();
    }
}
