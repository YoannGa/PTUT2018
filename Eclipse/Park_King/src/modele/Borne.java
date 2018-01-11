/*********************************************************************
	Rhapsody	: 8.1.5
	Login		: yoann.gathignol
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: DC_Borne
//!	Generated Date	: Thu, 11, Jan 2018 
	File Path	: DefaultComponent/DefaultConfig/Default/DC_Borne.java
*********************************************************************/

package modele;


//----------------------------------------------------------------------------
// Default/DC_Borne.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class DC_Borne 
public class Borne {
    
    protected Camera cam;		//## attribute cam 
    
    protected Teleporteur tp;		//## attribute tp 
    
   
    
    /**
     * @param t
    */
    //## operation activerGarer(Ticket) 
    public void activerGarer(Ticket t) {
        this.tp.garerVehicule(t);
    }
    
    /**
     * @param t
    */
    //## operation activerRetrait(Ticket) 
    public void activerRetrait(Ticket t) {
        this.tp.retirerVehicule(t);
    }
    
    /**
     * @param t
    */
    //## operation demanderPaiement(Ticket) 
    public void demanderPaiement(Ticket t) {
        System.out.println("plz payez, giv money, am poor, need food :3");
    }
    
    /**
     * @param c
    */
    //## operation nouveauTicket(Client) 
    public void nouveauTicket(Client c) {
        //#[ operation nouveauTicket(Client) 
        //#]
    }
    
    //## operation rendreTicket() 
    public void rendreTicket() {
        //#[ operation rendreTicket() 
        //#]
    }
    
    /**
     * @param p
    */
    //## operation verifPlaceDispo(Parking) 
    public boolean verifPlaceDispo(Parking p) {
		return false;
        //#[ operation verifPlaceDispo(Parking) 
        //#]
    }
    
    /**
     * @param t
    */
    //## operation verifValiditeTicket(Ticket) 
    public boolean verifValiditeTicket(Ticket t) {
		return false;
        //#[ operation verifValiditeTicket(Ticket) 
        //#]
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/DC_Borne.java
*********************************************************************/

