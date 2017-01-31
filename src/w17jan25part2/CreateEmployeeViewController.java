/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w17jan25part2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author JWright
 */
public class CreateEmployeeViewController implements Initializable {

    @FXML private TextField firstNameTextField;
    @FXML private TextField lastNameTextField;
    @FXML private TextField socialInsuranceNumTextField;
    @FXML private TextField hourlyRateTextField;
    @FXML private DatePicker dateOfBirthDatePicker;
    @FXML private Button createEmployeeButton;    
    @FXML private Label errorMessageLabel;
    
    /**
     * This will create a new Hourly Employee, it does not validate all of the
     * inputs
     */
    public void createEmployeeButtonPushed()
    {
        try
        {
            HourlyEmployee newEmp = new HourlyEmployee(firstNameTextField.getText(),
                                                   lastNameTextField.getText(),
                                                    Integer.parseInt(socialInsuranceNumTextField.getText()),
                                                    dateOfBirthDatePicker.getValue(),
                                                    Double.parseDouble(hourlyRateTextField.getText()));
            
            System.out.printf("The new employee is: %s%n",newEmp.toString());
        }
        catch (IllegalArgumentException e)
        {
            this.errorMessageLabel.setText(e.getMessage());
        }
        
        
    }
    
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.errorMessageLabel.setText("");
    }    
    
}
