package vue;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import modele.Client;
import modele.Ticket;

public class TicketController {
	
	@FXML
    private TableView<Ticket> ticketTable;
	@FXML
    private TableColumn<Ticket, String> ticketList;
    @FXML
    private Label vehiculeLabel;	    
    @FXML
    private Label parkingLabel; 
    @FXML
    private Label placeLabel; 
	
	private Client client;
    // Reference to the main application.
    private UserViewMain mainApp;

    /**
     * The constructor.
     * The constructor is called before the initialize() method.
     */
    public TicketController() {
    }
    
    /**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded.
     */
    @FXML
    private void initialize() {
        // Initialize the vehicle table.
    	ticketList.setCellValueFactory(
    			cellData -> cellData.getValue().getIdString());
    	
        // Clear vehicle details.
        showTicketDetails(null);
        
	    //Listen for selection changes and show the client details when changed.
	    ticketTable.getSelectionModel().selectedItemProperty().addListener(
	                (observable, oldValue, newValue) -> showTicketDetails(newValue));
    }
    
    /**
     * Is called by the main application to give a reference back to itself.
     * 
     * @param mainApp
     */
    public void setMainApp(UserViewMain mainApp) {
        this.mainApp = mainApp;
        
        // Add observable list data to the table
        ticketTable.setItems(mainApp.getTicketData(client));
    }
    
    /**
     * Sets the client in the dialog.
     *
     * @param client
     */
    public void setClient(Client client) {
        this.client = client;
    }
    
    /**
     * Called when the user clicks return.
     */
    @FXML
    private void handleReturn() {
    	mainApp.showClientOverview();
    }
    
    /**
     * Fills all text fields to show details about the ticket.
     * If the specified vehicle is null, all text fields are cleared.
     *
     * @param ticket the ticket or null
     */
    private void showTicketDetails(Ticket ticket) {
        if (ticket != null) {
        	
            // Fill the labels with info from the client object.
            //nameLabel.setText(client.getName());
            
        } else {
            // ticket is null, remove all the text.
            vehiculeLabel.setText("");	 
            parkingLabel.setText(""); 
            placeLabel.setText(""); 
        }
    }
}
