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

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

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
    
    protected StringProperty id;
    
   
    /*
    protected DC_Teleporteur itsDC_Teleporteur;		//## link itsDC_Teleporteur 
    
    protected DC_Teleporteur itsDC_Teleporteur_1;		//## link itsDC_Teleporteur_1 
    
    protected DC_Vehicule itsDC_Vehicule;		//## link itsDC_Vehicule 
    */
    
    
    
    public Parking(int nbEmplacementVoitures, int nbEmplacementDeuxRoues, int nbEmplacementPoidsLourds) {
    	int ident = (int) (Math.random()*100);    	
    	this.id = new SimpleStringProperty(ident+"");
    	
    	
    	this.listeVoitures = new HashMap<>();
    	this.listeDeuxRoues = new HashMap<>();
    	this.listePoidsLourds = new HashMap<>();    	
    	    	
    	this.emplacementsVoitures = new HashSet<>();
    	this.emplacementsDeuxRoues = new HashSet<>();
    	this.emplacementsLourds = new HashSet<>();
    	
    	this.nbVoituresMax = nbEmplacementVoitures;
    	this.nbDeuxRouesMax = nbEmplacementDeuxRoues;
    	this.nbPoidsLourdsMax = nbEmplacementPoidsLourds;
    	
    	for(int i = 1 ; i <= nbVoituresMax; i++ ) {
    		emplacementsVoitures.add(i);
    	}
    	for(int i = nbVoituresMax+1 ; i <= nbVoituresMax+nbDeuxRouesMax; i++ ) {
    		emplacementsDeuxRoues.add(i);
    	}
    	for(int i = nbVoituresMax+nbDeuxRouesMax+1 ; i <= nbVoituresMax+nbDeuxRouesMax+nbEmplacementPoidsLourds; i++ ) {
    		emplacementsDeuxRoues.add(i);
    	}
    }
    
    public Parking() {
    	 this(10,10,10);
    }
    
    /**
     * @param v
    */
    //## operation ajouterVehicule(Vehicule) 
    
    public void ajouterVehicule(int e, Vehicule v) {    	
    	
    	if(v.getType().equals(TypeVehicule.Voiture)) {  		
    		listeVoitures.put(e, v);
    	}else if(v.getType().equals(TypeVehicule.DeuxRoues)) {  		
    			listeDeuxRoues.put(e, v);
    		}else if(v.getType().equals(TypeVehicule.PoidsLourd)) {  		
    				listePoidsLourds.put(e, v);
        		} 
    }
    
    public void retirerVehicule(int e, Vehicule v) {    	
    	if(v.getType().equals(TypeVehicule.Voiture)) {  		
    		listeVoitures.remove(e);
    	}else if(v.getType().equals(TypeVehicule.DeuxRoues)) {  		
    			listeDeuxRoues.remove(e);
    		}else if(v.getType().equals(TypeVehicule.PoidsLourd)) {  		
    				listePoidsLourds.remove(e);
        		} 
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
    
    
    
    
    public int assignerPlaceVoitureDispo() {
    	for(int i = 1; i <= this.nbVoituresMax; i++ ) {
    		if(this.listeVoitures.containsKey(i)) {
    			return i;
    		}
    	}
    	return 0;    	
    }
    
    public int assignerPlaceDeuxRouesDispo() {    	
    	for(int i = nbVoituresMax + 1; i <= this.nbVoituresMax+ this.nbDeuxRouesMax; i++ ) {
    		if(this.listeDeuxRoues.containsKey(i)) {
    			return i;
    		}
    	}
    	return 0;     	
    }
    
    public int assignerPlacePoidsLourdsDispo() {
    	for(int i = nbVoituresMax + nbDeuxRouesMax + 1; i <= this.nbVoituresMax+ this.nbDeuxRouesMax + this.nbPoidsLourdsMax; i++ ) {
    		if(this.listePoidsLourds.containsKey(i)) {
    			return i;
    		}
    	}
    	return 0;
    	
    }
    
    public boolean vehiculePresent(Vehicule v) {
    	if(v.getType().equals(TypeVehicule.Voiture)) {  		
    		return this.listeVoitures.containsValue(v);
    	}else if(v.getType().equals(TypeVehicule.DeuxRoues)) {  		
    			return this.listeDeuxRoues.containsValue(v);
    		}else if(v.getType().equals(TypeVehicule.PoidsLourd)) {  		
    				return this.listePoidsLourds.containsValue(v);
        		} 
    	return false;
    }
    
    
    
    public int getNbVoituresMax() {
		return nbVoituresMax;
	}

	public void setNbVoituresMax(int nbVoituresMax) {
		this.nbVoituresMax = nbVoituresMax;
	}

	public int getNbDeuxRouesMax() {
		return nbDeuxRouesMax;
	}

	public void setNbDeuxRouesMax(int nbDeuxRouesMax) {
		this.nbDeuxRouesMax = nbDeuxRouesMax;
	}

	public int getNbPoidsLourdsMax() {
		return nbPoidsLourdsMax;
	}

	public void setNbPoidsLourdsMax(int nbPoidsLourdsMax) {
		this.nbPoidsLourdsMax = nbPoidsLourdsMax;
	}

	public HashMap<Integer, Vehicule> getListeVoitures() {
		return listeVoitures;
	}

	public void setListeVoitures(HashMap<Integer, Vehicule> listeVoitures) {
		this.listeVoitures = listeVoitures;
	}

	public HashMap<Integer, Vehicule> getListeDeuxRoues() {
		return listeDeuxRoues;
	}

	public void setListeDeuxRoues(HashMap<Integer, Vehicule> listeDeuxRoues) {
		this.listeDeuxRoues = listeDeuxRoues;
	}

	public HashMap<Integer, Vehicule> getListePoidsLourds() {
		return listePoidsLourds;
	}

	public void setListePoidsLourds(HashMap<Integer, Vehicule> listePoidsLourds) {
		this.listePoidsLourds = listePoidsLourds;
	}

	public HashSet<Integer> getEmplacementsVoitures() {
		return emplacementsVoitures;
	}

	public void setEmplacementsVoitures(HashSet<Integer> emplacementsVoitures) {
		this.emplacementsVoitures = emplacementsVoitures;
	}

	public HashSet<Integer> getEmplacementsDeuxRoues() {
		return emplacementsDeuxRoues;
	}

	public void setEmplacementsDeuxRoues(HashSet<Integer> emplacementsDeuxRoues) {
		this.emplacementsDeuxRoues = emplacementsDeuxRoues;
	}

	public HashSet<Integer> getEmplacementsLourds() {
		return emplacementsLourds;
	}

	public void setEmplacementsLourds(HashSet<Integer> emplacementsLourds) {
		this.emplacementsLourds = emplacementsLourds;
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
	File Path	: DefaultComponent/DefaultConfig/Default/DC_Parking.java
*********************************************************************/

