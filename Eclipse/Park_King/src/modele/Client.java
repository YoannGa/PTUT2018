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
    
    protected ArrayList<Ticket> tickets;		//## attribute tickets 
    
    protected ArrayList<Vehicule> listeVehicule;		//## attribute listeVehicule 
    
    protected LinkedList<Ticket> itsDC_Ticket = new LinkedList<Ticket>();		//## link itsDC_Ticket 
    
    protected LinkedList<Vehicule> itsDC_Vehicule = new LinkedList<Vehicule>();		//## link itsDC_Vehicule 
    
    
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
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/DC_Client.java
*********************************************************************/

