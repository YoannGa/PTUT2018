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
    public void nouveauTicket(Vehicule v) {    	
    	Parking p = this.tp.assignerParking(v);
    	int emplacement = this.tp.assignerNewEmplacement(v, p);
    	Ticket t = new Ticket( v, p, emplacement);   	
    	
    }
    
    
    //## operation rendreTicket() 
    public void rendreTicket() {
       System.out.println("Opération invalide. Reprenez le ticket.");
    }
    
    /**
     * @param p
    */
    
    
    /**
     * @param t
    */
    //## operation verifValiditeTicket(Ticket) 
    public boolean verifValiditeTicket(Ticket t) {
    	return t.getP().vehiculePresent(t.getV());
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/DC_Borne.java
*********************************************************************/

