package bevshop;

import java.util.ArrayList;
import java.util.List;

import Order.Order;
import beverage.Alcohol;
import beverage.Beverage;
import beverage.Coffee;
import beverage.Smoothie;

public class BevShop implements BevShopInterface {
	
	private Order currentOrder;
	private List<Order> orderList =new ArrayList();
	List<Beverage> beverages =new ArrayList<>();
	int noOfAlcoholOrder =0;
	
	@Override
	public String toString() {
		StringBuffer orderData=new StringBuffer("");
		for(Order order : orderList)
		{
		   orderData.append(order);
		}
		StringBuffer BevShopData = orderData.append(totalMonthlySale());
		return BevShopData.toString();
	}

	@Override
	public boolean isValidTime(int time) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getMaxNumOfFruits() {
		return BevShopInterface.MAX_FRUIT;
	}

	@Override
	public int getMinAgeForAlcohol() {
		return BevShopInterface.MIN_AGE_FOR_ALCOHOL;
	}

	@Override
	public boolean isMaxFruit(int numOfFruits) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getMaxOrderForAlcohol() {
		return BevShopInterface.MAX_ORDER_FOR_ALCOHOL;
	}

	@Override
	public boolean isEligibleForMore() {
		if(orderList.size()<3)
		{
			return true;
		}else
		{
			return false;
		}
		}
	

	@Override
	public int getNumOfAlcoholDrink() {
		int numAlcohol =0;
		
		for(Order order :orderList)
		{
			List<Beverage> list= order.getListBeverage();
			
			for(Beverage b : list)
			{
				if(b.getBeverageType()  == Type.ALCOHOL)
				{
					numAlcohol++;
				}
			}
		}
		return numAlcohol;
		
	}

	@Override
	public boolean isValidAge(int age) {
		boolean isValid = false;
		for(Order order :orderList)
		{
			if(order.getCustomer().getAge()<=getMinAgeForAlcohol())
					{
				      isValid= true;
					}else
					{
						isValid= false;
					}
		}
		return isValid;
		
	}

	@Override
	public void startNewOrder(String time, Day day, String customerName, int customerAge) {
      
		
		Customer customer =new Customer(customerName, customerAge);
		
		
		 currentOrder=new Order(time, day, customer, beverages);
		 System.out.println("Total on the Order :" +new Float(beverages.size()));
		 
		 System.out.println(currentOrder.getCustomer().getName());
		 System.out.println(currentOrder.getCustomer().getAge());
		
		
	}

	@Override
	public void processCoffeeOrder(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
		System.out.println("Add a COFFEE to order");
		Coffee coffee= new Coffee(bevName, Type.COFFEE, size, extraShot, extraSyrup);
	      beverages.add(coffee);
	      System.out.println("Total on the Order :" +new Float(beverages.size()));
	}

	@Override
	public void processAlcoholOrder(String bevName, Size size) {
		
		if( currentOrder.getCustomer().getAge()>= MIN_AGE_FOR_ALCOHOL) {
		boolean isWeekEndOffer =false;
		if(currentOrder.getOrderDay().equals(Day.SATURDAY)|| currentOrder.equals(Day.SUNDAY))
		{
			isWeekEndOffer =true;
		}
		
		Alcohol alcohol =new Alcohol(bevName, Type.ALCOHOL, size,isWeekEndOffer);
		
		if(noOfAlcoholOrder<MAX_ORDER_FOR_ALCOHOL) {
		
		beverages.add(alcohol);
		noOfAlcoholOrder++;
        currentOrder.setListBeverage(beverages);
	    
	    System.out.println("Total on the Order :" +new Float(beverages.size()));
	    System.out.println(isWeekEndOffer);
		} if(noOfAlcoholOrder==MAX_ORDER_FOR_ALCOHOL)
		{
			System.out.println("Maximum Alcohol Drink for this order");
		}
		}else {
			System.out.println("Age should equal or greather than 21 for Order Alcohol");
		}
		
	    
	    
	    
	    
		
	}

	@Override
	public void processSmoothieOrder(String bevName, Size size, int numOfFruits, boolean addProtein) {
        System.out.println("Add a SMOOTHIE to order");
		   
		Smoothie smoothie= new Smoothie(bevName, Type.SMOOTHIE, size, numOfFruits, addProtein);
	      beverages.add(smoothie);
	      System.out.println("Total on the Order :" +new Float(beverages.size()));
	}


	@Override
	public int findOrder(int orderNo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double totalOrderPrice(int orderNo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double totalMonthlySale() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int totalNumOfMonthlyOrders() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Order getCurrentOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order getOrderAtIndex(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void sortOrders() {
		// TODO Auto-generated method stub
		
	}

}
