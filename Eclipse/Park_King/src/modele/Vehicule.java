/*********************************************************************
	Rhapsody	: 8.1.5
	Login		: yoann.gathignol
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: DC_Vehicule
//!	Generated Date	: Thu, 11, Jan 2018 
	File Path	: DefaultComponent/DefaultConfig/Default/DC_Vehicule.java
*********************************************************************/

package modele;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

//----------------------------------------------------------------------------
// Default/DC_Vehicule.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class DC_Vehicule 
public class Vehicule {
    
   
    
    protected TypeVehicule type;
    
    protected StringProperty imatriculation;		//## attribute imatriculation 
    
    protected Client itsDC_Client;		//## link itsDC_Client 
    
    protected String heureDeLivraison = "";
    
    protected String lieuDeLivraison = "";
    
    protected boolean estGare;
    
    
   // protected DC_Parking itsDC_Parking;		//## link itsDC_Parking 
    
    public Vehicule(TypeVehicule t) {    	
    	this.type = t;    	
    	this.estGare = false;
    	
    };
    
    public Vehicule(TypeVehicule t, String ima) {    	
    	this(t);    	
    	this.imatriculation = new SimpleStringProperty(ima);
    };
    
    
    //## operation getVolume() 
 
    
    

	


	public TypeVehicule getType() {
		return type;
	}

	public void setType(TypeVehicule type) {
		this.type = type;
	}

	public String getImatriculation() {
		return imatriculation.get();
	}

	public StringProperty getImatriculationProperty() {
		return imatriculation;
	}

	public void setImatriculation(String imatriculation) {
		this.imatriculation.set(imatriculation);
	}

	public String getHeureDeLivraison() {
		return heureDeLivraison;
	}

	public void setHeureDeLivraison(String heureDeLivraison) {
		this.heureDeLivraison = heureDeLivraison;
	}

	public String getLieuDeLivraison() {
		return lieuDeLivraison;
	}

	public void setLieuDeLivraison(String lieuDeLivraison) {
		this.lieuDeLivraison = lieuDeLivraison;
	}

	public boolean isEstGare() {
		return estGare;
	}

	public void setEstGare(boolean estGare) {
		this.estGare = estGare;
	}
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/DC_Vehicule.java
*********************************************************************/

