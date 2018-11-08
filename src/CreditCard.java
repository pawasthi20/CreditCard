/**
 * 
 * @author Parth Awasthi
 *
 */
public class CreditCard 
{
	//Fields
	private int cardNum;
	private double  limit;
	private double balance;
	private double interestRate;
	private String holderName;
	
	//Constructor
	public CreditCard(int cN, double l, double iR, String hN)
	{
		cardNum = cN;
		limit = l;
		balance = 0;
		interestRate = iR;
		holderName = hN;
	}
	
	//Methods
	public void charge(double charge)
	{
		double newBalance = balance + charge;
		if (newBalance < limit)
		{
			balance=newBalance;
		}
	}
	public void credit(double credit)
	{
		balance-=credit;
	}
	public void chargeInterest()
	{
		balance+=(interestRate*balance);
	}
	
	public String toString()
	{
		return "Card Number: " + cardNum + "; Name: " + holderName + "; Balance: " + balance + "; Rate: " + interestRate + "; Limit: " + limit;
	}
	
	//Accessor Methods
	public int getCardNum() 
	{
		return cardNum;
	}
	public double getLimit() 
	{
		return limit;
	}
	public double getBalance() 
	{
		return balance;
	}
	public double getInterestRate() 
	{
		return interestRate;
	}
	public String getHolderName() 
	{
		return holderName;
	}
}