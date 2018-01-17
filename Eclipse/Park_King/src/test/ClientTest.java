package test;

import static org.junit.Assert.*;

import org.junit.Test;

import modele.Borne;
import modele.Client;

public abstract class ClientTest {

	Client monC;
	
	abstract protected Client creerClient();

	
	@Test
	public void testClientString() {
		monC = creerClient();
		assertEquals("Robert",monC.getName());
	}

	@Test
	public void testDermanderTicket() {
		monC = creerClient();
		int nbTicket = monC.getListeTickets().size();
		Borne b = new Borne();
		monC.dermanderTicket(b);
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
