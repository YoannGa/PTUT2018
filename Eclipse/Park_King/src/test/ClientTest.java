package test;

import static org.junit.Assert.*;

import org.junit.Test;

import modele.Borne;
import modele.Client;
import modele.TypeVehicule;
import modele.Vehicule;

public class ClientTest {

	Client monC;
	
	protected Client creerClient() {
		return new Client();
	}
	

	
	@Test
	public void testClientString() {
		monC = creerClient();
		assertEquals("Bob",monC.getName());
	}

	@Test
	public void testDermanderTicket() {
		monC = creerClient();
		int nbTicket = monC.getListeTickets().size();
		Borne b = new Borne();
		Vehicule v1 = new Vehicule(TypeVehicule.Voiture);

		monC.demanderTicket(b, v1);
		assertEquals(nbTicket+1,monC.getListeTickets().size());
	}

	@Test
	public void testInsererTicket() {
		fail("Not yet implemented");
	}

	@Test
	public void testPayer() {
		fail("Not yet implemented");
	}

	@Test
	public void testRecupVehicule() {
		fail("Not yet implemented");
	}

}
