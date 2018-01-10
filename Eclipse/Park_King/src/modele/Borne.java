package modele;

public class Borne {
	private Camera maCam;
	private Teleporteur monTP;
	
	public Borne(){
		
	}

	public Camera getMaCam() {
		return maCam;
	}
	public void setMaCam(Camera maCam) {
		this.maCam = maCam;
	}
	public Teleporteur getMonTP() {
		return monTP;
	}
	public void setMonTP(Teleporteur monTP) {
		this.monTP = monTP;
	}
	
	public void retirerVehicule(Ticket t){
		//TODO
	}
	public void ajouterVehicule(Vehicule v){
		//TODO
	}
	
	public void demanderPaiement(){
		//TODO
	}
	
	public boolean verifPlaceDispo(Vehicule v){
		return false;
		//TODO
	}
	
	public Ticket nouveauTicket(){
		return null;
		//TODO
	}
	
	public void delivrerTicket(Ticket t){
		//TODO
	}
	
	
}
