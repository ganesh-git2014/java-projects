/* CRITTERS Main.java
 * EE422C Project 4 submission by
 * Robert (Connor) Byron
 * rcb2746
 * 76550
 * Joel Guo
 * jg55475
 * 76550
 * Slip days used: 0 (+1 for this project)
 * Fall 2015
 */
package project4;

public class Jon extends Critter {

	@Override
	public String toString() { return "J"; }
	
	@Override
	public void doTimeStep() {
		// Valvano walks around randomly
		walk(Critter.getRandomInt(7));
		Jon child = new Jon();
		// like father like son
		reproduce(child, Critter.getRandomInt(7));
	}

	@Override
	public boolean fight(String opponent) {
		// Valvano likes to participate in casual friendly fights
		char c = opponent.charAt(0); 
		if (c % 2 == 0) { return true; }
		return false;
	}

}