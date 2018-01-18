package vue;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import modele.Abonne;
import modele.Client;
import modele.SuperAbonne;

public class UserViewController {

		@FXML
	    private TableView<Client> clientTable;
	    @FXML
	    private TableColumn<Client, String> clientList;
	    @FXML
	    private Label nameLabel;	    
	    @FXML
	    private Label typeLabel;

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
	        // Initialize the client table.
	        clientList.setCellValueFactory(
	                cellData -> cellData.getValue().firstNameProperty());

	        // Clear client details.
	        showClientDetails(null);

	        // Listen for selection changes and show the client details when changed.
	        clientTable.getSelectionModel().selectedItemProperty().addListener(
	                (observable, oldValue, newValue) -> showClientDetails(newValue));
	    }
	    
	    /**
	     * Is called by the main application to give a reference back to itself.
	     * 
	     * @param mainApp
	     */
	    public void setMainApp(UserViewMain mainApp) {
	        this.mainApp = mainApp;

	        // Add observable list data to the table
	        clientTable.setItems(mainApp.getClientData());
	    }
	    
	    /**
	     * Fills all text fields to show details about the client.
	     * If the specified client is null, all text fields are cleared.
	     *
	     * @param client the client or null
	     */
	    private void showClientDetails(Client client) {
	        if (client != null) {
	            // Fill the labels with info from the client object.
	            nameLabel.setText(client.getName());
	            
	            if(client instanceof SuperAbonne) { 
	            	typeLabel.setText("Super Abonné");
	            } else {
	            	if(client instanceof Abonne) { 
		            	typeLabel.setText("Abonné");
		            } else {
			            typeLabel.setText("Sans abonnement");
		            }
	            }
	            
	        } else {
	            // client is null, remove all the text.
	            nameLabel.setText("");
	            typeLabel.setText("");
	        }
	    }
	    
	    /**
	     * Called when the user clicks on the delete button.
	     */
	    @FXML
	    private void handleDeleteClient() {
	        int selectedIndex = clientTable.getSelectionModel().getSelectedIndex();
	        if (selectedIndex >= 0) {
	            clientTable.getItems().remove(selectedIndex);
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
	     * Called when the user clicks the new client button. Opens a dialog to edit
	     * details for a new client.
	     */
	    @FXML
	    private void handleNewClient() {
	        Client tempClient = new Client();
	        boolean okClicked = mainApp.showClientEditDialog(tempClient);
	        if (okClicked) {
	            mainApp.getClientData().add(tempClient);
	        }
	    }
	    
	    /**
	     * Called when the user clicks the new abonne button. Opens a dialog to edit
	     * details for a new abonne.
	     */
	    @FXML
	    private void handleNewAbonne() {
	        Client tempAbonne = new Abonne();
	        boolean okClicked = mainApp.showClientEditDialog(tempAbonne);
	        if (okClicked) {
	            mainApp.getClientData().add(tempAbonne);
	        }
	    }
	    
	    /**
	     * Called when the user clicks the new super abo button. Opens a dialog to edit
	     * details for a new super abonne.
	     */
	    @FXML
	    private void handleNewSupAbonne() {
	        Client tempSupAbonne = new SuperAbonne();
	        boolean okClicked = mainApp.showClientEditDialog(tempSupAbonne);
	        if (okClicked) {
	            mainApp.getClientData().add(tempSupAbonne);
	        }
	    }

	    /**
	     * Called when the user clicks the edit button. Opens a dialog to edit
	     * details for the selected client.
	     */
	    @FXML
	    private void handleEditClient() {
	        Client selectedClient = clientTable.getSelectionModel().getSelectedItem();
	        if (selectedClient != null) {
	            boolean okClicked = mainApp.showClientEditDialog(selectedClient);
	            if (okClicked) {
	            	 showClientDetails(selectedClient);
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
	    
	    /**
	     * Called when the user clicks the se garer button. Opens a dialog to manage
	     * vehicle for the selected client.
	     */
	    @FXML
	    private void handleVehicleClient() {
	        Client selectedClient = clientTable.getSelectionModel().getSelectedItem();
	        if (selectedClient != null) {
	            mainApp.showClientVehicle(selectedClient);
	        } else {
	            // Nothing selected.
	            Alert alert = new Alert(AlertType.WARNING);
	            alert.initOwner(mainApp.getPrimaryStage());
	            alert.setTitle("Vehicule");
	            alert.setHeaderText("Aucun client sélectionné");
	            alert.setContentText("Veuillez sélectionner un client.");

	            alert.showAndWait();
	        }
	    }
	    
	    /**
	     * Called when the user clicks the se garer button. Opens a dialog to manage
	     * vehicle for the selected client.
	     */
	    @FXML
	    private void handleTicketClient() {
	        Client selectedClient = clientTable.getSelectionModel().getSelectedItem();
	        if (selectedClient != null) {
	            mainApp.showClientTicket(selectedClient);
	        } else {
	            // Nothing selected.
	            Alert alert = new Alert(AlertType.WARNING);
	            alert.initOwner(mainApp.getPrimaryStage());
	            alert.setTitle("Ticket");
	            alert.setHeaderText("Aucun client sélectionné");
	            alert.setContentText("Veuillez sélectionner un client.");

	            alert.showAndWait();
	        }
	    }

}
	
