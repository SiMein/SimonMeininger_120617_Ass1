package de.assignment1;

import java.util.ArrayList;


public class GermanCity {  // works like a node
		
	GermanCity prev;	// knows his previous Node in the Graph										
	private int population;   
	private String town;		//
	public ArrayList<GermanCity> arLi = new ArrayList<GermanCity>(); 
	
	public void printArraylist(){
		System.out.println("I am GermanCity " + town + " with connection to :");
		 for(GermanCity arLi_i:arLi) {
	         System.out.println(arLi_i.getTown() + ", " + arLi_i.getPopulation());
		 }
		 System.out.println("\n)");
	}
	public ArrayList getArLi() {
		return arLi;
	}
	
	public GermanCity (int population, String town) {   // explicit standard constructor
		prev = null;
		this.population = population;
		this.town = town;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	public int getPopulation() {
		return population;
	}
	public String getTown() {
		return town;
	}	
	public void setPrev(GermanCity n) {
		this.prev = n;
	}
	public GermanCity getPrev() {
		return this.prev;
	}
	public GermanCity getPrevPrev() {
		return prev.getPrev();
	}
}
