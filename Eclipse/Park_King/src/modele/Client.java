package modele;

import java.util.ArrayList;

public class Client {
	private String name;
	private ArrayList<Ticket> mesTicket;
	
	public Client(){
		this.name = "Jean-Robert";
		this.mesTicket = new ArrayList<Ticket>();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public ArrayList<Ticket> getMesTicket() {
		return mesTicket;
	}
	public void setMesTicket(ArrayList<Ticket> mesTicket) {
		this.mesTicket = mesTicket;
	}
	public void addTicket(Ticket t){
		this.mesTicket.add(t);
	}
	public void removeTicket(Ticket t){
		this.mesTicket.remove(t);
	}
	
	public void payer(){
		//TODO
	}
	
	public void recupererVehicule(){
		//TODO
	}
	
	public void insererTicket(Borne b){
		//TODO
	}
	
	public void seGarer(){
		//TODO
	}
	
	public void demanderTicket(Borne b){
		//TODO
	}
}
