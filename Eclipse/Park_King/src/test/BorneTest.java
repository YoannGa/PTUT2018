package test;

import static org.junit.Assert.*;

import org.junit.Test;

import modele.Borne;
import modele.Parking;
import modele.Ticket;
import modele.TypeVehicule;
import modele.Vehicule;

public class BorneTest {
	
	Borne maB;
	
	public Borne creerBorne() {
		return new Borne();
	}

	public Borne creerBornePark(Parking p) {
		return new Borne(p);
	}

	@Test
	public void testActiverGarer() {
		Parking p=new Parking();
		Vehicule v = new Vehicule(TypeVehicule.Voiture);
		Ticket t = new Ticket(v ,p , 1);
		maB = creerBornePark(p);
		assertFalse("ne devrai pas etre la",p.vehiculePresent(v));
		maB.activerGarer(t);
		assertTrue("Est la",p.vehiculePresent(v));
	}

	@Test
	public void testActiverRetrait() {
		fail("Not yet implemented");
	}

	@Test
	public void testDemanderPaiement() {
		fail("Not yet implemented");
	}

	@Test
	public void testNouveauTicket() {
		fail("Not yet implemented");
	}

	@Test
	public void testRendreTicket() {
		fail("Not yet implemented");
	}

	@Test
	public void testVerifValiditeTicket() {
		fail("Not yet implemented");
	}

}
