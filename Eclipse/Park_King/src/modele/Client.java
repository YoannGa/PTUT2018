/*********************************************************************
	Rhapsody	: 8.1.5
	Login		: yoann.gathignol
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: DC_Client
//!	Generated Date	: Thu, 11, Jan 2018 
	File Path	: DefaultComponent/DefaultConfig/Default/DC_Client.java
*********************************************************************/

package modele;

//## auto_generated
import java.util.*;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

//----------------------------------------------------------------------------
// Default/DC_Client.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class DC_Client 
public class Client {
	
	
    
    protected StringProperty name;		//## attribute name 
    
    protected ArrayList<Ticket> listeTickets;		//## attribute tickets 
    
    protected ArrayList<Vehicule> listeVehicule;		//## attribute listeVehicule 
    
   
    
    
    public Client(String n){
    	
    	this.name = new SimpleStringProperty(n);
    	this.listeTickets = new ArrayList<>();  
    	this.listeVehicule = new ArrayList<>();
    }
    
    public Client () {
    	
    	this.name = new SimpleStringProperty("Bob");
    	this.listeTickets = new ArrayList<>();
    	this.listeVehicule = new ArrayList<>();
    }
    
    
    public Client(String n, Vehicule v, Ticket t){
    	
    	this.name = new SimpleStringProperty(n);
    	this.listeTickets = new ArrayList<>();
    	this.listeVehicule = new ArrayList<>();
    	this.listeTickets.add(t);
    	this.listeVehicule.add(v);
    }
    
    public Client(String n, ArrayList<Vehicule> v, ArrayList<Ticket> t){
    	
    	this.name = new SimpleStringProperty(n);
    	this.listeTickets = t;
    	this.listeVehicule = v;
    }
    
    
    
    
    
    /**
     * @param b
    */
    //## operation dermanderTicket(Borne) 
    public Ticket demanderTicket(Borne b, Vehicule v) {
       Ticket t = b.nouveauTicket(v);
       t.setClient(this);
        
        return t;
    }
    
    /**
     * @param t
     * @param b
    */
    //## operation insererTicket(Ticket,Borne) 
    public void insererTicket(Ticket t, Borne b) {
        System.out.println("Je suis " + this.getName() + " et j'insere un ticket");
        

    }
    
    //## operation payer() 
    public void payer() {
      System.out.println("Je suis " + this.getName() + " et je paye");
    }
    
    //## operation recupVehicule() 
    public void recupVehicule(Ticket t,Borne b) {
        b.activerRetrait(t);
    }

	public String getName() {
		return name.get();
	}
	
    public StringProperty firstNameProperty() {
        return name;
    }

	public void setName(String name) {
		this.name.set(name);
	}

	public ArrayList<Ticket> getListeTickets() {
		return listeTickets;
	}

	public void setListeTickets(ArrayList<Ticket> listeTickets) {
		this.listeTickets = listeTickets;
	}

	public ArrayList<Vehicule> getListeVehicule() {
		return listeVehicule;
	}

	public void setListeVehicule(ArrayList<Vehicule> listeVehicule) {
		this.listeVehicule = listeVehicule;
	}
	
	public void addVehicule(Vehicule v) {
		this.listeVehicule.add(v);
	}

	

	public void setName(StringProperty name) {
		this.name = name;
	}
	
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/DC_Client.java
*********************************************************************/

