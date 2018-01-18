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

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

//----------------------------------------------------------------------------
// Default/DC_Ticket.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class DC_Ticket 
public class Ticket {
	
	protected StringProperty id;
	
	protected Vehicule v;
    
    protected Parking p;		//## attribute p 
    
    protected int numEmplacement;//## attribute numEmplacement 
    
    protected Client client;
    
    public Ticket(Vehicule v, Parking p, int num) {
    	int i = (int) (Math.random()*1000);    	
    	this.id = new SimpleStringProperty(i+"");
    	this.v = v;
    	this.p = p;
    	this.numEmplacement = num;  
    }
    
   
    public void setClient(Client c) {
    	this.client = c;
    }
    
    public Client getClient() {
    	return this.client;
    }
    

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
    
	public StringProperty getId() {
		return id;
	}

	public String getIdString() {
		return this.id.get();
	}
	public void setId(StringProperty id) {
		this.id = id;
	}
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/DC_Ticket.java
*********************************************************************/

