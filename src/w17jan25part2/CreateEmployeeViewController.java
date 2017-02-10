/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w17jan25part2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;

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
    @FXML private Label payRateLabel;
    @FXML private RadioButton hourlyEmployeeRadioButton;
    @FXML private RadioButton commissionEmployeeRadioButton;
    
    /**
     * This will create a new Hourly Employee, it does not validate all of the
     * inputs
     */
    public void createEmployeeButtonPushed()
    {
        if (this.hourlyEmployeeRadioButton.isSelected())
        {
            try
            {
                HourlyEmployee newEmp = new HourlyEmployee(firstNameTextField.getText(),
                                                        lastNameTextField.getText(),
                                                        Integer.parseInt(socialInsuranceNumTextField.getText()),
                                                        dateOfBirthDatePicker.getValue(),
                                                        Double.parseDouble(hourlyRateTextField.getText()));

                System.out.printf("The new hourly employee is: %s%n",newEmp.toString());
            }
            catch (IllegalArgumentException e)
            {
                this.errorMessageLabel.setVisible(true);
                this.errorMessageLabel.setText(e.getMessage());
            }
        }
        else if (this.commissionEmployeeRadioButton.isSelected())
        {
            try
            {
                CommissionEmployee newEmp = new CommissionEmployee(firstNameTextField.getText(),
                                                        lastNameTextField.getText(),
                                                        Integer.parseInt(socialInsuranceNumTextField.getText()),
                                                        dateOfBirthDatePicker.getValue(),
                                                        Double.parseDouble(hourlyRateTextField.getText()));

                System.out.printf("The new commission employee is: %s%n",newEmp.toString());
            }
            catch (IllegalArgumentException e)
            {
                this.errorMessageLabel.setVisible(true);
                this.errorMessageLabel.setText(e.getMessage());
            }
        }
        
    }
    
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.errorMessageLabel.setText("");
        
        ToggleGroup radioButtonGroup = new ToggleGroup();
        this.hourlyEmployeeRadioButton.setToggleGroup(radioButtonGroup);
        this.commissionEmployeeRadioButton.setToggleGroup(radioButtonGroup);
        this.hourlyEmployeeRadioButton.setSelected(true);
        
        radioButtonGroup.selectedToggleProperty().addListener(new ChangeListener<Toggle>()
        {
            @Override
            public void changed(ObservableValue<? extends Toggle> observable, Toggle oldValue,
                    Toggle newValue)
            {
                if (hourlyEmployeeRadioButton.isSelected())
                {
                    payRateLabel.setText("Hourly Rate");
                    hourlyRateTextField.setPromptText("Hourly Rate");
                    errorMessageLabel.setText("");
                    errorMessageLabel.setVisible(false);
                }
                else if (commissionEmployeeRadioButton.isSelected())
                {
                    payRateLabel.setText("Commission Rate");
                    hourlyRateTextField.setPromptText("Commission rate");
                    errorMessageLabel.setText("");
                    errorMessageLabel.setVisible(false);
                }                    
            }
        });
        
    }    
    
}
