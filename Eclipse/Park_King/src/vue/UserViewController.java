package vue;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import modele.Client;

public class UserViewController {

	 @FXML
	    private TableView<Client> personTable;
	    @FXML
	    private TableColumn<Client, String> firstNameColumn;
	    @FXML
	    private Label firstNameLabel;

	    // Reference to the main application.
	    private UserViewMain mainApp;

	    /**
	     * The constructor.
	     * The constructor is called before the initialize() method.
	     */
	    public UserViewController() {
	    }

	    /**
	     * Initializes the controller class. This method is automatically called
	     * after the fxml file has been loaded.
	     */
	    @FXML
	    private void initialize() {
	        // Initialize the person table with the two columns.
	        firstNameColumn.setCellValueFactory(
	                cellData -> cellData.getValue().firstNameProperty());

	        // Clear person details.
	        showPersonDetails(null);

	        // Listen for selection changes and show the person details when changed.
	        personTable.getSelectionModel().selectedItemProperty().addListener(
	                (observable, oldValue, newValue) -> showPersonDetails(newValue));
	    }
	    
	    /**
	     * Fills all text fields to show details about the person.
	     * If the specified person is null, all text fields are cleared.
	     *
	     * @param person the person or null
	     */
	    private void showPersonDetails(Client person) {
	        if (person != null) {
	            // Fill the labels with info from the person object.
	            firstNameLabel.setText(person.getName());

	            // TODO: We need a way to convert the birthday into a String!
	            // birthdayLabel.setText(...);
	        } else {
	            // Person is null, remove all the text.
	            firstNameLabel.setText("");
	        }
	    }

	    /**
	     * Is called by the main application to give a reference back to itself.
	     * 
	     * @param mainApp
	     */
	    public void setMainApp(UserViewMain mainApp) {
	        this.mainApp = mainApp;

	        // Add observable list data to the table
	        personTable.setItems(mainApp.getPersonData());
	    }
	    
	    /**
	     * Called when the user clicks on the delete button.
	     */
	    @FXML
	    private void handleDeletePerson() {
	        int selectedIndex = personTable.getSelectionModel().getSelectedIndex();
	        if (selectedIndex >= 0) {
	            personTable.getItems().remove(selectedIndex);
	        } else {
	            // Nothing selected.
	            Alert alert = new Alert(AlertType.WARNING);
	            alert.initOwner(mainApp.getPrimaryStage());
	            alert.setTitle("Suppression");
	            alert.setHeaderText("Aucun client sélectionné");
	            alert.setContentText("Veuillez sélectionner un client.");

	            alert.showAndWait();
	        }
	    }
	    
	    /**
	     * Called when the user clicks the new button. Opens a dialog to edit
	     * details for a new person.
	     */
	    @FXML
	    private void handleNewPerson() {
	        Client tempPerson = new Client();
	        boolean okClicked = mainApp.showPersonEditDialog(tempPerson);
	        if (okClicked) {
	            mainApp.getPersonData().add(tempPerson);
	        }
	    }

	    /**
	     * Called when the user clicks the edit button. Opens a dialog to edit
	     * details for the selected person.
	     */
	    @FXML
	    private void handleEditPerson() {
	        Client selectedPerson = personTable.getSelectionModel().getSelectedItem();
	        if (selectedPerson != null) {
	            boolean okClicked = mainApp.showPersonEditDialog(selectedPerson);
	            if (okClicked) {
	                showPersonDetails(selectedPerson);
	            }

	        } else {
	            // Nothing selected.
	            Alert alert = new Alert(AlertType.WARNING);
	            alert.initOwner(mainApp.getPrimaryStage());
	            alert.setTitle("Édition");
	            alert.setHeaderText("Aucun client sélectionné");
	            alert.setContentText("Veuillez sélectionner un client.");

	            alert.showAndWait();
	        }
	    }
}
	
