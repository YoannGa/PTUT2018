/*********************************************************************
	Rhapsody	: 8.1.5
	Login		: yoann.gathignol
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: DC_SuperAbonne
//!	Generated Date	: Thu, 11, Jan 2018 
	File Path	: DefaultComponent/DefaultConfig/Default/DC_SuperAbonne.java
*********************************************************************/

package modele;

import java.util.ArrayList;

//----------------------------------------------------------------------------
// Default/DC_SuperAbonne.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class DC_SuperAbonne 
public class SuperAbonne extends Abonne {
    
    
    public SuperAbonne(String n) {
		super(n);
		// TODO Auto-generated constructor stub
	}

    public SuperAbonne() {
    	super();
    }
    
    public SuperAbonne(String n, ArrayList<Vehicule> v, ArrayList<Ticket> t){
    	super(n,v,t);    	
    }
    
	//## operation gererPackVIP() 
    public void gererPackVIP() {
        
    }
    
    
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/DC_SuperAbonne.java
*********************************************************************/

