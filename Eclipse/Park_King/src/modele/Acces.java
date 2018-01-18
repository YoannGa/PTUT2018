package modele;

public class Acces {

	private Camera cam;
	
	public boolean checkPresenceVehicule() {
		return this.cam.vehiculePresent();			
	}
	
	public Vehicule identifierVehicule() {	//identifie le type de vehicule et sa plaque d'imatriculation (ici générée aléatoirement)	
		Vehicule v = null;
		int volume = this.cam.scanVehicule();
		if(volume<34) {
			v = new Vehicule(TypeVehicule.DeuxRoues, (Math.random()*100)+"M"+ (Math.random()*100)) ;			
			}else if(volume > 66) {
				v = new Vehicule(TypeVehicule.PoidsLourd, (Math.random()*100)+"C"+ (Math.random()*100)) ;
				}else {
					v = new Vehicule(TypeVehicule.Voiture, (Math.random()*100)+"V"+ (Math.random()*100)) ;
		}
		return v;
	}
	
	
}
