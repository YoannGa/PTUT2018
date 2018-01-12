/*********************************************************************
	Rhapsody	: 8.1.5
	Login		: yoann.gathignol
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: DC_Parking
//!	Generated Date	: Thu, 11, Jan 2018 
	File Path	: DefaultComponent/DefaultConfig/Default/DC_Parking.java
*********************************************************************/

package modele;

import java.util.HashMap;
import java.util.HashSet;

//----------------------------------------------------------------------------
// Default/DC_Parking.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class DC_Parking 
public class Parking {
    
    protected HashMap<Integer,Vehicule> listeVoitures;		//## attribute listeVoitures 
    
    protected HashMap<Integer,Vehicule> listeDeuxRoues;		//## attribute listeDeuxRoues 
    
    protected HashMap<Integer,Vehicule> listePoidsLourds;		//## attribute listePoidsLourds 
    
    protected HashSet<Integer> emplacementsVoitures;		//## attribute emplacementsVoitures 
    
    protected HashSet<Integer> emplacementsDeuxRoues;		//## attribute emplacementsDeuxRoues 
    
    protected HashSet<Integer> emplacementsLourds;		//## attribute emplacementsLourds 
    
    protected int nbVoituresMax;
    
    protected int nbDeuxRouesMax;
    
    protected int nbPoidsLourdsMax;
   
    /*
    protected DC_Teleporteur itsDC_Teleporteur;		//## link itsDC_Teleporteur 
    
    protected DC_Teleporteur itsDC_Teleporteur_1;		//## link itsDC_Teleporteur_1 
    
    protected DC_Vehicule itsDC_Vehicule;		//## link itsDC_Vehicule 
    */
    
    /**
     * @param v
    */
    //## operation ajouterVehicule(Vehicule) 
    public void ajouterVehicule(Vehicule v) {
        //#[ operation ajouterVehicule(Vehicule) 
        //#]
    }
    
    //## operation estPlein() 
    public boolean placeVoitureDispo() {
        return listeVoitures.size() < this.nbVoituresMax;
    }
    
    public boolean placeDeuxRouesDispo() {
        return listeDeuxRoues.size() < this.nbDeuxRouesMax;
    }
    
    public boolean placePoidsLourdsDispo() {
        return listePoidsLourds.size() < this.nbPoidsLourdsMax;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/DC_Parking.java
*********************************************************************/

