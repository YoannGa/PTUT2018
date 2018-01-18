package vue;

import java.io.IOException;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import modele.Client;
import modele.SuperAbonne;
import modele.Ticket;
import modele.TypeVehicule;
import modele.Vehicule;
import modele.Abonne;

public class UserViewMain extends Application {

    private Stage primaryStage;
    private BorderPane rootLayout;
    /**
     * The data as an observable list of clients.
     */
    private ObservableList<Client> clientData = FXCollections.observableArrayList();
    /**
     * The data as an observable list of vehicles.
     */
    private ObservableList<Vehicule> vehicleData = FXCollections.observableArrayList();
    /**
     * The data as an observable list of tickets.
     */
    private ObservableList<Ticket> ticketData = FXCollections.observableArrayList();
    
    /**
     * Constructor
     */
    public UserViewMain() {
        // Add some sample data
    	Client client = new Client("Alexis");
    	client.addVehicule(new Vehicule(TypeVehicule.DeuxRoues, "EM963FG"));
    	client.addVehicule(new Vehicule(TypeVehicule.Voiture, "PL124FK"));
        clientData.add(client);
    }

    /**
     * Returns the data as an observable list of clients. 
     * @return
     */
    public ObservableList<Client> getClientData() {
        return clientData;
    }
    
    /**
     * Returns the data as an observable list of vehicles. 
     * @return
     */
    public ObservableList<Vehicule> getVehicleData(Client client) {
    	ArrayList<Vehicule> vehicleArray = client.getListeVehicule();
    	for(Vehicule vehicle : vehicleArray){
    		vehicleData.add(vehicle);
    	}
        return vehicleData;
    }
    
    /**
     * Returns the data as an observable list of tickets. 
     * @return
     */
    public ObservableList<Ticket> getTicketData(Client client) {
    	ArrayList<Ticket> ticketArray = client.getListeTickets();
    	for(Ticket ticket : ticketArray){
    		ticketData.add(ticket);
    	}
        return ticketData;
    }

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Park-King");

        initRootLayout();
        showClientOverview();
    }

    /**
     * Initializes the root layout.
     */
    public void initRootLayout() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(UserViewMain.class.getResource("RootMenu.fxml"));
            rootLayout = (BorderPane) loader.load();

            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Shows the client overview inside the root layout.
     */
    public void showClientOverview() {
        try {
            // Load client overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(UserViewMain.class.getResource("UserView.fxml"));
            AnchorPane clientOverview = (AnchorPane) loader.load();

            // Set client overview into the center of root layout.
            rootLayout.setCenter(clientOverview);
            
            // Give the controller access to the main app.
            UserViewController controller = loader.getController();
            controller.setMainApp(this);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * Opens a dialog to edit details for the specified client. If the user
     * clicks OK, the changes are saved into the provided client object and true
     * is returned.
     *
     * @param client the client object to be edited
     * @return true if the user clicked OK, false otherwise.
     */
    public boolean showClientEditDialog(Client client) {
        try {
            // Load the fxml file and create a new stage for the popup dialog.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(UserViewMain.class.getResource("UserEdit.fxml"));
            AnchorPane page = (AnchorPane) loader.load();

            // Create the dialog Stage.
            Stage dialogStage = new Stage();
            dialogStage.setTitle("Édition");
            dialogStage.initModality(Modality.WINDOW_MODAL);
            dialogStage.initOwner(primaryStage);
            Scene scene = new Scene(page);
            dialogStage.setScene(scene);

            // Set the client into the controller.
            UserEditDialogController controller = loader.getController();
            controller.setDialogStage(dialogStage);
            controller.setClient(client);

            // Show the dialog and wait until the user closes it
            dialogStage.showAndWait();

            return controller.isOkClicked();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    /**
     * Opens a dialog to manage vehicle of the specified client.
     *
     * @param client the client object to be edited
     */
    public void showClientVehicle(Client client) {
        try {
            // Load the fxml file and create a new stage for the popup dialog.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(UserViewMain.class.getResource("VehiculeView.fxml"));
            AnchorPane vehiculeView = (AnchorPane) loader.load();

            // Create the dialog Stage.
            rootLayout.setCenter(vehiculeView);

            // Set the client into the controller.
            VehicleController controller = loader.getController();
            controller.setClient(client);
            controller.setMainApp(this);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * Opens a dialog to manage vehicle of the specified client.
     *
     * @param client the client object to be edited
     */
    public void showClientTicket(Client client) {
        try {
            // Load the fxml file and create a new stage for the popup dialog.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(UserViewMain.class.getResource("TicketView.fxml"));
            AnchorPane ticketView = (AnchorPane) loader.load();

            // Create the dialog Stage.
            rootLayout.setCenter(ticketView);

            // Set the client into the controller.
            TicketController controller = loader.getController();
            controller.setMainApp(this);
            controller.setClient(client);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Returns the main stage.
     * @return
     */
    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
