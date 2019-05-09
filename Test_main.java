package de.assignment1;

public class Test_main {
	
	public static void main(String[] args) {
													
		GermanCity weimar = new GermanCity(65000, "Weimar");   // first step- make instances of GermanCity
		GermanCity erfurt = new GermanCity(210000, "Erfurt");  // first assignment in Constructor
		GermanCity leipzig = new GermanCity(560000, "Leipzig");// Name will not change -there is no setter
		GermanCity berlin = new GermanCity(3500000,"Berlin");  // Population can change -you have a setter
		GermanCity hamburg = new GermanCity(1800000,"Hamburg");
		GermanCity cologne = new GermanCity(1000000, "Cologne");
		GermanCity munich = new GermanCity(1500000, "Munich");
		
		Graph mg1 = new Graph();		// Create (main)-graph with GermanCity (Nodes)			
		mg1.addGermanCity(weimar);		// add function for the graph
		mg1.addGermanCity(erfurt);
		mg1.addGermanCity(leipzig);
		mg1.addGermanCity(berlin);
		mg1.addGermanCity(hamburg);
		mg1.addGermanCity(cologne);
		mg1.addGermanCity(munich);
		
		weimar.getArLi().add(berlin);	// every node (GermanCity) has its
		weimar.getArLi().add(leipzig);	// own graph of nodes (GermanCity)	
		erfurt.getArLi().add(weimar);	// build with an ArrayList
		erfurt.getArLi().add(leipzig);	// you can use the standard -commands 	
		leipzig.getArLi().add(munich);  // of ArrayList (.add .set .remove ...)
		leipzig.getArLi().add(hamburg);	// so this is the 2nd-level-graph	
		berlin.getArLi().add(munich);
		berlin.getArLi().add(hamburg);		
		hamburg.getArLi().add(munich);
		hamburg.getArLi().add(berlin);
		hamburg.getArLi().add(cologne);		
		cologne.getArLi().add(erfurt);
		cologne.getArLi().add(leipzig);	
		munich.getArLi().add(erfurt);
		munich.getArLi().add(berlin);
							
		
		mg1.printAll();					// Full-printmethod   maingraph + 2nd level graph of the nodes
										// printmethod from graph calls also the print from 2nd level graphs
		
													// more funktions of the graph
 		mg1.getCount();									// counts the nodes in the graph	
		mg1.rekPrintAll(mg1.getLast()); 			 // a alternative print out function
		System.out.println("\n" + mg1.getGermanCityAtIndex(6).getTown() + "\n");  // (counts backwards to valid Index)  
																	
		mg1.pop();				// delete the last Node --works like a stack of Nodeattributes
		mg1.getCount();		
		mg1.rekPrintAll(mg1.getLast());
	}		// at least -you see in the console the informations about the graph and the nodes
}			// unfortunaly, afer many try and tests the output with graphviz has not worked :(


