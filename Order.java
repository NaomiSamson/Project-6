package Order;

import java.util.Date;
import java.util.List;
import java.util.Random;

import beverage.Beverage;
import bevshop.Customer;
import bevshop.Day;
import bevshop.Size;
import bevshop.Type;

public class Order implements OrderInterface, Comparable {
	
	private int orderNum;
	private String orderTime;
	private Day orderDay;
	private Customer customer;
	private List<Beverage> listBeverage;
	
	
	
	public Order(String orderTime, Day orderDay, Customer customer, List<Beverage> listBeverage) {
		super();
		this.orderTime = orderTime;
		this.orderDay = orderDay;
		this.customer = customer;
		this.listBeverage = listBeverage;
	}



	public  int generateRandomNum() {
		
		Random random= new Random();
		int num=random.nextInt(5);
		orderNum =num;
		return num;
	}



	@Override
	public boolean isWeekend() {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public Beverage getBeverage(int itemNo) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void addNewBeverage(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void addNewBeverage(String bevName, Size size) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void addNewBeverage(String bevName, Size size, int numOfFruits, boolean addProtein) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public double calcOrderTotal() {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public int findNumOfBeveType(Type type) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public String toString() {
		
		String orderData = orderNum+"\n"+orderTime+"\n "+orderDay+"\n "+customer.getName()+"\n "+customer.getAge()+"\n";
		StringBuffer beverageData= new StringBuffer("");
		System.out.println("Total on the Order:"+listBeverage.size());
		for(Beverage b : listBeverage)
		{
			String data=b.getBeverageName()+"\n "+b.getBeverageType()+"\n "+b.getSize()+"\n "+b.getBASE_PRICE()+"\n "+b.getSize_PRICE();
		         beverageData.append(data);
		}
		return orderData.concat(beverageData.toString());
	}



	@Override
	public int compareTo(Object o) {
		Order order =(Order)o;
		if(order.orderNum<this.orderNum)
		{
			return 1;
		}
		
		return 0;
	}



	public int getOrderNum() {
		return orderNum;
	}



	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}



	public String getOrderTime() {
		return orderTime;
	}



	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}



	public Day getOrderDay() {
		return orderDay;
	}



	public void setOrderDay(Day orderDay) {
		this.orderDay = orderDay;
	}



	public Customer getCustomer() {
		return customer;
	}



	public void setCustomer(Customer customer) {
		this.customer = customer;
	}



	public List<Beverage> getListBeverage() {
		return listBeverage;
	}



	public void setListBeverage(List<Beverage> listBeverage) {
		this.listBeverage = listBeverage;
	}

}

