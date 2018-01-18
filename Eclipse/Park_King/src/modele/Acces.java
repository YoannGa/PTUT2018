package modele;

public class Acces {

	private Camera cam;
	
	public Acces(){
		this.cam = new Camera();
	}
	
	public boolean checkPresenceVehicule() {
		return this.cam.vehiculePresent();			
	}
	
	public Vehicule identifierVehicule() {	//identifie le type de vehicule et sa plaque d'imatriculation (ici générée aléatoirement)	
		Vehicule v = null;
		int volume = this.cam.scanVehicule();
		if(volume<34) {
			v = new Vehicule(TypeVehicule.DeuxRoues, (int)(Math.random()*100)+"MO"+ (int)(Math.random()*100)) ;			
			}else if(volume > 66) {
				v = new Vehicule(TypeVehicule.PoidsLourd, (int)(Math.random()*100)+"CA"+ (int)(Math.random()*100)) ;
				}else {
					v = new Vehicule(TypeVehicule.Voiture, (int)(Math.random()*100)+"VOI"+ (int)(Math.random()*100)) ;
		}
		return v;
	}
	
	
}
