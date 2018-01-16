package modele;

public class Acces {

	private Camera cam;
	
	public boolean checkPresenceVehicule() {
		return this.cam.vehiculePresent();			
	}
	
	public Vehicule identifierVehicule() {		
		Vehicule v = null;
		int volume = this.cam.scanVehicule();
		if(volume<34) {
			v = new Vehicule("DeuxRoues") ;
			}else if(volume > 66) {
				v = new Vehicule(PoidsLourd) ;
				}else {
					v = new Vehicule(Voiture) ;
		}
		return v;
	}
	
	
}
