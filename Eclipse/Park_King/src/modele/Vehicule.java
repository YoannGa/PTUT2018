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


//----------------------------------------------------------------------------
// Default/DC_Vehicule.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class DC_Vehicule 
public class Vehicule {
    
   
    
    protected TypeVehicule type;
    
    protected String imatriculation;		//## attribute imatriculation 
    
    protected Client itsDC_Client;		//## link itsDC_Client 
    
    protected String heureDeLivraison;
    
    protected String lieuDeLivraison;
    
    
   // protected DC_Parking itsDC_Parking;		//## link itsDC_Parking 
    
    public Vehicule(TypeVehicule t) {    	
    	this.type = t;    	
    };
    
    public Vehicule(TypeVehicule t, String ima) {    	
    	this.type = t;    	
    	this.imatriculation = ima;
    };
    
    
    //## operation getVolume() 
 
    
    

	


	public TypeVehicule getType() {
		return type;
	}

	public void setType(TypeVehicule type) {
		this.type = type;
	}

	

	public String getImatriculation() {
		return imatriculation;
	}

	public void setImatriculation(String imatriculation) {
		this.imatriculation = imatriculation;
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
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/DC_Vehicule.java
*********************************************************************/

