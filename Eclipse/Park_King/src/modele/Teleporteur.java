/*********************************************************************
	Rhapsody	: 8.1.5
	Login		: yoann.gathignol
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: DC_Teleporteur
//!	Generated Date	: Thu, 11, Jan 2018 
	File Path	: DefaultComponent/DefaultConfig/Default/DC_Teleporteur.java
*********************************************************************/

package modele;

//## auto_generated
import java.util.*;

//----------------------------------------------------------------------------
// Default/DC_Teleporteur.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class DC_Teleporteur 
public class Teleporteur {
    
    protected Parking parking;		//## attribute parking 
    
    protected ArrayList<Parking> parkingTiers;		//## attribute parkingTiers 
    
 
    
    /*
    protected LinkedList<DC_Parking> itsDC_Parking = new LinkedList<DC_Parking>();		//## link itsDC_Parking 
    
    protected DC_Parking itsDC_Parking_1;		//## link itsDC_Parking_1 
    */
    
    /**
     * @param v
     * @param emplacement
    */
    //## operation garerVehicule(Vehicule,int) 
    
    
    public Teleporteur() {
    	this(new Parking());
    	this.parkingTiers = new ArrayList<>();
    }
    
    public Teleporteur(Parking p) {
    	this.parking = p;
    	this.parkingTiers = new ArrayList<>();
    }
    
    public void garerVehicule(Ticket t) {
        if(t.getP().equals(parking)) {
        	parking.ajouterVehicule(t.getNumEmplacement(), t.getV());
        	 t.getV().setEstGare(true);
        }else if(t.client instanceof SuperAbonne) {
        	for(Parking p2 : parkingTiers) {
        		if(t.getP().equals(p2)) {
                	p2.ajouterVehicule(t.getNumEmplacement(), t.getV());
                	 t.getV().setEstGare(true);
                }
        	}
        }else {
        	throw new IllegalAccessError("Pas de place, déso pas déso");
        }
       
    }
    
    /**
     * @param t
    */
    //## operation retirerVehicule(Ticket) 
    public void retirerVehicule(Ticket t) { 
    	
    	if(t.getP().equals(parking)) {
        	parking.retirerVehicule(t.getNumEmplacement(), t.getV());
        	t.getV().setEstGare(false);
        }else {
        		for(Parking p2 : parkingTiers) {
        			if(t.getP().equals(p2)) {
        				p2.retirerVehicule(t.getNumEmplacement(), t.getV());
        				t.getV().setEstGare(false);
        			}
        		}        	
        }
    }
    
    //## operation verifPlaceDispo() 
    public boolean verifPlaceDispo(Vehicule v, Parking p) { //Renvoie true si il y a une place disponible pour le vehicule v dans le parking p
    	boolean placeDispo = false;
    	
    	if(v.getType().equals(TypeVehicule.Voiture)&&p.placeVoitureDispo()) {  		
    		placeDispo = true;
    	}else if(v.getType().equals(TypeVehicule.DeuxRoues)&&p.placeDeuxRouesDispo()) {  		
    			placeDispo = true;
    		}else if(v.getType().equals(TypeVehicule.PoidsLourd)&&p.placePoidsLourdsDispo()) {  		
    			placeDispo = true;
        		}    	
		return placeDispo;
        
    }
    
   
    public Parking assignerParking(Vehicule v) { // assigne un parking p à un vehicule v
    	
    	if (this.verifPlaceDispo(v, this.parking)) {
    		return this.parking;
    	}else {
    		for(Parking p2 : this.parkingTiers) {
    			if (this.verifPlaceDispo(v, p2)) {
    	    		return p2;
    	    	}
    		}    		
    	}   	
    	throw new IllegalAccessError("Aucune place dans aucun parking :(");
    	
    }
    
    
    
    
    
    public int assignerNewEmplacement(Vehicule v, Parking p) { // assigne un emplacement à un vehicule v dans un parking p, renvoit le numéro de la place (int)
    	int emplacement = 0;                                   // verification de place disponible dans le parking p necessaire ! 
    	
    	if(v.getType().equals(TypeVehicule.Voiture)) {  		
    		emplacement = p.assignerPlaceVoitureDispo();
    	}else if(v.getType().equals(TypeVehicule.DeuxRoues)) {  		
    			emplacement = p.assignerPlaceDeuxRouesDispo();
    		}else if(v.getType().equals(TypeVehicule.PoidsLourd)) {  		
    				emplacement = p.assignerPlacePoidsLourdsDispo();        		}    	
    	
    	return emplacement;
    }
    
    public void addParkingTier(Parking p) {
    	this.parkingTiers.add(p);
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/DC_Teleporteur.java
*********************************************************************/

