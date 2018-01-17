package vue;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import modele.Abonne;
import modele.Client;
import modele.SuperAbonne;

public class UserEditDialogController {

	@FXML
    private TextField nameField;
	@FXML
    private RadioButton clientBtn;
	@FXML
    private RadioButton abonneBtn;
	@FXML
    private RadioButton superAboBtn;
	
	private Stage dialogStage;
    private Client client;
    private boolean okClicked = false;
    
    /**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded.
     */
    @FXML
    private void initialize() {
    }
    
    /**
     * Sets the stage of this dialog.
     *
     * @param dialogStage
     */
    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }

    /**
     * Sets the client to be edited in the dialog.
     *
     * @param client
     */
    public void setClient(Client client) {
        this.client = client;
        nameField.setText(client.getName());
        
        if(client instanceof SuperAbonne) { 
        	superAboBtn.setSelected(true);
        } else {
        	if(client instanceof Abonne) {
            	abonneBtn.setSelected(true);
            } else {
            	clientBtn.setSelected(true);
            }
        }
    }
    
    /**
     * Returns true if the user clicked OK, false otherwise.
     *
     * @return
     */
    public boolean isOkClicked() {
        return okClicked;
    }

    /**
     * Called when the user clicks ok.
     */
    @FXML
    private void handleOk() {
        if (isInputValid()) {
        	client.setName(nameField.getText());

            okClicked = true;
            dialogStage.close();
        }
    }

    /**
     * Called when the user clicks cancel.
     */
    @FXML
    private void handleCancel() {
        dialogStage.close();
    }

    /**
     * Validates the user input in the text fields.
     *
     * @return true if the input is valid
     */
    private boolean isInputValid() {
        String errorMessage = "";

        if (nameField.getText() == null || nameField.getText().length() == 0) {
            errorMessage += "Nom invalide !\n";
        }
        
        if (errorMessage.length() == 0) {
            return true;
        } else {
            // Show the error message.
            Alert alert = new Alert(AlertType.ERROR);
            alert.initOwner(dialogStage);
            alert.setTitle("Champs invalides");
            alert.setHeaderText("Veuillez corriger les champs invalides.");
            alert.setContentText(errorMessage);

            alert.showAndWait();

            return false;
        }
    }
}

