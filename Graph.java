package de.assignment1;

public class Graph {
		
	private GermanCity first;
	private GermanCity last;
	private int count;     // size of Nodes in the Graph
		
	public Graph() {
		this.first = null;
		this.last = null;
		count = 0;
	}
	public GermanCity getLast() {
		return this.last;
	}
	public GermanCity getGermanCityAtIndex(int index) {
		GermanCity temp = last;
		int i = 0;
		while (i != index || (temp == null) ) {
			i++;
			temp = temp.getPrev();			
		}
		return temp;
	}
		
	public void addGermanCity( GermanCity n) {
		if (count == 0) {
			first = n;
			last = first;
			count++;
		} else {
			n.setPrev(last);
			last = n;
			count++;			
		}
	}	
	public void pop() {
		if (count == 0) {
			System.out.println("List was empty. nothing to delete.");
		}
		if (count == 1) {
			first = null;
			last = null;
			count = 0;
		} else {
			if (count > 1)
				last = last.getPrev();
				count--;
		}
	}	
	public void getCount() {
		System.out.println("Graphsize is: " + count);
	}
	public void printFiLa() {
		System.out.println("printfila First Node :" + first.getPopulation());
		System.out.println("printfila Last Node : " + last.getPopulation());		
	}
	public void printAll() {
		GermanCity nLauf = last;
		while (nLauf != null) {
			System.out.println("printAll (Nodes in the graph) :  " 
				 + nLauf.getTown() + ", "+ (nLauf.getPopulation()));
			nLauf.printArraylist();	 
			nLauf = nLauf.getPrev();
		}
	}
	public void rekPrintAll(GermanCity inNode) {
		if (inNode == null ) {				
			System.out.println("Liste was empty --nothing to print");
		} else {		
			if (inNode.getPrev() != null) {		
				rekPrintAll(inNode.getPrev());					
			} 									
			System.out.println(inNode.getTown() + ", " + inNode.getPopulation());	// 
		}									
	} 
}