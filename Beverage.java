package beverage;

import bevshop.Size;
import bevshop.Type;

public abstract class Beverage {
	
	private String beverageName;
	private Type beverageType;
	private Size size;
	private final double BASE_PRICE = 2.0;
	private final double Size_PRICE = 1;
	
	public Beverage(String beverageName,Type beverageType,Size size ) {
		
		this.beverageName =beverageName;
		this.beverageType =beverageType;
		this.size =size;

		          
	}
	
	public abstract double calcPrice();
	
	@Override
	public String toString() {
		
		return beverageName+ " "+size ;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		Beverage b = (Beverage) obj; 
		
		if((b.beverageName.equals(this.beverageName))&&(b.beverageType.equals(this.beverageType) &&  b.size==this.size))
				{
			   return true;
				}
		else
		{
			return false;
		}
	}

	public String getBeverageName() {
		return beverageName;
	}

	public void setBeverageName(String beverageName) {
		this.beverageName = beverageName;
	}

	public Type getBeverageType() {
		return beverageType;
	}

	public void setBeverageType(Type beverageType) {
		this.beverageType = beverageType;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public double getBASE_PRICE() {
		return BASE_PRICE;
	}

	public double getSize_PRICE() {
		return Size_PRICE;
	}
	
	

}
