package vue;

import javafx.fxml.FXML;
import modele.Client;
import modele.Ticket;

public class TicketController {

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

        // Clear ticket details.
    	showTicketDetails(null);
        
    }
    
    /**
     * Is called by the main application to give a reference back to itself.
     * 
     * @param mainApp
     */
    public void setMainApp(UserViewMain mainApp) {
        this.mainApp = mainApp;
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
        	/*
            // Fill the labels with info from the client object.
            nameLabel.setText(client.getName());
            
            }*/
            
        } else {
            // client is null, remove all the text.
        	/*longueurLabel.setText("");
            largeurLabel.setText("");
            plaqueLabel.setText("");*/
        }
    }
}
