package test;

import static org.junit.Assert.*;

import org.junit.Test;

import modele.Parking;
import modele.TypeVehicule;
import modele.Vehicule;

public class ParkingTest {

	Parking monP;

	public Parking creerParking() {
		return new Parking(2, 2, 2);
	}
	public Parking creerParkingB() {
		return new Parking();
	}
	public Parking creerParkingVide() {
		return new Parking(0, 0, 0);
	}
	
	@Test
	public void testAjouterVehicule() {
		monP = creerParking();
		Vehicule v = new Vehicule(TypeVehicule.Voiture);
		v.setImatriculation("000AA000");
		monP.ajouterVehicule(1,v);
		assertTrue("Est Present",monP.vehiculePresent(v));
	}

	@Test
	public void testEstPlein() {
		monP =creerParking();
		assertTrue("Voiture Vide",monP.placeVoitureDispo());
		assertTrue("Moto Vide",monP.placeDeuxRouesDispo());
		assertTrue("Camion Vide",monP.placePoidsLourdsDispo());
		Vehicule v1 = new Vehicule(TypeVehicule.Voiture);
		Vehicule m1 = new Vehicule(TypeVehicule.DeuxRoues);
		Vehicule c1 = new Vehicule(TypeVehicule.PoidsLourd);
		for(int i=1; i<=monP.getCMax();i++) {
			monP.ajouterVehicule(i, c1);
		}
		for(int i=1; i<=monP.getVMax();i++) {
			monP.ajouterVehicule(i, v1);
		}
		for(int i=1; i<=monP.getMMax();i++) {
			monP.ajouterVehicule(i, m1);
		}
		assertFalse("Voiture Vide",monP.placeVoitureDispo());
		assertFalse("Moto Vide",monP.placeDeuxRouesDispo());
		assertFalse("Camion Vide",monP.placePoidsLourdsDispo());
	}
	
	@Test
	public void testEstPlein2() {
		monP =creerParkingB();
		assertTrue("Voiture Vide",monP.placeVoitureDispo());
		assertTrue("Moto Vide",monP.placeDeuxRouesDispo());
		assertTrue("Camion Vide",monP.placePoidsLourdsDispo());
		Vehicule v1 = new Vehicule(TypeVehicule.Voiture);
		Vehicule m1 = new Vehicule(TypeVehicule.DeuxRoues);
		Vehicule c1 = new Vehicule(TypeVehicule.PoidsLourd);
		for(int i=1; i<=monP.getCMax();i++) {
			monP.ajouterVehicule(i, c1);
		}
		for(int i=1; i<=monP.getVMax();i++) {
			monP.ajouterVehicule(i, v1);
		}
		for(int i=1; i<=monP.getMMax();i++) {
			monP.ajouterVehicule(i, m1);
		}
		assertFalse("Voiture Vide",monP.placeVoitureDispo());
		assertFalse("Moto Vide",monP.placeDeuxRouesDispo());
		assertFalse("Camion Vide",monP.placePoidsLourdsDispo());
	}
	
	@Test
	public void testEstPlein3() {
		monP =creerParkingVide();
		assertFalse("Voiture Vide",monP.placeVoitureDispo());
		assertFalse("Moto Vide",monP.placeDeuxRouesDispo());
		assertFalse("Camion Vide",monP.placePoidsLourdsDispo());
		Vehicule v1 = new Vehicule(TypeVehicule.Voiture);
		Vehicule m1 = new Vehicule(TypeVehicule.DeuxRoues);
		Vehicule c1 = new Vehicule(TypeVehicule.PoidsLourd);
		for(int i=1; i<=monP.getCMax();i++) {
			monP.ajouterVehicule(i, c1);
		}
		for(int i=1; i<=monP.getVMax();i++) {
			monP.ajouterVehicule(i, v1);
		}
		for(int i=1; i<=monP.getMMax();i++) {
			monP.ajouterVehicule(i, m1);
		}
		assertFalse("Voiture Vide",monP.placeVoitureDispo());
		assertFalse("Moto Vide",monP.placeDeuxRouesDispo());
		assertFalse("Camion Vide",monP.placePoidsLourdsDispo());
	}
	
	//TODO test caca a metre dans le tp
	@Test
	public void ajoutSansPlace() {
		monP =creerParkingVide();
		assertFalse("Voiture Vide",monP.placeVoitureDispo());
		Vehicule v1 = new Vehicule(TypeVehicule.Voiture);
		Vehicule m1 = new Vehicule(TypeVehicule.DeuxRoues);
		Vehicule c1 = new Vehicule(TypeVehicule.PoidsLourd);
		monP.ajouterVehicule(1, c1);
		monP.ajouterVehicule(1, v1);
		monP.ajouterVehicule(1, m1);
		assertFalse("N'est pas dedans",monP.vehiculePresent(v1));
		assertFalse("N'est pas dedans",monP.vehiculePresent(m1));
		assertFalse("N'est pas dedans",monP.vehiculePresent(c1));
	}


}
