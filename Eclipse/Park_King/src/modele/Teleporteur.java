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
    
    protected Borne itsDC_Borne;		//## link itsDC_Borne 
    
    /*
    protected LinkedList<DC_Parking> itsDC_Parking = new LinkedList<DC_Parking>();		//## link itsDC_Parking 
    
    protected DC_Parking itsDC_Parking_1;		//## link itsDC_Parking_1 
    */
    
    /**
     * @param v
     * @param emplacement
    */
    //## operation garerVehicule(Vehicule,int) 
    public void garerVehicule(Vehicule v, int emplacement) {
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
    public boolean verifPlaceDispo() {
		return false;
        //#[ operation verifPlaceDispo() 
        //#]
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/DC_Teleporteur.java
*********************************************************************/

