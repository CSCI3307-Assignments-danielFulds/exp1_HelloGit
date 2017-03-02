/**
 * 
 */
package com.mycompany.exp1.village;

import com.mycompany.exp1.village.HasVillagers;

/**
 * @author Dan Fulds
 *
 */
public class Village implements HasVillagers, GrowingVillage{
	private int numberOfVillagers;
	
	public Village(int numberOfVillagers){
		this.numberOfVillagers = numberOfVillagers;
	}
	
	@Override
	public int countOfVillagers() {
		return numberOfVillagers;
	}
	
	public int addVillagers(int addVillagers) {
		numberOfVillagers += addVillagers;
		return numberOfVillagers;
	}
}
