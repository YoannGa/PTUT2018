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
    
    protected int longueur;		//## attribute longueur 
    
    protected int largeur;		//## attribute largeur 
    
    protected int hauteur;		//## attribute hauteur 
    
    TypeVehicule type;
    
    protected String imatriculation;		//## attribute imatriculation 
    
    protected Client itsDC_Client;		//## link itsDC_Client 
    
   // protected DC_Parking itsDC_Parking;		//## link itsDC_Parking 
    
    
    //## operation getVolume() 
    public float getVolume() {
    	return longueur * largeur * hauteur ;
    }

	public TypeVehicule getType() {
		return type;
	}

	public void setType(TypeVehicule type) {
		this.type = type;
	}

	public int getLongueur() {
		return longueur;
	}

	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}

	public int getLargeur() {
		return largeur;
	}

	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}

	public int getHauteur() {
		return hauteur;
	}

	public void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}

	public String getImatriculation() {
		return imatriculation;
	}

	public void setImatriculation(String imatriculation) {
		this.imatriculation = imatriculation;
	}
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/DC_Vehicule.java
*********************************************************************/

