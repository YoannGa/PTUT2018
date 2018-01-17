/*********************************************************************
	Rhapsody	: 8.1.5
	Login		: yoann.gathignol
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: DC_Abonne
//!	Generated Date	: Thu, 11, Jan 2018 
	File Path	: DefaultComponent/DefaultConfig/Default/DC_Abonne.java
*********************************************************************/

package modele;

import java.util.ArrayList;

import javafx.beans.property.SimpleStringProperty;

//----------------------------------------------------------------------------
// Default/DC_Abonne.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class DC_Abonne 
public class Abonne extends Client {
    
	 public Abonne(String n) {
			super(n);
			// TODO Auto-generated constructor stub
		}
    public Abonne(String n, int num) {
		super(n);
		numAbonne = num;
		// TODO Auto-generated constructor stub
	}
    
    public Abonne(String n, ArrayList<Vehicule> v, ArrayList<Ticket> t){
    	super(n,v,t);
    	this.numAbonne = (int) (Math.random()*100);
    }
    
    
    
    public Abonne() {
    	super();
    	this.numAbonne = (int) (Math.random()*100);
    }

	protected int numAbonne;		//## attribute numAbonne 
    
    
    //## operation makeEntretien() 
    public void makeEntretien() {
        //#[ operation makeEntretien() 
        //#]
    }
    
    //## operation makeMaintenance() 
    public void makeMaintenance() {
        //#[ operation makeMaintenance() 
        //#]
    }
    
    //## operation setLivraison() 
    public void setLivraison() {
        //#[ operation setLivraison() 
        //#]
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/DC_Abonne.java
*********************************************************************/

