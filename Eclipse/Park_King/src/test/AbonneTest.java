package test;

import static org.junit.Assert.*;

import org.junit.Test;

import modele.Abonne;

public class AbonneTest {

	protected Abonne creerAbonne(String nom) {
		return new Abonne(nom);
		
	}
	
	@Test
	public void testAbonne() {
		Abonne p1 = creerAbonne("Bob");
	}

	@Test
	public void testMakeEntretien() {
		fail("Not yet implemented");
	}

	@Test
	public void testMakeMaintenance() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetLivraison() {
		fail("Not yet implemented");
	}

}
