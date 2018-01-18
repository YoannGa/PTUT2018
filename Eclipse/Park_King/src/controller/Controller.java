package controller;

import java.util.ArrayList;

import modele.*;

public class Controller {

	public static void main(String[] args) {		
			ArrayList<Client> arClient;
			Borne b = new Borne();
			Parking p = new Parking (1,2,1);
			Teleporteur tp = b.getTp();
			tp.addParkingTier(p);
			
		}


}


