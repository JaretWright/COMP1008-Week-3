package w17jan25part2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author JWright
 */
public class CreateNewEmployeeViewController implements Initializable {

    @FXML private TextField firstNameTextField;
    @FXML private TextField lastNameTextField;
    @FXML private TextField socialInsuranceTextField;
    @FXML private TextField hourlyRateTextField;
    
    @FXML private DatePicker dobDatePicker;
    @FXML private Button createEmployeeButton;
            
    /**
     * When the createEmployeeButton is pushed, it will read
     * from the fields and create a new Employee
     */
    public void createEmployeeButtonPushed()
    {
        //this initially assumes that the fields are populated
        //correctly
        HourlyEmployee newEmployee = new HourlyEmployee(firstNameTextField.getText(),
                                                        lastNameTextField.getText(),
                                                    Integer.parseInt(socialInsuranceTextField.getText()),
                                                        dobDatePicker.getValue(),
                                                    Double.parseDouble(hourlyRateTextField.getText()));
        
        System.out.printf("The employee is: %s", newEmployee.toString());
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
