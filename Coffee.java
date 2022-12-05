package beverage;

import bevshop.Size;
import bevshop.Type;

public  class Coffee extends Beverage {

private boolean extraCoffee;
private boolean extraSyrup;
private final double ADDITIONAL_COST = 0.5;

	public Coffee(String beverageName, Type beverageType, Size size) {
		super(beverageName, beverageType, size);
	}
	
	
	
	public Coffee(String beverageName, Type beverageType, Size size, boolean extraCoffee, boolean extraSyrup) {
		super(beverageName, beverageType, size);
		this.extraCoffee = extraCoffee;
		this.extraSyrup = extraSyrup;
	}



	@Override
		public String toString() {
		double price ;
		
		    if(extraCoffee || extraSyrup)
		    {
		    	price=getBASE_PRICE() + ADDITIONAL_COST;
		    }else
		    {
		    	price=getBASE_PRICE();
		    }
		    String completeValue= getBeverageName() +" "+ getBeverageType() +" "+price;
			return completeValue;
		}
	
	@Override
		public double calcPrice() {
			return 0;
		}
	
	@Override
	public boolean equals(Object obj) {
		
		Coffee b = (Coffee) obj; 
		
		if((b.getBeverageName().equals(this.getBeverageName()))&&(b.getBeverageType().equals(this.getBeverageType()) &&  b.getSize()==this.getSize()))
				{
			   return true;
				}
		else
		{
			return false;
		}
	}

	public boolean isExtraCoffee() {
		return extraCoffee;
	}

	public void setExtraCoffee(boolean extraCoffee) {
		this.extraCoffee = extraCoffee;
	}

	public boolean isExtraSyrup() {
		return extraSyrup;
	}

	public void setExtraSyrup(boolean extraSyrup) {
		this.extraSyrup = extraSyrup;
	}

	public double getADDITIONAL_COST() {
		return ADDITIONAL_COST;
	}


}
