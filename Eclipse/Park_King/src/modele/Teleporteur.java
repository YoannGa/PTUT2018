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
    public void garerVehicule(Ticket t) {
        //#[ operation garerVehicule(Vehicule,int) 
        //#]
    }
    
    /**
     * @param t
    */
    //## operation retirerVehicule(Ticket) 
    public void retirerVehicule(Ticket t) {
        //#[ operation retirerVehicule(Ticket) 
        //#]
    }
    
    //## operation verifPlaceDispo() 
    public boolean verifPlaceDispo(Vehicule v, Parking p) {
    	boolean placeDispo = false;
    	
    	if(v.getType().equals("Voiture")&&p.placeVoitureDispo()) {  		
    		placeDispo = true;
    	}else if(v.getType().equals("DeuxRoues")&&p.placeDeuxRouesDispo()) {  		
    			placeDispo = true;
    		}else if(v.getType().equals("PoidsLourds")&&p.placePoidsLourdsDispo()) {  		
    			placeDispo = true;
        		}    	
		return placeDispo;
        
    }
    
   
    public Parking assignerParking(Vehicule v) {
    	Parking p = null;
    	if (this.verifPlaceDispo(v, this.parking)) {
    		p = this.parking;
    	}else {
    		for(Parking p2 : this.parkingTiers) {
    			if (this.verifPlaceDispo(v, p2)) {
    	    		p = this.parking;
    	    	}
    		}
    		
    	}    	
    	return p;
    }
    
    
    
    
    
    public int assignerNewEmplacement(Vehicule v, Parking p) {
    	int emplacement = 0;
    	
    	if(v.getType().equals("Voiture")&&p.placeVoitureDispo()) {  		
    		emplacement = p.assignerPlaceVoitureDispo();
    	}else if(v.getType().equals("DeuxRoues")&&p.placeDeuxRouesDispo()) {  		
    			emplacement = p.assignerPlaceDeuxRouesDispo();
    		}else if(v.getType().equals("PoidsLourds")&&p.placePoidsLourdsDispo()) {  		
    				emplacement = p.assignerPlacePoidsLourdsDispo();        		}    	
    	
    	return emplacement;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/DC_Teleporteur.java
*********************************************************************/

