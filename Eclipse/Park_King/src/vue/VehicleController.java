package vue;

import java.util.ArrayList;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import modele.Client;
import modele.Vehicule;

public class VehicleController {

	@FXML
    private TableView<Vehicule> vehicleTable;
	@FXML
    private TableColumn<Vehicule, String> vehicleList;
    @FXML
    private Label plaqueLabel;	    
    @FXML
    private Label typeLabel; 
    
    ArrayList<Vehicule> vehicleArray;
    private Client client;
    // Reference to the main application.
    private UserViewMain mainApp;
    
    /**
     * The constructor.
     * The constructor is called before the initialize() method.
     */
    public VehicleController() {
    }
    
    /**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded.
     */
    @FXML
    private void initialize() {
        // Initialize the vehicle table.
    	vehicleList.setCellValueFactory(
    			cellData -> cellData.getValue().getImatriculationProperty());
    	
    	
        // Clear vehicle details.
        showVehicleDetails(null);
        
	    //Listen for selection changes and show the client details when changed.
	    vehicleTable.getSelectionModel().selectedItemProperty().addListener(
	                (observable, oldValue, newValue) -> showVehicleDetails(newValue));
    }
	
    /**
     * Is called by the main application to give a reference back to itself.
     * 
     * @param mainApp
     */
    public void setMainApp(UserViewMain mainApp) {
        this.mainApp = mainApp;
        
        // Add observable list data to the table
        vehicleTable.setItems(mainApp.getVehicleData(client));
    }
    
    /**
     * Sets the client in the dialog.
     *
     * @param client
     */
    public void setClient(Client client) {
    	this.client = client;

        vehicleArray = client.getListeVehicule();
    }
    
    /**
     * Called when the user clicks return.
     */
    @FXML
    private void handleReturn() {
    	mainApp.showClientOverview();
    }
    
    /**
     * Fills all text fields to show details about the vehicle.
     * If the specified vehicle is null, all text fields are cleared.
     *
     * @param vehicle the vehicle or null
     */
    private void showVehicleDetails(Vehicule vehicle) {
        if (vehicle != null) {
            // Fill the labels with info from the vehicle object.
        	typeLabel.setText(vehicle.getType().toString());
            plaqueLabel.setText(vehicle.getImatriculation());
        } else {
            // vehicule is null, remove all the text.
        	typeLabel.setText("");
            plaqueLabel.setText("");
        }
    }
}
