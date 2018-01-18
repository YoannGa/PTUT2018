/*********************************************************************
	Rhapsody	: 8.1.5
	Login		: yoann.gathignol
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: DC_Borne
//!	Generated Date	: Thu, 11, Jan 2018 
	File Path	: DefaultComponent/DefaultConfig/Default/DC_Borne.java
*********************************************************************/

package modele;

import java.util.ArrayList;

//----------------------------------------------------------------------------
// Default/DC_Borne.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class DC_Borne 
public class Borne {
    

    protected Teleporteur tp;		//## attribute tp 
    
    protected Acces a;
   
    protected ArrayList<Vehicule> listeVehiculeEnEntretiens;
    
    protected ArrayList<Vehicule> listeVehiculeALivrer;
    
    public Borne() {
    	this.tp = new Teleporteur();
    	this.a = new Acces();
    	
    }
    
    public Borne(Parking p) {
    	this.tp = new Teleporteur(p);
    	this.a = new Acces();
    	
    }
    
    public Vehicule idVehicule() {
    	return a.identifierVehicule();
    }
    
    /**
     * @param t
    */
    //## operation activerGarer(Ticket) 
    public void activerGarer(Ticket t) {
        this.tp.garerVehicule(t);
    }
    
    /**
     * @param t
    */
    //## operation activerRetrait(Ticket) 
    public void activerRetrait(Ticket t) {
        this.tp.retirerVehicule(t);
    }
    
    /**
     * @param t
    */
    //## operation demanderPaiement(Ticket) 
    public void demanderPaiement(Ticket t) {
        System.out.println("Veuillez payer.");
        
    }
    
    
    
    /**
     * @param c
    */
    //## operation nouveauTicket(Client) 
    public Ticket nouveauTicket(Vehicule v) {    	
    	Parking p = this.tp.assignerParking(v);
    	int emplacement = this.tp.assignerNewEmplacement(v, p);
    	Ticket t = new Ticket( v, p, emplacement);  
    	return t;    	
    }
    
    
    //## operation rendreTicket() 
    public void rendreTicket() {
       System.out.println("Operation invalide. Reprenez le ticket.");
    }
    
    /**
     * @param p
    */
    
    
    /**
     * @param t
    */
    //## operation verifValiditeTicket(Ticket) 
    public boolean verifValiditeTicket(Ticket t) {
    	return t.getP().vehiculePresent(t.getV());
    }
    
     public void ajouterVehiculeEntretien(Vehicule v) {    	
    	this.listeVehiculeEnEntretiens.add(v);
    }
     
     public void ajouterVehiculeLivraison(Vehicule v, String date, String lieu) {
    	v.setHeureDeLivraison(date);
    	v.setLieuDeLivraison(lieu);
     	this.listeVehiculeALivrer.add(v);
     }

	public Teleporteur getTp() {
		return tp;
	}

	public void setTp(Teleporteur tp) {
		this.tp = tp;
	}

	public Acces getA() {
		return a;
	}

	public void setA(Acces a) {
		this.a = a;
	}

	public ArrayList<Vehicule> getListeVehiculeEnEntretiens() {
		return listeVehiculeEnEntretiens;
	}

	public void setListeVehiculeEnEntretiens(ArrayList<Vehicule> listeVehiculeEnEntretiens) {
		this.listeVehiculeEnEntretiens = listeVehiculeEnEntretiens;
	}

	public ArrayList<Vehicule> getListeVehiculeALivrer() {
		return listeVehiculeALivrer;
	}

	public void setListeVehiculeALivrer(ArrayList<Vehicule> listeVehiculeALivrer) {
		this.listeVehiculeALivrer = listeVehiculeALivrer;
	}
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/DC_Borne.java
*********************************************************************/

