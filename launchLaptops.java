/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author hp
 */
public class launchLaptops extends Application{
    
    public static void main(String[] args)
    {
        launch(args);
    }

    
    //launching the laptop with the scenebuilder form
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Laptop.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("Create Laptop Data");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    
}
