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
	public CreditCard(int cN, double l, double b, double iR, String hN)
	{
		cardNum = cN;
		limit = l;
		balance = b;
		interestRate = iR;
		holderName = hN;
	}
	
	//Methods
	public void charge(double charge)
	{
		if (charge < limit)
		{
			balance+=charge;
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
		return "Card Number: " + cardNum + " Name: " + holderName + " Balance: " + balance + " Rate: " + interestRate + " Limit: " + limit;
	}
}