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
		Borne b = new Borne();
		Vehicule v1 = new Vehicule(TypeVehicule.Voiture);
		
		int nbTicket = monC.getListeTickets().size();

		monC.demanderTicket(b, v1);
		assertEquals(nbTicket+1,monC.getListeTickets().size());
	}


	@Test
	public void testRecupVehicule() {
		
	}

}
