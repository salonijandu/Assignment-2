

package lab11;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LaptopController implements Initializable{

    @FXML
    private TextField make;

   @FXML
    private ComboBox<Integer> screensize;

    @FXML
    private ComboBox<Integer> ram;

    @FXML
    private ComboBox<Integer> memory;
    
     @FXML
    private Label label;
     
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        screensize.setPromptText("Select screen size");
        screensize.getItems().add(4);
        screensize.getItems().add(5);
        
        ram.setPromptText("Select ram");
        ram.getItems().add(1);
        ram.getItems().add(2);
        
        memory.setPromptText("Select memory");
        memory.getItems().add(1000);
        memory.getItems().add(500);
        
    }
    
    //creating object by passing the parameters and then throw conditionhal exception
     @FXML
    void submitAction(ActionEvent event) {
        try{
            Laptops l=new Laptops(make.getText(),screensize.getValue(),ram.getValue(),memory.getValue());
            
            label.setText("Done");
            
        }
        catch(Exception e){
            label.setText(e.getMessage());
        }
    }


}
