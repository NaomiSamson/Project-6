package beverage;

import bevshop.Size;
import bevshop.Type;

public  class Alcohol extends Beverage {
	
	private boolean isOfferWeekend;
	private final double  costAddOnWeekend = 0.60;

	public Alcohol(String beverageName, Type beverageType, Size size) {
		super(beverageName, beverageType, size);
		
	}

	
	
	public Alcohol(String beverageName, Type beverageType, Size size, boolean isOfferWeekend
			) {
		super(beverageName, beverageType, size);
		this.isOfferWeekend = isOfferWeekend;
		
	}



	@Override
	public String toString() {
		
		String alcoholData = getBeverageName()+" "+getSize()+" "+isOfferWeekend+" "+costAddOnWeekend;
		return alcoholData;
	}
	
	@Override
	public boolean equals(Object obj) {

		Alcohol b = (Alcohol) obj; 
		
		if((b.getBeverageName().equals(this.getBeverageName()))&&(b.getBeverageType().equals(this.getBeverageType()) &&  b.getSize()==this.getSize()) &&b.isOfferWeekend==this.isOfferWeekend && b.costAddOnWeekend==this.costAddOnWeekend)
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

	public boolean isOfferWeekend() {
		return isOfferWeekend;
	}

	public void setOfferWeekend(boolean isOfferWeekend) {
		this.isOfferWeekend = isOfferWeekend;
	}

	

}
