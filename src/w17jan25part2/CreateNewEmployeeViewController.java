package w17jan25part2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

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
    @FXML private Label errorMessageLabel;
    
    @FXML private RadioButton hourlyRadioButton;
    @FXML private RadioButton commissionRadioButton;
    
    
    /**
     * This method will create a new employee and print them to the screen
     */        
    public void createEmployeeButtonPushed()
    {
        try
        {
            HourlyEmployee newEmpl = new HourlyEmployee(this.firstNameTextField.getText(),
                                    this.lastNameTextField.getText(),
                                    Integer.parseInt(this.socialInsuranceTextField.getText()),
                                    this.dobDatePicker.getValue(),
                                    Double.parseDouble(this.hourlyRateTextField.getText()));

            System.out.printf("Employee: %s is from the class %s%n", newEmpl, newEmpl.getClass());    
        }
        catch (IllegalArgumentException e)
        {
            this.errorMessageLabel.setText(e.getMessage());
            this.errorMessageLabel.setVisible(true);
        }
        
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.errorMessageLabel.setVisible(false);
        
        //This will put the radio buttons in a toggle group, so that only 
        //one can be selected at a time
        ToggleGroup employeeTypeGroup = new ToggleGroup();
        this.hourlyRadioButton.setToggleGroup(employeeTypeGroup);
        this.commissionRadioButton.setToggleGroup(employeeTypeGroup);
    }    
    
}
