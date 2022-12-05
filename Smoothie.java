package beverage;

import bevshop.Size;
import bevshop.Type;

public  class Smoothie extends Beverage {
	
	private int numFruits;
	private boolean isProteinPowderAdded= false;
	private final double costAddProtein = 1.50;
	private final double costAddFruit = 0.50;

	public Smoothie(String beverageName, Type beverageType, Size size) {
		super(beverageName, beverageType, size);
	}
	
	

	
	
	public Smoothie(String beverageName, Type beverageType, Size size, int numFruits, boolean isProteinPowderAdded) {
		super(beverageName, beverageType, size);
		this.numFruits = numFruits;
		this.isProteinPowderAdded = isProteinPowderAdded;
	}





	@Override
	public String toString() {
		
		String smoothieData = getBeverageName()+" "+getSize()+" "+isProteinPowderAdded+" "+numFruits+" "+costAddFruit;
		return smoothieData;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		Smoothie b = (Smoothie) obj; 
		
		if((b.getBeverageName().equals(this.getBeverageName()))&&(b.getBeverageType().equals(this.getBeverageType()) &&  b.getSize()==this.getSize()) &&b.numFruits==this.numFruits && b.isProteinPowderAdded==this.isProteinPowderAdded && b.costAddFruit==this.costAddFruit)
				{
			   return true;
				}
		else
		{
			return false;
		}
		
	}
	
	@Override
	public double calcPrice() {
		return 0;
	}

	public int getNumFruits() {
		return numFruits;
	}

	public void setNumFruits(int numFruits) {
		this.numFruits = numFruits;
	}

	public boolean isProteinPowderAdded() {
		return isProteinPowderAdded;
	}

	public void setProteinPowderAdded(boolean isProteinPowderAdded) {
		this.isProteinPowderAdded = isProteinPowderAdded;
	}

	public double getCostAddProtein() {
		return costAddProtein;
	}

	public double getCostAddFruit() {
		return costAddFruit;
	}
	
	

	

}
