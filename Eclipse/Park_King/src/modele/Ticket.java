/*********************************************************************
	Rhapsody	: 8.1.5
	Login		: yoann.gathignol
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: DC_Ticket
//!	Generated Date	: Thu, 11, Jan 2018 
	File Path	: DefaultComponent/DefaultConfig/Default/DC_Ticket.java
*********************************************************************/

package modele;


//----------------------------------------------------------------------------
// Default/DC_Ticket.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class DC_Ticket 
public class Ticket {
	protected Vehicule v;
    
    protected Parking p;		//## attribute p 
    
    protected int numEmplacement;		//## attribute numEmplacement 
    
    protected Borne itsDC_Borne;		//## link itsDC_Borne 
    
    protected Client itsDC_Client;		//## link itsDC_Client 

	public Vehicule getV() {
		return v;
	}

	public void setV(Vehicule v) {
		this.v = v;
	}

	public Parking getP() {
		return p;
	}

	public void setP(Parking p) {
		this.p = p;
	}

	public int getNumEmplacement() {
		return numEmplacement;
	}

	public void setNumEmplacement(int numEmplacement) {
		this.numEmplacement = numEmplacement;
	}
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/DC_Ticket.java
*********************************************************************/

