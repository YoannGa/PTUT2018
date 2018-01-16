/*********************************************************************
	Rhapsody	: 8.1.5
	Login		: yoann.gathignol
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: DC_Camera
//!	Generated Date	: Thu, 11, Jan 2018 
	File Path	: DefaultComponent/DefaultConfig/Default/DC_Camera.java
*********************************************************************/

package modele;


//----------------------------------------------------------------------------
// Default/DC_Camera.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class DC_Camera 
public class Camera {
    
    protected Vehicule v;		//## link itsDC_Borne 
    
    
    //## operation scanVehicule() 
    public int scanVehicule() {
    	return (int) (Math.random() * 100);
    }
    
    

    public boolean vehiculePresent() {
    	
    	return false; 
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/DC_Camera.java
*********************************************************************/

