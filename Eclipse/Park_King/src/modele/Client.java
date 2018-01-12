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

//----------------------------------------------------------------------------
// Default/DC_Client.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class DC_Client 
public class Client {
    
    protected String name;		//## attribute name 
    
    protected ArrayList<Ticket> listeTickets;		//## attribute tickets 
    
    protected ArrayList<Vehicule> listeVehicule;		//## attribute listeVehicule 
    
   
    
    
    public Client(String n){
    	this.name = n;
    	this.listeTickets = new ArrayList<>();
    	
    	
    }
    
    public Client(String n, Vehicule v, Ticket t){
    	this.name = n;
    	this.listeTickets = new ArrayList<>();
    	this.listeVehicule = new ArrayList<>();
    	this.listeTickets.add(t);
    	this.listeVehicule.add(v);
    }
    
    
    /**
     * @param b
    */
    //## operation dermanderTicket(Borne) 
    public void dermanderTicket(Borne b) {
        //#[ operation dermanderTicket(Borne) 
        //#]
    }
    
    /**
     * @param t
     * @param b
    */
    //## operation insererTicket(Ticket,Borne) 
    public void insererTicket(Ticket t, Borne b) {
        //#[ operation insererTicket(Ticket,Borne) 
        //#]
    }
    
    //## operation payer() 
    public void payer() {
        //#[ operation payer() 
        //#]
    }
    
    //## operation recupVehicule() 
    public void recupVehicule() {
        //#[ operation recupVehicule() 
        //#]
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/DC_Client.java
*********************************************************************/

