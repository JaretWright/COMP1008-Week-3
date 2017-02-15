package w17jan25part2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


/**
 *
 * @author JWright
 */
public class LaunchCreateNewEmployeeView extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }
    
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        //load the view
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("CreateNewEmployeeView.fxml"));
        AnchorPane createEmployeeLayout = loader.load();
        
        //Create the Scene and set the Scene on the stage
        Scene createEmplopyeeScene = new Scene(createEmployeeLayout);        
        primaryStage.setScene(createEmplopyeeScene);
        
        //Show the stage
        primaryStage.setTitle("Zac's hearing Angels");
        primaryStage.show();
    }
    

    
}
