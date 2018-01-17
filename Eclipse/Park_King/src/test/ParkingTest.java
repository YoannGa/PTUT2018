package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import modele.Parking;
import modele.TypeVehicule;
import modele.Vehicule;

public class ParkingTest {

	Parking monP;
	
	@Test
	public Parking creerParking() {
		return new Parking(2, 2, 2);
	}
	
	@Test
	public void testAjouterVehicule() {
		monP = creerParking();
		Vehicule v = new Vehicule("tuttut");
		v.setType(TypeVehicule.Voiture);
		//monP.ajouterVehicule(1,);
	}

	//modifier
	@Test
	public void testEstPlein() {
		fail("Not yet implemented");
	}

}
