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
		Parking p=new Parking();
		Vehicule v = new Vehicule(TypeVehicule.Voiture);
		Ticket t = new Ticket(v ,p , 1);
		maB = creerBornePark(p);
		assertFalse("ne devrai pas etre la",p.vehiculePresent(v));
		maB.activerGarer(t);
		assertTrue("Est la",p.vehiculePresent(v));
		
		maB.activerRetrait(t);
		assertFalse("ne devrai pas etre la",p.vehiculePresent(v));

		
	}

	@Test
	public void testNouveauTicket() {
		
		Vehicule v = new Vehicule(TypeVehicule.Voiture);
		Parking p=new Parking();
		
		maB = creerBornePark(p);
		
		Ticket t1 = null;
		Ticket t2 = new Ticket(v, p, 1);
		assertFalse("doit etre null",t2.equals(t1));
		t1 = maB.nouveauTicket(v);
		assertTrue("doit pas etre null",t1.getP().equals(t2.getP()));
		assertTrue("doit pas etre null",t1.getV().equals(t2.getV()));

	}


	@Test
	public void testVerifValiditeTicket() {
		Parking p=new Parking();
		Vehicule v = new Vehicule(TypeVehicule.Voiture);
		Ticket t = new Ticket(v ,p , 1);
		maB = creerBornePark(p);
		maB.activerGarer(t);
		assertTrue("Est valide", maB.verifValiditeTicket(t));
		maB.activerRetrait(t);
		assertFalse("est pas valide",maB.verifValiditeTicket(t));
	}

}
