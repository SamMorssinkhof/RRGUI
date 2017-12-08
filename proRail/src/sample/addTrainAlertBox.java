package sample;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.geometry.*;
import javafx.stage.Modality;
import javafx.stage.Stage;



public class addTrainAlertBox {
    public void display() throws Exception {


        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("addTrainAlertBox.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.showAndWait();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
